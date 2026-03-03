package com.kce.service;

import java.util.ArrayList;
import java.util.List;

import com.kce.entity.Booking;
import com.kce.entity.Taxi;

public class TaxiService {
    private List<Taxi>taxis = new ArrayList<>();
    private int bookingCounter = 1;
    public TaxiService(int taxiCount)
    {
    	for(int i=1;i<= taxiCount;i++)
    	{
    		taxis.add(new Taxi(i));
    	}
    }
    public void bookTaxi(int customerId,char from,char to,int pickupTime)
    {
    	Taxi allocatedTaxi = null;
    	int minDistance = Integer.MAX_VALUE;
    	for(Taxi taxi: taxis)
    	{
    		if(taxi.isFree(pickupTime))
    		{
    			int distance = Math.abs(taxi.getCurrentLocation()-from);
    			if(distance < minDistance)
    			{
    				minDistance = distance;
    				allocatedTaxi = taxi;
    			}else if(distance == minDistance && taxi.getTotalEarnings() < allocatedTaxi.getTotalEarnings())
    			{
    				allocatedTaxi = taxi;
    			}
    		}
    	}
    	if(allocatedTaxi == null)
    	{
    		System.out.println("No Taxi Available.Booking Rejected");
    		return ;
    	}
    	int travelDistance = Math.abs(from - to)*15;
    	int travelTime = Math.abs(from - to);
    	int dropTime = pickupTime + travelTime;
    	int amount;
    	if(travelDistance <= 5)
    	{
    		amount = 100;
    	}else
    	{
    		amount = 100+(travelDistance - 5)*10;
    	}
    	Booking booking = new Booking(bookingCounter++,customerId,from,to,pickupTime,dropTime,amount);
    	allocatedTaxi.addBooking(booking);
    	System.out.println("Taxi-" + allocatedTaxi.getTaxiID() + " is allocated successfully.");
    }
    public void displayTaxiDetails()
    {
    	for(Taxi taxi:taxis)
    	{
    		if(!taxi.getBookings().isEmpty())
    		{
    			System.out.println("\n-------------------------------------");
    			System.out.println("\nTaxi-" + taxi.getTaxiID() + "Total Earnings:Rs."+taxi.getTotalEarnings());
    			System.out.println("\n-------------------------------------");
    			System.out.printf("%-10s %-12s %-6s %-6s %-8s %-8s %-8s\n","BookingID", "CustomerID", "from", "To", "Pickup" ,"Drop" ,"Amount");
    			for(Booking b : taxi.getBookings())
    			{
    				System.out.printf("%-10d %-12d %-6c %-6c %-8d %-8d %-8d\n",b.getBookingID(),b.getCustomerID(),b.getFrom(),b.getTo(),b.getPickupTime(),b.getDropTime(),b.getAmount());
    			}
    		}
    	}
    }
}
