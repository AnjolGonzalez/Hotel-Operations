package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean isDirty = false;
    private boolean isAvailable = true;
    private boolean checkIn;
    private boolean checkOut;
    private boolean cleanRoom;

    Room (int numberOfBeds, double price, boolean occupied, boolean isDirty, boolean isAvailable) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = occupied;
        this.isDirty = isDirty;
        this.isAvailable = isAvailable;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void isCheckIn() {
        isDirty = true;
        occupied = true;
        isAvailable = false;
    }

    public boolean isCheckOut() {
        if (!isDirty) {
            isDirty = false;
            occupied = false;
        } else {
            cleanRoom();
            checkOut();
        }
        return isAvailable;
    }

    public boolean isCleanRoom() {
        return cleanRoom;
    }
}
