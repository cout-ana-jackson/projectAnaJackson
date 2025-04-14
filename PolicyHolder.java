public class PolicyHolder {
    private String firstName;
    private String lastName;
    private int age;
    private String smokingStatus;
    private double height;
    private double weight;

    // Default constructor
    public PolicyHolder() {
        firstName = "";
        lastName = "";
        age = 0;
        smokingStatus = "non-smoker";
        height = 0.0;
        weight = 0.0;
    }

    // Full constructor
    public PolicyHolder(String firstName, String lastName, int age, String smokingStatus, double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.smokingStatus = smokingStatus;
        this.height = height;
        this.weight = weight;
    }

    // deep copy
    public PolicyHolder(PolicyHolder other) {
        this.firstName = other.firstName;
        this.lastName = other.lastName;
        this.age = other.age;
        this.smokingStatus = other.smokingStatus;
        this.height = other.height;
        this.weight = other.weight;
    }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public int getAge() { return age; }
    public String getSmokingStatus() { return smokingStatus; }
    public double getHeight() { return height; }
    public double getWeight() { return weight; }

    public double calculateBMI() {
        return (weight * 703) / (height * height);
    }

    public String toString() {
        return String.format(
            "Policyholder's First Name: %s\nPolicyholder's Last Name: %s\nPolicyholder's Age: %d\n" +
            "Policyholder's Smoking Status: %s\nPolicyholder's Height: %.1f inches\n" +
            "Policyholder's Weight: %.1f pounds\nPolicyholder's BMI: %.2f",
            firstName,
            lastName,
            age,
            smokingStatus,
            height,
            weight,
            calculateBMI()
        );
    }
}
