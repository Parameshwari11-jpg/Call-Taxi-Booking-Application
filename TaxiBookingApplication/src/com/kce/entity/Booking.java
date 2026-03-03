package com.kce.entity;

public class Booking {
    private int bookingID;
    private int CustomerID;
    private char From;
    private char To;
    private int pickupTime;
    private int dropTime;
    private int Amount;
	public Booking(int bookingID, int customerID, char from, char to, int pickupTime, int dropTime, int amount) {
		super();
		this.bookingID = bookingID;
		CustomerID = customerID;
		From = from;
		To = to;
		this.pickupTime = pickupTime;
		this.dropTime = dropTime;
		Amount = amount;
	}
	public int getBookingID() {
		return bookingID;
	}
	public void setBookingID(int bookingID) {
		this.bookingID = bookingID;
	}
	public int getCustomerID() {
		return CustomerID;
	}
	public void setCustomerID(int customerID) {
		CustomerID = customerID;
	}
	public char getFrom() {
		return From;
	}
	public void setFrom(char from) {
		From = from;
	}
	public char getTo() {
		return To;
	}
	public void setTo(char to) {
		To = to;
	}
	public int getPickupTime() {
		return pickupTime;
	}
	public void setPickupTime(int pickupTime) {
		this.pickupTime = pickupTime;
	}
	public int getDropTime() {
		return dropTime;
	}
	public void setDropTime(int dropTime) {
		this.dropTime = dropTime;
	}
	public int getAmount() {
		return Amount;
	}
	public void setAmount(int amount) {
		Amount = amount;
	}
    
}
