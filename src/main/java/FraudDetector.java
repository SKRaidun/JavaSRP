public class FraudDetector {

    private FraudRule rule1 = new Rule1();
    private FraudRule rule2 = new Rule2();
    private FraudRule rule3 = new Rule3();
    private FraudRule rule4 = new Rule4();
    private FraudRule rule5 = new Rule5();

    boolean isFraud(Transaction transaction) {
        return rule1.isFraud(transaction)
                || rule2.isFraud(transaction)
                || rule3.isFraud(transaction)
                || rule4.isFraud(transaction)
                || rule5.isFraud(transaction);
    }

}
