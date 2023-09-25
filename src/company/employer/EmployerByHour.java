package company.employer;

public class EmployerByHour extends Employer {
    private float hour;
    private int salaryInHour;

    public EmployerByHour(String name, float hour, int salaryInHour) {
        super(name);
        this.hour = hour;
        this.salaryInHour = salaryInHour;
    }
    public EmployerByHour() {
        super();
    }

    public EmployerByHour(float hour, int salaryInHour) {
        this.hour = hour;
        this.salaryInHour = salaryInHour;
    }

    public float getHour() {
        return hour;
    }

    public void setHour(float hour) {
        this.hour = hour;
    }

    public int getSalaryInHour() {
        return salaryInHour;
    }

    public void setSalaryInHour(int salaryInHour) {
        this.salaryInHour = salaryInHour;
    }

    @Override
    public float takeSalary() {
        return hour*salaryInHour;
    }
}
