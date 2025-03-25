public class FraudDetectionResult {

    private FraudRule Rule;

    public FraudDetectionResult(FraudRule Rule) {
        this.Rule = Rule;
    }

    public boolean Fraud() {
        return Rule != null;
    }

    public String Name() {
        return Rule.getRuleName();
    }
}
