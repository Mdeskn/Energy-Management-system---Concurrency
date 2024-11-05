package group4;

public class Battery {
    private int chargeLevel = 0;
    private final int capacity = 100;

    public synchronized void charge(int amount) {
        while (chargeLevel >= capacity) {
            try {
                // Wait if the battery is already at or above capacity
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        // Add charge and enforce maximum capacity
        chargeLevel += amount;
        if (chargeLevel > capacity) {
            chargeLevel = capacity;
        }
        System.out.println("Charged: " + amount + "%, Current charge: " + chargeLevel + "%");
        notifyAll();
    }
