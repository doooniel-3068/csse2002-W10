public class Bus<T extends Passenger> {
    private T[] passengers;
    private int currentCount;
    private int capacity;

    public Bus(int capacity) {
        this.passengers = (T[]) new Object[capacity];
        this.capacity = capacity;
        this.currentCount = 0;
    }

    public void passengerOn(T passenger) {
        if (currentCount < capacity) {
            passengers[currentCount++] = passenger;
        }
    }

    public T passengerOff() {
        T exitingPassenger = null;
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
