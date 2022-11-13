//Suzanne Schouest CSC 1302 Online Section HW 2 02/02/2022
package CSC1302_HW2;

import java.util.*;
public class Faculty extends CollegeEmployee
{
    private boolean isTenured = false;
    Scanner input = new Scanner(System.in);
    @Override
        public void setData()
        {
            super.setData();
            String tempTenure="";
            // write your code here
            System.out.println("Please enter 'true' if Tenured. Otherwise, enter 'false' below");
            isTenured = input.nextBoolean();
        }
    @Override
        public void display()
        {
    		System.out.print(personInfo);
            if (isTenured == false)
            	System.out.println("This professor is not Tenured");
            else
            	System.out.println("This professor is Tenured");
        }
}
