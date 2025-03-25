public class Rule2 implements FraudRule {

    @Override
    public boolean isFraud(Transaction transaction) {
        return transaction.getAmount() > 1000000;
    }

    @Override
    public String getRuleName() {
        return "Rule2";
    }
}
