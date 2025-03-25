public class Rule5 implements FraudRule {

    @Override
    public boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();
        return (trader.getCity().equals("Germany") && transaction.getAmount() > 1000);
    }

    @Override
    public String getRuleName() {
        return "Rule5";
    }
}
