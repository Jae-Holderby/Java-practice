public class Car extends Vehicle {

    private int tires;
    private int doors;
    private int engine;


    public Car(String name, int seat, int size, int weight, int tires, int doors, int engine) {
        super(name, seat, size, weight);
        this.tires = tires;
        this.doors = doors;
        this.engine = engine;
    }

    public void startEngine(){
        System.out.println("Car.startEngine() called");
    }

    public void turnOff() {
        System.out.println("Car.turnOff() called");
    }

    public int getTires() {
        return tires;
    }

    public int getDoors() {
        return doors;
    }

    public int getEngine() {
        return engine;
    }

}
