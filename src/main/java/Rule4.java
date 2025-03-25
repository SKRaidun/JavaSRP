public class Rule4 implements FraudRule {

    @Override
    public boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();
        return trader.getCity().equals("Jamaica");
    }

    @Override
    public String getRuleName() {
        return "Rule4";
    }
}
