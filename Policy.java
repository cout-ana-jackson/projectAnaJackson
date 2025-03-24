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
     * @return The first name 