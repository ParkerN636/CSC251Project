public class Policy                          // Class name
{
   private int Policy_Number;                // Policy Number
   private String Provider_Name;             // Provider Name
   private String Holder_First_Name;         // Policyholder’s First Name
   private String Holder_Last_Name;          // Policyholder’s Last Name
   private int Holder_Age;                   // Policyholder’s Age
   private String Holder_Smoke_Status;       // Policyholder’s Smoking Status
   private double Holder_Height;                // Policyholder’s Height (in.)
   private double Holder_Weight;             // Policyholder’s Weight (lb.)
   private double Holder_BMI;                // Policyholder’s BMI
   private double Policy_Total_Cost;         // Policy Total Cost
   
   ///////////////////////////////////////
   
   public void Get_Policy_Number(int P) // @param
   {
      Policy_Number = P;
   }
   
   public void Get_Provider_Name(String N) // @param
   {
      Provider_Name = N;
   }
   
   public void Get_Holder_First_Name(String F) // @param
   {
      Holder_First_Name = F;
   }
   
   public void Get_Holder_Last_Name(String L) // @param
   {
      Holder_Last_Name = L;
   }
   
   public void Get_Holder_Age(int A) // @param
   {
      Holder_Age = A;
   }
   
   public void Get_Holder_Smoke_Status(String S) // @param
   {
      Holder_Smoke_Status = S;
   }
   
   public void Get_Holder_Height(double H) // @param
   {
      Holder_Height = H;
   }
   
   public void Get_Holder_Weight(double W) // @param
   {
      Holder_Weight = W;
   }
      
   //////////////////////////////////////////////
   
   public int Give_Policy_Number()
   {
      return Policy_Number; // @return
   }
   
   public String Give_Provider_Name()
   {
      return Provider_Name; // @return
   }
   
   public String Give_Holder_First_Name()
   {
      return Holder_First_Name; // @return
   }
   
   public String Give_Holder_Last_Name()
   {
      return Holder_Last_Name; // @return
   }
   
   public int Give_Holder_Age()
   {
      return Holder_Age; // @return
   }
   
   public String Give_Holder_Smoke_Status()
   {
      return Holder_Smoke_Status; // @return
   }
   
   public double Give_Holder_Height()
   {
      return Holder_Height; // @return
   }
   
   public double Give_Holder_Weight()
   {
      return Holder_Weight; // @return
   }
   
      
   public void Set_BMI_Calculation(double W, double H) // @param
   {
      Holder_BMI = (W*703)/(H*H);
   }
   
   public double Give_BMI_Calculation()
   {
      return Holder_BMI; // @return
   }
   
   public void Set_Policy_Price(int A, String S, double B) // @param
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
   
   public double Give_Policy_Price()
   {
      return Policy_Total_Cost + 600; // @return
   }
   
}
