public class Vehicle {

    private String name;
    private int seat;
    private int size;
    private int weight;

    public Vehicle(String name, int seat, int size, int weight) {
        this.name = name;
        this.seat = seat;
        this.size = size;
        this.weight = weight;

    }

    public void accelerate(){
        System.out.println("Vehicle.accelerate() called");
    }

    public void trun(){
        System.out.println("Vehicle.turn() called");
    }

    public void stop() {
        System.out.println("Vehicle.stop() called");
    }

    public String getName() {
        return name;
    }

    public int getSeat() {
        return seat;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }

}
