package com.trade.analytics.model;

@Entity
public class TradeTransaction {

	private String firstName;
	private String lastName;
	private enum nationality {
	};
	private enum countryOfResidence {
		
	};
	private String traderId;
	private String stockId;
	private double amount;
	private String currency;
	private String buySell;
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getTraderId() {
		return traderId;
	}
	
	public void setTraderId(String traderId) {
		this.traderId = traderId;
	}
	
	public String getStockIdl() {
		return stockId;
	}
	
	public void setStockIdl(String stockId) {
		this.stockId = stockId;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public String getCurrency() {
		return currency;
	}
	
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	public String getBuySell() {
		return buySell;
	}

	public void setBuySell(String buySell) {
		this.buySell = buySell;
	}
	
	
}
