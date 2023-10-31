package com.pluralsight;

public class Reservation {
    public String roomType;
    public double price;
    public int numberofNights;
    public boolean weekend;
    public double reservationsTotal;

    public Reservation(String roomType, double price, int numberofNights, boolean weekend, double reservationsTotal) {
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
            return price = 139.00;
        } else {
            return price = 124.00;
        }
    }

    public double getPrice() {
        return price * numberofNights;
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
            return price * .10;
        }else {
            return price;
        }
    }

    public void setReservationsTotal(double reservationsTotal) {
        this.reservationsTotal = reservationsTotal;
    }
}