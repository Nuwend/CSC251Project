import java.util.Scanner;

public class Project_Muhammad_Musa{
   public static void main(String[] args){
   
      Scanner input = new Scanner(System.in);
      
      System.out.print("Please enter the Policy Number: ");
      int policyNumber = Integer.parseInt(input.nextLine());
      
      System.out.print("Please enter the Provider's Name: ");
      String providerName = input.nextLine();
      
      System.out.print("Please enter the Policyholder's First Name: ");
      String firstName = input.nextLine();
      
      System.out.print("Please enter the Policyholder's Last Name: ");
      String lastName = input.nextLine();
      
      System.out.print("Please enter the Policyholder's Age: ");
      int age = Integer.parseInt(input.nextLine());
      
      System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
      String smokingStatus = input.nextLine();
      
      System.out.print("Please enter the Policyholder's Height (in inches): ");
      double height = Double.parseDouble(input.nextLine());
      
      System.out.print("Please enter the Policyholder's Weight (in pounds): ");
      double weight = Double.parseDouble(input.nextLine());
      
      Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);
      
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
      
      input.close();
   }
}