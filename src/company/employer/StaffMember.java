package company.employer;

public class StaffMember extends Employer{
    private int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public StaffMember(String name, int salary) {
        super(name);
        this.salary = salary;
    }

    public StaffMember() {
        super();
    }

    @Override
    public float takeSalary() {
        return (float)salary;
    }
}
