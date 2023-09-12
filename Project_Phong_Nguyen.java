public class Project_Phong_Nguyen            // Class name
{
   private double Policy_Number;             // Policy Number
   private String Provider_Name;             // Provider Name
   private String Holder_First_Name;         // Policyholder’s First Name
   private String Holder_Last_Name;          // Policyholder’s Last Name
   private int Holder_Age;                   // Policyholder’s Age
   private String Holder_Smoke_Status;       // Policyholder’s Smoking Status
   private int Holder_Height;                // Policyholder’s Height (in.)
   private double Holder_Weight;             // Policyholder’s Weight (lb.)
   private double Holder_BMI;                // Policyholder’s BMI
   private double Policy_Total_Cost;         // Policy Total Cost
   
   private void Set_BMI_Calculation(double W, int H)
   {
      Holder_BMI = (H*703)/(H)^2;
   }
   
   private double Give_BMI_Calculation()
   {
      return Holder_BMI;
   }
   
   private void Set_Policy_Price(int A, String S, double B)
   {
      if (A > 50) {
         Policy_Total_Cost = Policy_Total_Cost + 75;
      }
      
      if (S == "smoker") {
         Policy_Total_Cost = Policy_Total_Cost + 100;
      }
      
      if (B > 35.00) {
         Policy_Total_Cost = Policy_Total_Cost + ((B -35)*20);
      }
   }
   
   private double Give_Policy_Price()
   {
      return Policy_Total_Cost;
   }
   
   
   
}