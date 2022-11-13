//Suzanne Schouest CSC 1302 Online Section HW 2 02/02/2022
package CSC1302_HW2;

import java.util.*;
public class CollegeEmployee extends Person
{   
    private String ssn;
    private double annualSalary;
    private String dept;
    Scanner input = new Scanner(System.in);
    @Override
        public void setData()
        {
            super.setData();
            String tempSalary="";
            System.out.println("Please enter ssn: ");
            ssn = input.nextLine();
            System.out.println("Please enter annual salary: ");
            annualSalary = input.nextDouble();
            System.out.println("Please enter department: ");
            dept = input.next();
            
        }
    @Override
        public void display()
        {
            System.out.println(personInfo+" SSN: "+ssn+" Annual Salary: $"+annualSalary+" Department: "+dept);
        }
}
