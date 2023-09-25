package company.employer;

abstract public class Employer {
    protected String name;

    public Employer(String name) {
        this.name = name;
    }

    public Employer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float takeSalary(){
        return 0;
    }

}
