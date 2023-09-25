import company.Company;
import company.employer.Employer;
import company.employer.EmployerByHour;
import company.employer.StaffMember;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        EmployerByHour employer = new EmployerByHour("Ivan",20,200);
        StaffMember staffMember = new StaffMember("Oleg",40000);
        ArrayList<Employer> employers = new ArrayList<>();
        employers.add(employer);
        employers.add(staffMember);
        Company company = new Company(employers);
        System.out.println(company.calcSalary());
    }
}
