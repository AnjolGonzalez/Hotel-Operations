package com.pluralsight;

public class Reservation {
    String roomType;
    double price;
    int numberofNights;
    boolean weekend;
    double reservationsTotal;

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

    public double setRoomType(String roomType) {
        if (roomType.equalsIgnoreCase("King")) {
            return reservationsTotal = 139.00;
        } else if (roomType.equalsIgnoreCase("Double")){
            return reservationsTotal = 124.00;
        }else{
            return reservationsTotal = 00.00;
        }
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

    public double getReservationsTotal() {
        if (isWeekend()) {
            return reservationsTotal * .10;
        }else {
            return reservationsTotal;
        }
    }

    public void setReservationsTotal(int reservationsTotal) {
        this.reservationsTotal = reservationsTotal;
    }
}