import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FraudDetectorTest {

    FraudDetector fd = new FraudDetector();

    @Nested
    class Test1 {


        @Test
        public void shouldBeFraudTransactionFromTraderPokemon() {
            Trader trader = new Trader("Pokemon", "Rome");
            Transaction transaction = new Transaction(trader, 1000);
            assertTrue(fd.isFraud(transaction).Fraud());
        }

        @Test
        public void shouldNotBeFraudTransactionFromOtherTraderThenPokemon() {
            Trader trader = new Trader("Jon", "Rome");
            Transaction transaction = new Transaction(trader, 1000);
            assertFalse(fd.isFraud(transaction).Fraud());
        }
    }

    @Nested
    class Test2 {

        private Rule2 rule2 = new Rule2();

        @Test
        public void shouldBeFraudTransactionFrom1000000Amount() {
            Trader trader = new Trader("Pok", "Rome");
            Transaction transaction = new Transaction(trader, 10000000);
            assertTrue(fd.isFraud(transaction).Fraud());
        }

        @Test
        public void shouldNotBeFraudTransactionFrom1000000Amount() {
            Trader trader = new Trader("Jone", "Rome");
            Transaction transaction = new Transaction(trader, 100000);
            assertFalse(fd.isFraud(transaction).Fraud());
        }
    }

    @Nested
    class Test3 {

        private Rule3 rule3 = new Rule3();

        @Test
        public void shouldBeFraudTransactionSydney() {
            Trader trader = new Trader("Pok", "Sydney");
            Transaction transaction = new Transaction(trader, 10000);
            assertTrue(fd.isFraud(transaction).Fraud());
        }

        @Test
        public void shouldNotBeFraudTransactionSydney() {
            Trader trader = new Trader("Jone", "Rome");
            Transaction transaction = new Transaction(trader, 1000);
            assertFalse(fd.isFraud(transaction).Fraud());
        }
    }

    @Nested
    class Test4 {

        private Rule4 rule4 = new Rule4();

        @Test
        public void shouldBeFraudTransactionJamaica() {
            Trader trader = new Trader("Pok", "Jamaica");
            Transaction transaction = new Transaction(trader, 10000);
            assertTrue(fd.isFraud(transaction).Fraud());
        }

        @Test
        public void shouldNotBeFraudTransactionJamaica() {
            Trader trader = new Trader("Jone", "Rome");
            Transaction transaction = new Transaction(trader, 1000);
            assertFalse(fd.isFraud(transaction).Fraud());
        }
    }

    @Nested
    class Test5 {

        private Rule5 rule5 = new Rule5();

        @Test
        public void shouldBeFraudTransactionGermany1000() {
            Trader trader = new Trader("Pok", "Germany");
            Transaction transaction = new Transaction(trader, 10000);
            assertTrue(fd.isFraud(transaction).Fraud());
        }

        @Test
        public void shouldNotBeFraudTransactionGermany1000() {
            Trader trader = new Trader("Jone", "Germany");
            Transaction transaction = new Transaction(trader, 500);
            assertFalse(fd.isFraud(transaction).Fraud());
        }
}
}
