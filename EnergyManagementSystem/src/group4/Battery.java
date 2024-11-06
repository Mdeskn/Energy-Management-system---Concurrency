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
    public synchronized void use(int amount) {
        while (chargeLevel <= 0) {
            try {
                // Wait if the battery is empty
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        // Subtract usage and enforce minimum charge of 0
        chargeLevel -= amount;
        if (chargeLevel < 0) {
            chargeLevel = 0;
        }
        System.out.println("Used: " + amount + "%, Current charge: " + chargeLevel + "%");
        notifyAll();
    }

    public int getChargeLevel() {
        return chargeLevel;
    }
}
