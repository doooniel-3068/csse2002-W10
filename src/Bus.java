public class Bus {
    private Object[] passengers;
    private int currentCount;
    private int capacity;

    public Bus(int capacity) {
        this.passengers = new Object[capacity];
        this.capacity = capacity;
        this.currentCount = 0;
    }

    public void passengerOn(Object passenger) {
        if (currentCount < capacity) {
            passengers[currentCount++] = passenger;
        }
    }

    public Object passengerOff() {
        Object exitingPassenger = null;
        if (currentCount > 0) {
            exitingPassenger = passengers[--currentCount];
        }
        return exitingPassenger;
    }

    public int getCurrentCount() {
        return currentCount;
    }

    public int getCapacity() {
        return capacity;
    }
}
