public class FraudDetectionResult {

    private FraudRule Rule;

    public FraudDetectionResult(FraudRule Rule) {
        this.Rule = Rule;
    }

    public boolean Fraud() {
        if (Rule == null) {
            return false;
        }
        return true;
    }

    public String Name() {
        return Rule.getRuleName();
    }
}
