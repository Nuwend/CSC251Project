/**
 * The Policy class represents an insurance policy.
 */
public class Policy
{
   private int policyNumber;
   private String providerName;
   private PolicyHolder policyHolder;

   /**
    * No-argument constructor
    */
   public Policy()
   {
      policyNumber = 0;
      providerName = "";
      policyHolder = new PolicyHolder();
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
}