package com.pluralsight;

public class Room {
    int numberOfBeds;
    double price;
    boolean occupied;
    boolean isDirty;
    boolean isAvailable;

    Room (int numberOfBeds, double price, boolean occupied, boolean isDirty, boolean isAvailable) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = occupied;
        this.isDirty = isDirty;
        this.isAvailable = isAvailable;
    }

    private int getNumberOfBeds() {
        return numberOfBeds;
    }

    private void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    private double getPrice() {
        return price;
    }

    private void setPrice(double price) {
        this.price = price;
    }

    private boolean isOccupied() {
        return occupied;
    }

    private void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    private boolean isDirty() {
        return isDirty;
    }

    private void setDirty(boolean dirty) {
        isDirty = dirty;
    }

    private boolean isAvailable() {
        return isAvailable;
    }

    private void setAvailable(boolean available) {
        isAvailable = available;
    }
}
