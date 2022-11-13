//Suzanne Schouest CSC 1302 Online Section HW 2 02/02/2022
package CSC1302_HW2;

import java.util.*;
public class Person
{
    private String firstName;
    private String lastName;
    private String address;
    private String zip;
    private String phone;
    protected String personInfo;/* there was nothing in the driver code that  
    made it possible to print out the personal info so I made it accessible 
    throughout the package here in the Person class, as I couldn't edit the 
    CollegeList java file. This way, when the program runs, the information 
    will all be printed together at the end*/
    Scanner input = new Scanner(System.in);
    public void setData()
    {
    	//setting data from keyboard user input
        String tempGrade="";
        
        System.out.println("Please enter first Name: ");
        firstName = input.nextLine();
        System.out.println("Please enter last Name: ");
        lastName = input.nextLine();
        System.out.println("Please enter address: ");
        address = input.nextLine();
        System.out.println("Please enter 5-digit zip code: ");
        zip = input.nextLine();
        System.out.println("Please enter phone number: ");
        phone = input.nextLine();
        personInfo = "Name: "+firstName+" "+lastName+" Address: "+address+" "+zip+" Phone: "+phone;
    }
    public void display()
    {
    	System.out.println(personInfo);
    }
}
