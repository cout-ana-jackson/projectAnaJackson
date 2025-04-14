public class Policy {
    private String policyNumber;
    private String providerName;
    private PolicyHolder policyHolder;

    private static int policyCount = 0;

    // Default constructor
    public Policy() {
        this.policyNumber = "";
        this.providerName = "";
        this.policyHolder = new PolicyHolder();
        policyCount++;
    }

    // Full constructor with deep copy
    public Policy(String policyNumber, String providerName, PolicyHolder policyHolder) {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.policyHolder = new PolicyHolder(policyHolder);
        policyCount++;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public String getProviderName() {
        return providerName;
    }

    public PolicyHolder getPolicyHolder() {
        return new PolicyHolder(policyHolder); // deep copy return
    }

    public double calculatePolicyPrice() {
        double baseFee = 600;
        if (policyHolder.getAge() > 50) baseFee += 75;
        if (policyHolder.getSmokingStatus().equalsIgnoreCase("smoker")) baseFee += 100;
        double bmi = policyHolder.calculateBMI();
        if (bmi > 35) baseFee += (bmi - 35) * 20;
        return baseFee;
    }

    public static int getPolicyCount() {
        return policyCount;
    }

    public String toString() {
        return String.format(
            "Policy Number: %s\nProvider Name: %s\n%s\nPolicy Price: $%.2f",
            policyNumber,
            providerName,
            policyHolder.toString(),
            calculatePolicyPrice()
        );
    }
}
