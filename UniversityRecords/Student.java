//Suzanne Schouest CSC 1302 Online Section HW 2 02/02/2022
package CSC1302_HW2;

import java.util.*;
public class Student extends Person
{
    private String major;
    private double gpa;
    Scanner input = new Scanner(System.in);
    @Override
        public void setData()
        {
            super.setData();
            String tempGPA="";
            System.out.println("Please enter major: ");
            major = input.nextLine();
            System.out.println("Please enter GPA in 4.0 format: ");
            gpa = input.nextDouble();
        }
    @Override
        public void display()
        {
    		System.out.println(personInfo+" Major: "+major+" GPA: "+gpa);
        }
}
