package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class BankCustomer {
	private String name;
	private String address;
	private String phoneNumber;
	private List<Accountable> accounts = new ArrayList<Accountable>();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Object[] getAccounts() {
		return accounts.toArray();
	}

	public void addAccount(Accountable newAccount) {
		accounts.add(newAccount);
	}
	
	public boolean isVip() {
		int totalAssets = 0;
		for (Accountable account: accounts) {
			totalAssets += account.getBalance();
		}
		return totalAssets >= 25000;
	}
}