public class FraudDetector {

    private FraudRule rule1 = new Rule1();
    private FraudRule rule2 = new Rule2();
    private FraudRule rule3 = new Rule3();
    private FraudRule rule4 = new Rule4();
    private FraudRule rule5 = new Rule5();

    FraudDetectionResult isFraud(Transaction transaction) {
        if (rule1.isFraud(transaction)) return new FraudDetectionResult(true, "Rule1");
        if (rule2.isFraud(transaction)) return new FraudDetectionResult(true, "Rule2");
        if (rule3.isFraud(transaction)) return new FraudDetectionResult(true, "Rule3");
        if (rule4.isFraud(transaction)) return new FraudDetectionResult(true, "Rule4");
        if (rule5.isFraud(transaction)) return new FraudDetectionResult(true, "Rule5");
        return null;
    }
}

