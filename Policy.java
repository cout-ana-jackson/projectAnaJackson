import java.util.Scanner;

/**
 * Represents an insurance policy with details.
 */
public class Policy {
    // Data members
    private String policyNumber;
    private String providerName;
    private String policyHolderFirstName;
    private String policyHolderLastName;
    private int policyHolderAge;
    private String policyHolderSmokingStatus;
    private double policyHolderHeight;
    private double policyHolderWeight;

    /**
     * Default constructor initializing policy details to default values.
     */
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

    /**
     * Constructor initializing policy details with provided values.
     *
     * @param policyNumber The policy number.
     * @param providerName The name of the insurance provider.
     * @param policyHolderFirstName The first name of the policyholder
     * @param policyHolderLastName The last name of the policyholder
     * @param policyHolderAge age of the policyholder
     * @param policyHolderSmokingStatus The smoking status of the policyholder 
     * @param policyHolderHeight height of the policyholder in inches.
     * @param policyHolderWeight weight of the policyholder in pounds.
     */
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

    /**
     * Gets the policy number.
     *
     * @return The policy number.
     */
    public String getPolicyNumber() {
        return policyNumber;
    }

    /**
     * Gets the provider name.
     *
     * @return The insurance provider name.
     */
    public String getProviderName() {
        return providerName;
    }

    /**
     * Gets the first name of the policyholder.
     *
     * @return The first name of the policyholder.
     */
    public String getPolicyHolderFirstName() {
        return policyHolderFirstName;
    }

    /**
     * Gets the last name of the policyholder.
     *
     * @return The last name of the policyholder.
     */
    public String getPolicyHolderLastName() {
        return policyHolderLastName;
    }

    /**
     * Gets the age of the policyholder.
     *
     * @return The age of the policyholder.
     */
    public int getPolicyHolderAge() {
        return policyHolderAge;
    }

    /**
     * Gets the smoking status of the policyholder.
     *
     * @return The smoking status ("smoker" or "non-smoker").
     */
    public String getPolicyHolderSmokingStatus() {
        return policyHolderSmokingStatus;
    }

    /**
     * Gets the height of the policyholder.
     *
     * @return The height of the policyholder in inches.
     */
    public double getPolicyHolderHeight() {
        return policyHolderHeight;
    }

    /**
     * Gets the weight of the policyholder.
     *
     * @return The weight of the policyholder in pounds.
     */
    public double getPolicyHolderWeight() {
        return policyHolderWeight;
    }

    /**
     * Calculates the bmi of the policyholder
     *
     * @return The BMI value calculated using weight and height.
     */
    public double calculateBMI() {
        return (policyHolderWeight * 703) / (policyHolderHeight * policyHolderHeight);
    }

    /**
     * Calculates the insurance policy price based on policyholder's attributes.
     *
     * @return The calculated policy price.
     */
    public double calculatePolicyPrice() {
        double baseFee = 600;
        if (policyHolderAge > 50) baseFee += 75;
        if (policyHolderSmokingStatus.equalsIgnoreCase("smoker")) baseFee += 100;
        double bmi = calculateBMI();
        if (bmi > 35) baseFee += (bmi - 35) * 20;
        return baseFee;
    }
}
