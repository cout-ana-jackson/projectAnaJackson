import java.util.Scanner;

public class PolicyDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // get the user input
        
        //base
        //System.out.print("Please enter the _____: ");
        //String _______ = keyboard.nextLine();


        System.out.print("Please enter the Policy Number: ");
        String policyNumber = keyboard.nextLine();

        System.out.print("Please enter the Provider Name: ");
        String providerName = keyboard.nextLine();

        System.out.print("Please enter the Policyholder’s First Name: ");
        String policyHolderFirstName = keyboard.nextLine();

        System.out.print("Please enter the Policyholder’s Last Name: ");
        String policyHolderLastName = keyboard.nextLine();

        System.out.print("Please enter the Policyholder’s Age: ");
        int policyHolderAge = keyboard.nextInt();
        keyboard.nextLine();  

        System.out.print("Please enter the Policyholder’s Smoking Status (smoker/non-smoker): ");
        String policyHolderSmokingStatus = keyboard.nextLine();

        System.out.print("Please enter the Policyholder’s Height (in inches): ");
        double policyHolderHeight = keyboard.nextDouble();

        System.out.print("Please enter the Policyholder’s Weight (in pounds): ");
        double policyHolderWeight = keyboard.nextDouble();

        // Create the object
        Policy policy = new Policy(policyNumber, providerName, policyHolderFirstName,
                                   policyHolderLastName, policyHolderAge, policyHolderSmokingStatus,
                                   policyHolderHeight, policyHolderWeight);

        // display the final outputs 
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
}
