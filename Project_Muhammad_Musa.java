import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Project_Muhammad_Musa
{
   public static void main(String[] args) throws IOException
   {
      ArrayList<Policy> policies = new ArrayList<>();

      int smokerCount = 0;
      int nonSmokerCount = 0;

      File file = new File("PolicyInformation.txt");
      Scanner input = new Scanner(file);

      while (input.hasNext())
      {
         int policyNumber = Integer.parseInt(input.nextLine());
         String providerName = input.nextLine();
         String firstName = input.nextLine();
         String lastName = input.nextLine();
         int age = Integer.parseInt(input.nextLine());
         String smokingStatus = input.nextLine();
         double height = Double.parseDouble(input.nextLine());
         double weight = Double.parseDouble(input.nextLine());

         Policy policy = new Policy(policyNumber, providerName, firstName,
                                    lastName, age, smokingStatus, height, weight);

         policies.add(policy);

         if (policy.getSmokingStatus().equalsIgnoreCase("smoker"))
         {
            smokerCount++;
         }
         else
         {
            nonSmokerCount++;
         }
      }

      input.close();

      for (Policy policy : policies)
      {
         System.out.println("Policy Number: " + policy.getPolicyNumber());
         System.out.println("Provider Name: " + policy.getProviderName());
         System.out.println("Policyholder's First Name: " + policy.getFirstName());
         System.out.println("Policyholder's Last Name: " + policy.getLastName());
         System.out.println("Policyholder's Age: " + policy.getAge());
         System.out.println("Policyholder's Smoking Status: " + policy.getSmokingStatus());
         System.out.println("Policyholder's Height: " + policy.getHeight() + " inches");
         System.out.println("Policyholder's Weight: " + policy.getWeight() + " pounds");
         System.out.printf("Policyholder's BMI: %.2f\n", policy.calculateBMI());
         System.out.printf("Policy Price: $%.2f\n", policy.policyPrice());
         System.out.println();
      }

      System.out.println("Number of policyholders that are smokers: " + smokerCount);
      System.out.println("Number of policyholders that are non-smokers: " + nonSmokerCount);
   }
}