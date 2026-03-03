package com.kce.entity;

import java.util.ArrayList;
import java.util.List;

public class Taxi {
    private int taxiID;
    private char currentLocation;
    private int freeTime;
    private int totalEarnings;
    private List<Booking>bookings;
	public Taxi(int taxiID) {
		this.taxiID = taxiID;
		this.currentLocation = 'A';
		this.freeTime = 0;
		this.totalEarnings = 0;
		this.bookings = new ArrayList<>();
	}
	public int getTaxiID() {
		return taxiID;
	}
	public void setTaxiID(int taxiID) {
		this.taxiID = taxiID;
	}
	public char getCurrentLocation() {
		return currentLocation;
	}
	public void setCurrentLocation(char currentLocation) {
		this.currentLocation = currentLocation;
	}
	public int getFreeTime() {
		return freeTime;
	}
	public void setFreeTime(int freeTime) {
		this.freeTime = freeTime;
	}
	public int getTotalEarnings() {
		return totalEarnings;
	}
	public void setTotalEarnings(int totalEarnings) {
		this.totalEarnings = totalEarnings;
	}
	public List<Booking> getBookings() {
		return bookings;
	}
	public void setBookings(List<Booking> bookings) {
		this.bookings = bookings;
	}
	public boolean isFree(int pickUpTime)
	{
		return pickUpTime >= freeTime;
	}
	public void addBooking(Booking booking)
	{
		bookings.add(booking);
		totalEarnings += booking.getAmount();
		currentLocation = booking.getTo();
		freeTime = booking.getDropTime();
	}
}
