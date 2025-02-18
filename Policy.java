import java.util.Scanner;

public class Policy {

    // Data members (did this in class)
    private String policyNumber;
    private String providerName;
    private String policyHolderFirstName;
    private String policyHolderLastName;
    private int policyHolderAge;
    private String policyHolderSmokingStatus;
    private double policyHolderHeight;
    private double policyHolderWeight;

    // No arg, setting baselines
        public Policy() {
        this.policyNumber = "";
        this.providerName = "";
        this.policyHolderFirstName = "";
        this.policyHolderLastName = "";
        this.policyHolderAge = 0;
        this.policyHolderSmokingStatus = "non-smoker";
        this.policyHolderHeight = 0.0;
        this.policyHolderWeight = 0.0;
    }

    // Constructor with parameters
    public Policy(String policyNumber, String providerName, String policyHolderFirstName,
                  String policyHolderLastName, int policyHolderAge, String policyHolderSmokingStatus,
                  double policyHolderHeight, double policyHolderWeight) {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.policyHolderFirstName = policyHolderFirstName;
        this.policyHolderLastName = policyHolderLastName;
        this.policyHolderAge = policyHolderAge;
        this.policyHolderSmokingStatus = policyHolderSmokingStatus;
        this.policyHolderHeight = policyHolderHeight;
        this.policyHolderWeight = policyHolderWeight;
    }

    // Getters
    public String getPolicyNumber() { return policyNumber; }
    public String getProviderName() { return providerName; }
    public String getPolicyHolderFirstName() { return policyHolderFirstName; }
    public String getPolicyHolderLastName() { return policyHolderLastName; }
    public int getPolicyHolderAge() { return policyHolderAge; }
    public String getPolicyHolderSmokingStatus() { return policyHolderSmokingStatus; }
    public double getPolicyHolderHeight() { return policyHolderHeight; }
    public double getPolicyHolderWeight() { return policyHolderWeight; }

    // BMI 
    public double calculateBMI() {
        return (policyHolderWeight * 703) / (policyHolderHeight * policyHolderHeight);
    }

    // Insurance Policy Price Calculation
    public double calculatePolicyPrice() {
        double baseFee = 600;
        if (policyHolderAge > 50) baseFee += 75;
        if (policyHolderSmokingStatus.equalsIgnoreCase("smoker")) baseFee += 100;
        double bmi = calculateBMI();
        if (bmi > 35) baseFee += (bmi - 35) * 20;
        return baseFee;
    }
}
