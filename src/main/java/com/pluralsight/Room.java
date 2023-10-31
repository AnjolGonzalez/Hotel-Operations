package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean isDirty = false;
    private boolean isAvailable = true;
    private boolean isCheckIn;
    private boolean isCheckOut;
    private boolean isCleanRoom;

    Room (int numberOfBeds, double price, boolean occupied, boolean isDirty, boolean isAvailable, boolean isCheckIn, boolean isCheckOut, boolean isCleanRoom) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = occupied;
        this.isDirty = isDirty;
        this.isAvailable = isAvailable;
        this.isCheckIn = isCheckIn;
        this.isCheckOut = isCheckOut;
        this.isCleanRoom = isCleanRoom;
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

    public void isCheckOut() {
        if (!isDirty) {
            isDirty = false;
            occupied = false;
        } else {
            isCleanRoom();
            isCheckOut();
        }
        isAvailable = true;
    }

    public void isCleanRoom() {
        isDirty =  false;
    }
}
