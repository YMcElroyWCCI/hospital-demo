package hospital;

public class Receptionist extends Administrator {

    private boolean isOnPhone;

    public Receptionist(String employeeNumber, String name, String department, boolean isOnPhone) {
        super(employeeNumber, name, department);
        this.isOnPhone = isOnPhone;
    }

    @Override
    public int calculatePay() {
        return 50000;
    }

    @Override
    public String toString() {
        return "Receptionist{" +
                "isOnPhone=" + isOnPhone +
                ", employeeNumber='" + employeeNumber + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}