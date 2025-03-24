import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class PolicyDemo {
    public static void main(String[] args) {
        ArrayList<Policy> policies = new ArrayList<>(); 
        int smokerCount = 0, nonSmokerCount = 0;

        try {
            File file = new File("PolicyInformation.txt"); 
                        Scanner fileScanner = new Scanner(file);

            // Read policies from file
            while (fileScanner.hasNext()) {
                // Read policy details from the file
                String policyNumber = fileScanner.nextLine();
                String providerName = fileScanner.nextLine();
                String policyHolderFirstName = fileScanner.nextLine();
                String policyHolderLastName = fileScanner.nextLine();
                int policyHolderAge = Integer.parseInt(fileScanner.nextLine());
                String policyHolderSmokingStatus = fileScanner.nextLine();
                double policyHolderHeight = Double.parseDouble(fileScanner.nextLine());
                double policyHolderWeight = Double.parseDouble(fileScanner.nextLine());

                // Create Policy object
                Policy policy = new Policy(policyNumber, providerName, policyHolderFirstName,
                                           policyHolderLastName, policyHolderAge, policyHolderSmokingStatus,
                                           policyHolderHeight, policyHolderWeight);

                policies.add(policy); // Store in ArrayList

                // Count smokers and non-smokers
                if (policyHolderSmokingStatus.equalsIgnoreCase("smoker")) {
                    smokerCount++;
                } else {
                    nonSmokerCount++;
                }

                // Check if more lines exist before reading next policy
                if (fileScanner.hasNext()) {
                    fileScanner.nextLine(); 
                }
            }
            fileScanner.close(); 

        } catch (FileNotFoundException e) {
            System.out.println("Error: PolicyInformation.txt not found.");
            return;
        }

        // Display all policies
        for (Policy policy : policies) {
            System.out.println("\nPolicy Number: " + policy.getPolicyNumber());
            System.out.println("Provider Name: " + policy.getProviderName());
            System.out.println("Policyholder’s First Name: " + policy.getPolicyHolderFirstName());
            System.out.println("Policyholder’s Last Name: " + policy.getPolicyHolderLastName());
            System.out.println("Policyholder’s Age: " + policy.getPolicyHolderAge());
            System.out.println("Policyholder’s Smoking Status: " + policy.getPolicyHolderSmokingStatus());
            System.out.println("Policyholder’s Height: " + policy.getPolicyHolderHeight() + " inches");
            System.out.println("Policyholder’s Weight: " + policy.getPolicyHolderWeight() + " pounds");
            System.out.printf("Policyholder’s BMI: %.2f%n", policy.calculateBMI());
            System.out.printf("Policy Price: $%.2f%n", policy.calculatePolicyPrice());
        }

        // Display smoker/non-smoker counts
        System.out.println("\nThe number of policies with a smoker is: " + smokerCount);
        System.out.println("The number of policies with a non-smoker is: " + nonSmokerCount);
    }
}
