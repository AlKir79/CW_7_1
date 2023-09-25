package company;

import company.employer.Employer;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Company {
    ArrayList<Employer> employers;

    public Company(){

    }
    public Company(ArrayList<Employer> employers){
        this.employers = employers;
    }

    public float calcSalary(){
        float salary=0;
        for (Employer employer : employers){
            salary+=employer.takeSalary();
        }
        return salary;
    }
}
