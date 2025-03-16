package task.oop;

public class Manager extends Employee {

    private String department;

    public Manager(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    @Override
    public void work() {
        System.out.println(name + " управляет отделом " + department + ".");
    }


    public String getDepartment() {
        return department;
    }
}