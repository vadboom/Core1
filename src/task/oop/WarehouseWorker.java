package task.oop;

public class WarehouseWorker extends Employee {
    private String shift;

    public WarehouseWorker(String name, int age, String shift) {
        super(name, age);
        this.shift = shift;
    }


    @Override
    public void work() {
        System.out.println(name + " работает на складе в смену " + shift + ".");
    }


    public String getShift() {
        return shift;
    }
}