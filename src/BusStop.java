import java.util.List;

public class BusStop {
    private List<BusDriver> busDriversList;
    private List<TransportWorker> transportWorkerList;

    public static Bus<TransportWorker> trainingBus(BusDriver trainee, List<? extends TransportWorker> trainers){
        Bus<TransportWorker> bus = new Bus<>(10);
        trainers.forEach(t -> {
            bus.passengerOn(t);
        });
        return bus;
    }
}
