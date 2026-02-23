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

         
         PolicyHolder holder = new PolicyHolder(
               firstName, lastName,
               age, smokingStatus,
               height, weight
         );

         Policy policy = new Policy(policyNumber, providerName, holder);

         policies.add(policy);

         
         if (holder.getSmokingStatus().equalsIgnoreCase("smoker"))
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
         System.out.println(policy);
      }

      
      System.out.println("Number of Policy objects created: " + Policy.getNumberOfPolicies());

      System.out.println("Number of policyholders that are smokers: " + smokerCount);

      System.out.println("Number of policyholders that are non-smokers: " + nonSmokerCount);
   }
}