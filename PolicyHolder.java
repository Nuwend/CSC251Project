/**
 * The PolicyHolder class represents a person
 * who is associated with an insurance policy.
 */
public class PolicyHolder
{
   private String firstName;
   private String lastName;
   private int age;
   private String smokingStatus;
   private double height;
   private double weight;

   /**
    * No-argument constructor
    */
   public PolicyHolder()
   {
      firstName = "";
      lastName = "";
      age = 0;
      smokingStatus = "non-smoker";
      height = 0;
      weight = 0;
   }

   /**
    * Constructor with parameters
    */
   public PolicyHolder(String firstName, String lastName,
                       int age, String smokingStatus,
                       double height, double weight)
   {
      this.firstName = firstName;
      this.lastName = lastName;
      this.age = age;
      this.smokingStatus = smokingStatus;
      this.height = height;
      this.weight = weight;
   }

   // Getters and setters

   public String getFirstName()
   {
      return firstName;
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

   /**
    * Calculates BMI
    */
   public double calculateBMI()
   {
      return (weight * 703) / (height * height);
   }
}