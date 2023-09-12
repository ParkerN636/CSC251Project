import java.util.Scanner;

public class DemoClass
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      Policy_Account policy = new Policy_Account();
      
      System.out.print("Please enter the Policy Number: ");
      policy.Get_Policy_Number(keyboard.nextInt());
           
      System.out.print("Please enter the Provider Name: ");
      policy.Get_Provider_Name(keyboard.next());
      
      System.out.print("Please enter the Policyholder’s First Name: ");
      policy.Get_Holder_First_Name(keyboard.next());
      
      System.out.print("Please enter the Policyholder’s Last Name: ");
      policy.Get_Holder_Last_Name(keyboard.next());
      
      System.out.print("Please enter the Policyholder’s Age: ");
      policy.Get_Holder_Age(keyboard.nextInt());
      
      System.out.print("Please enter the Policyholder’s Smoking Status (smoker/non-smoker): ");
      policy.Get_Holder_Smoke_Status(keyboard.next());
      
      System.out.print("Please enter the Policyholder’s Height (in inches): ");
      policy.Get_Holder_Height(keyboard.nextDouble());
      
      System.out.print("Please enter the Policyholder’s Weight (in pounds): ");
      policy.Get_Holder_Weight(keyboard.nextDouble());
      
      policy.Set_BMI_Calculation(policy.Give_Holder_Weight(), policy.Give_Holder_Height());
      
      policy.Set_Policy_Price(policy.Give_Holder_Age(), policy.Give_Holder_Smoke_Status(), policy.Give_BMI_Calculation());
      
      System.out.println("\nPolicy Number: " + policy.Give_Policy_Number());
      System.out.println("Provider Name: " + policy.Give_Provider_Name());
      System.out.println("Policyholder’s First Name: " + policy.Give_Holder_First_Name());
      System.out.println("Policyholder’s Last Name: " + policy.Give_Holder_Last_Name());
      System.out.println("Policyholder’s Age: " + policy.Give_Holder_Age());
      System.out.println("Policyholder’s Smoking Status: " + policy.Give_Holder_Smoke_Status());
      System.out.println("Policyholder’s Height: " + policy.Give_Holder_Height() + " inches");
      System.out.println("Policyholder’s Weight: " + policy.Give_Holder_Weight() + " pounds");
      System.out.printf("Policyholder’s BMI: %,.2f", policy.Give_BMI_Calculation());
      System.out.printf("\nPolicy Price: $%,.2f", policy.Give_Policy_Price());
      
   }
}