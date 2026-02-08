/**
 * The Policy class represents an insurance policy and stores
 * information about the policy holder and pricing details.
 */

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
   
   /**
   * No-argument constructor that initializes all fields
   * to default values.
   */
   
   public Policy()
   {
      policyNumber = 0;
      providerName = "";
      firstName = "";
      lastName = "";
      age = 0;
      smokingStatus = "non-smoker";
      height = 0;
      weight = 0;
   }
 
   
   /**
    * Constructor that initializes the policy with specified values.
    *
    * @param policyNumber the policy number
    * @param providerName the insurance provider name
    * @param firstName the policy holder's first name
    * @param lastName the policy holder's last name
    * @param age the policy holder's age
    * @param smokingStatus the policy holder's smoking status
    * @param height the policy holder's height in inches
    * @param weight the policy holder's weight in pounds
    */
   
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
  

   /**
    * Returns the policy number.
    *
    * @return the policy number
    */
   public int getPolicyNumber()
   {
      return policyNumber;
   }

   /**
    * Sets the policy number.
    *
    * @param policyNumber the policy number to set
    */
   public void setPolicyNumber(int policyNumber)
   {
      this.policyNumber = policyNumber;
   }

   /**
    * Returns the provider name.
    *
    * @return the provider name
    */
   public String getProviderName()
   {
      return providerName;
   }

   /**
    * Sets the provider name.
    *
    * @param providerName the provider name to set
    */
   public void setProviderName(String providerName)
   {
      this.providerName = providerName;
   }

   /**
    * Returns the policy holder's first name.
    *
    * @return the first name
    */
   public String getFirstName()
   {
      return firstName;
   }

   /**
    * Sets the policy holder's first name.
    *
    * @param firstName the first name to set
    */
   public void setFirstName(String firstName)
   {
      this.firstName = firstName;
   }

   /**
    * Returns the policy holder's last name.
    *
    * @return the last name
    */
   public String getLastName()
   {
      return lastName;
   }

   /**
    * Sets the policy holder's last name.
    *
    * @param lastName the last name to set
    */
   public void setLastName(String lastName)
   {
      this.lastName = lastName;
   }

   /**
    * Returns the policy holder's age.
    *
    * @return the age
    */
   public int getAge()
   {
      return age;
   }

   /**
    * Sets the policy holder's age.
    *
    * @param age the age to set
    */
   public void setAge(int age)
   {
      this.age = age;
   }

   /**
    * Returns the policy holder's smoking status.
    *
    * @return the smoking status
    */
   public String getSmokingStatus()
   {
      return smokingStatus;
   }

   /**
    * Sets the policy holder's smoking status.
    *
    * @param smokingStatus the smoking status to set
    */
   public void setSmokingStatus(String smokingStatus)
   {
      this.smokingStatus = smokingStatus;
   }

   /**
    * Returns the policy holder's height.
    *
    * @return the height in inches
    */
   public double getHeight()
   {
      return height;
   }

   /**
    * Sets the policy holder's height.
    *
    * @param height the height in inches
    */
   public void setHeight(double height)
   {
      this.height = height;
   }

   /**
    * Returns the policy holder's weight.
    *
    * @return the weight in pounds
    */
   public double getWeight()
   {
      return weight;
   }

   /**
    * Sets the policy holder's weight.
    *
    * @param weight the weight in pounds
    */
   public void setWeight(double weight)
   {
      this.weight = weight;
   }

   /**
    * Calculates and returns the policy holder's Body Mass Index (BMI).
    *
    * @return the calculated BMI
    */
   public double calculateBMI()
   {
      return (weight * 703) / (height * height);
   }

   /**
    * Calculates and returns the insurance policy price
    * based on age, smoking status, and BMI.
    *
    * @return the total policy price
    */
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
         price += (BMI - 35) * 20;
      }

      return price;
   }
}