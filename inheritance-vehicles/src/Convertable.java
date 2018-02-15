public class Convertable extends Car {

    private String roofType;

    public Convertable(String name, int seat, int size, int weight, int tires, int doors, int engine, String roofType) {
        super(name, seat, size, weight, tires, doors, engine);
        this.roofType = roofType;
    }

    public void roofUp(){
        System.out.println("Convertable.roofUp() called");
    }

    public void roofDown() {
        System.out.println("Convertable.roofDown() called");
    }
}
