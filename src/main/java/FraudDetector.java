import java.util.List;

public class FraudDetector {

    private List<FraudRule> fraudRules = List.of(
                        new Rule1(),
                        new Rule2(),
                        new Rule3(),
                        new Rule4(),
                        new Rule5()
                        );

    FraudDetectionResult isFraud(Transaction transaction) {
        for (FraudRule rule : fraudRules) {
            if (rule.isFraud(transaction)) return new FraudDetectionResult(rule);
        }

        return new FraudDetectionResult(null);
    }
}

