public class FraudDetectionResult {

    private boolean fraud;
    private String ruleName;

    public FraudDetectionResult(boolean fraud, String ruleName) {
        this.fraud = fraud;
        this.ruleName = ruleName;
    }

    public boolean Fraud() {
        return fraud;
    }

    public String Name() {
        return ruleName;
    }
}
