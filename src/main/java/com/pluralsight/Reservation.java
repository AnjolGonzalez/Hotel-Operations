package com.pluralsight;

public class Reservation {
    String roomType;
    double price;
    int numberofNights;
    boolean weekend;
    int reservationsTotal;

    Reservation(String roomType, double price, int numberofNights, boolean weekend, int reservationsTotal) {
        this.roomType = roomType;
        this.price = price;
        this.numberofNights = numberofNights;
        this.weekend = weekend;
        this.reservationsTotal = reservationsTotal;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumberofNights() {
        return numberofNights;
    }

    public void setNumberofNights(int numberofNights) {
        this.numberofNights = numberofNights;
    }

    public boolean isWeekend() {
        return weekend;
    }

    public void setWeekend(boolean weekend) {
        this.weekend = weekend;
    }

    public int getReservationsTotal() {
        return reservationsTotal;
    }

    public void setReservationsTotal(int reservationsTotal) {
        this.reservationsTotal = reservationsTotal;
    }
}