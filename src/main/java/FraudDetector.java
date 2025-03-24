public class FraudDetector {

    boolean rule1(Transaction transaction) {
        Trader trader = transaction.getTrader();
        if (trader.getFullName().equals("Pokemon")) return true;
        return false;
    }

    boolean rule2(Transaction transaction) {
        if (transaction.getAmount() >= 1000000 ) return true;
        return false;
    }

    boolean rule3(Transaction transaction) {
        Trader trader = transaction.getTrader();
        if (trader.getCity().equals("Synney")) return true;
        return false;
    }

    boolean rule4(Transaction transaction) {
        Trader trader = transaction.getTrader();
        if (trader.getCity().equals("Jamaica")) return true;
        return false;
    }

    boolean rule5(Transaction transaction) {
        Trader trader = transaction.getTrader();
        if ((trader.getCity().equals("Germany") & transaction.getAmount() > 1000)) return true;
        return false;
    }
    boolean isFraud(Transaction transaction) {
        if (rule1(transaction)|
                rule2(transaction) |
                rule3(transaction) |
                rule4(transaction) |
                rule5(transaction)) return true;
        return false;
    }

}
