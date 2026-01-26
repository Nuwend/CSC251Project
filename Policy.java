public class Policy
{
   private int policyNumber;
   private String providerName;
   private String firstName;
   private String lastName;
   private int age;
   private String smokingStatus;
   private double height;
   private double weight;
   
   public Policy()
   {
      policyNumber = 0;
      providerName = "";
      firstName = ""
      lastName = ""
      age = 0;
      smokingStatus = "non-smoker";
      height = 0;
      weight = 0;
   }
 
   public Policy(int policyNumber, String providerName, String firstName, String lastName, int age, String smokingStatus, double height, double weight)
   {
      this.policyNumber = policyNumber;
      this.providerName = providerName;
      this.firstName = firstName;
      this.lastName = lastName;
      this.age = age;
      this.smokingStatus = smokingStatus;
      this.height = height;
      this.weight = weight;
   }
   
   public int getPolicyNumber()
   {
      return policyNumber;
   }
   
   public void setPolicyNumber(int policyNumber)
   {
      this.policyNumber = policyNumber;
   }
   
   public String getProviderName()
   {
      return providerName;
   }
   
   public void setProviderName(String providerName)
   {
      this.provderName = providerName;
   }
   
   public String getFirstName()
   {
      returnfirstName;
   }
   
   public void setFirstName(String firstName)
   {
      this.firstName = firstName;
   }
   
   public String getLastName()
   {
      return lastName;
   }
   
   public void setLastName(String lastName)
   {
      this.lastName = lastName;
   }
   
   public int getAge()
   {
      return age;
   }
   
   public void setAge(int age)
   {
      this.age = age;
   }
   
   public String getSmokingStatus()
   {
      return smokingStatus;
   }
   
   public void setSmokingStatus(String smokingStatus)
   {
      this.smokingStatus = smokingStatus;
   }
   
   public double getHeight()
   {
      return height;
   }
   
   public void setHeight(double height)
   {
      this.height = height;
   }
   
   public double getWeight()
   {
      return weight;
   }
   
   public void setWeight(double weight)
   {
      this.weight = weight;
   }
   
   
   public double calculateBMI()
   {
      return (weight * 703) / (height * height);
   }
   
   
   public double policyPrice()
   {
      double price = 600.0;
      
      if (age > 50)
      {
         price += 75.0;
      }
      
      if (smokingStatus.equalsIgnoreCase("smoker"))
      {
         price += 100.0;
      }
      
      double BMI = calculateBMI();
      if (BMI > 35)
      {
         price += (bmi - 35) * 20;
      }
      
      return price;
   }
}