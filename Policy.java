/**
 * The Policy class represents an insurance policy.
 */
public class Policy
{
   private int policyNumber;
   private String providerName;
   private PolicyHolder policyHolder;
   
   private static int numberOfPolicies = 0;

   /**
    * No-argument constructor
    */
   public Policy()
   {
      policyNumber = 0;
      providerName = "";
      policyHolder = new PolicyHolder();
      numberOfPolicies++;
   }

   /**
    * Constructor with parameters
    */
   public Policy(int policyNumber, String providerName,
                 PolicyHolder policyHolder)
   {
      this.policyNumber = policyNumber;
      this.providerName = providerName;
      this.policyHolder = policyHolder;
      numberOfPolicies++;
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
      this.providerName = providerName;
   }

   public PolicyHolder getPolicyHolder()
   {
      return policyHolder;
   }

   public void setPolicyHolder(PolicyHolder policyHolder)
   {
      this.policyHolder = policyHolder;
   }
   public static int getNumberOfPolicies()
   {
      return numberOfPolicies;
   }

   /**
    * Calculates the policy price
    */
   public double policyPrice()
   {
      double price = 600.0;

      if (policyHolder.getAge() > 50)
      {
         price += 75.0;
      }

      if (policyHolder.getSmokingStatus().equalsIgnoreCase("smoker"))
      {
         price += 100.0;
      }

      double BMI = policyHolder.calculateBMI();

      if (BMI > 35)
      {
         price += (BMI - 35) * 20;
      }

      return price;
   }
   
   @Override
   public String toString()
   {
      return "Policy Information:\n" +
             "Policy Number: " + policyNumber + "\n" +
             "Provider Name: " + providerName + "\n\n" +
             policyHolder.toString() +
             String.format("Policy Price: $%.2f\n", policyPrice());
   }
}