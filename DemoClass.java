import java.io.*;
import java.util.Scanner;

public class DemoClass
{
   public static void main(String[] args) throws IOException
   {
      // New file scanner
      File file = new File("PolicyInformation.txt");
      Scanner inputFile = new Scanner(file);
      
      // New scanner
      Scanner keyboard = new Scanner(System.in);
      
      // If wrong file open, then display error and close program
      if (!file.exists()) {
         System.out.println("Unable to open file.");
         System.exit(0);
      }
      
      // Declare Variables
      int policyNumber;
      String providerName;
      String firstName;
      String lastName;
      int age;
      String smokingStatus;
      double height;
      double weight;
      int smoker = 0;
      int non_smoker = 0;
      
      while(inputFile.hasNext())
      {
         // Using PolicyInformation.txt input to assign to each variables
         policyNumber = inputFile.nextInt();
         inputFile.nextLine();
         providerName = inputFile.nextLine();
         firstName = inputFile.nextLine();
         lastName = inputFile.nextLine();
         age = inputFile.nextInt();
         inputFile.nextLine();
         smokingStatus = inputFile.nextLine();
         height = inputFile.nextDouble();
         weight = inputFile.nextDouble();
         
         // Calculating number of smoker and non-smoker
         /*if(smokingStatus == "smoker")
            smoker++;
         if(smokingStatus != "smoker")
            non_smoker++;*/
         
         // If there is a line between two policy input, skip the line so input can be accurately assigned to their variable
         if(inputFile.hasNext())
            inputFile.nextLine();
         if(inputFile.hasNext())
            inputFile.nextLine();
         
         // @param for policy class
         Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);
      
         // Calculating BMI and Policy Price
         policy.Set_BMI_Calculation(policy.Give_Holder_Weight(), policy.Give_Holder_Height());
         policy.Set_Policy_Price(policy.Give_Holder_Age(), policy.Give_Holder_Smoke_Status(), policy.Give_BMI_Calculation());
         
         // Output Policy information
         System.out.println("\nPolicy Number: " + policy.Give_Policy_Number());
         System.out.println("Provider Name: " + policy.Give_Provider_Name());
         System.out.println("Policyholder’s First Name: " + policy.Give_Holder_First_Name());
         System.out.println("Policyholder’s Last Name: " + policy.Give_Holder_Last_Name());
         System.out.println("Policyholder’s Age: " + policy.Give_Holder_Age());
         System.out.println("Policyholder’s Smoking Status (smoker/non-smoker): " + policy.Give_Holder_Smoke_Status());
         System.out.println("Policyholder’s Height: " + policy.Give_Holder_Height() + " inches");
         System.out.println("Policyholder’s Weight: " + policy.Give_Holder_Weight() + " pounds");
         System.out.printf("Policyholder’s BMI: %,.2f", policy.Give_BMI_Calculation());
         System.out.printf("\nPolicy Price: $%,.2f", policy.Give_Policy_Price());
         System.out.println();
         
      }
      
      // Output number of smoker and non-smoker
      //System.out.println("\nThe number of policies with a smoker is: " + smoker);
      //System.out.print("The number of policies with a non-smoker is: " + non_smoker);
      // Close the file
      inputFile.close();
      
      /*
      //System.out.print("Please enter the Policy Number: ");
      //policy.Get_Policy_Number(keyboard.nextInt());
      //policyNumber = keyboard.nextInt();
      policyNumber = inputFile.nextInt();
      //keyboard.nextLine();
           
      System.out.print("Please enter the Provider Name: ");
      //policy.Get_Provider_Name(keyboard.next());
      providerName = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder’s First Name: ");
      //policy.Get_Holder_First_Name(keyboard.next());
      firstName = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder’s Last Name: ");
      //policy.Get_Holder_Last_Name(keyboard.next());
      lastName = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder’s Age: ");
      //policy.Get_Holder_Age(keyboard.nextInt());
      age = keyboard.nextInt();
      keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder’s Smoking Status (smoker/non-smoker): ");
      //policy.Get_Holder_Smoke_Status(keyboard.next());
      smokingStatus = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder’s Height (in inches): ");
      //policy.Get_Holder_Height(keyboard.nextDouble());
      height = keyboard.nextDouble();
      
      System.out.print("Please enter the Policyholder’s Weight (in pounds): ");
      //policy.Get_Holder_Weight(keyboard.nextDouble());
      weight = keyboard.nextDouble();
      
      Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);
      
      //
      policy.Set_BMI_Calculation(policy.Give_Holder_Weight(), policy.Give_Holder_Height());
      
      policy.Set_Policy_Price(policy.Give_Holder_Age(), policy.Give_Holder_Smoke_Status(), policy.Give_BMI_Calculation());
      //
      
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
      */
   }
}