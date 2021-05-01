package hospital;

public class Surgeon extends Doctor {

    private boolean isOperating;

    public Surgeon(String employeeNumber, String name, String speciality, boolean isOperating) {
    super(employeeNumber, name, speciality);
    this.isOperating = isOperating;
    }

    @Override
    public int calculatePay() {
        return 1000000;
    }

    @Override
    public String toString() {
        return "Surgeon{" +
                "isOperating=" + isOperating +
                ", employeeNumber='" + employeeNumber + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

}
