import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FraudDetectorTest {
    @Nested
    class Test1 {

        private Rule1 rule1 = new Rule1();

        @Test
        public void shouldBeFraudTransactionFromTraderPokemon() {
            Trader trader = new Trader("Pokemon", "Rome");
            Transaction transaction = new Transaction(trader, 1000);
            assertTrue(rule1.isFraud(transaction));
        }

        @Test
        public void shouldNotBeFraudTransactionFromOtherTraderThenPokemon() {
            Trader trader = new Trader("Jon", "Rome");
            Transaction transaction = new Transaction(trader, 1000);
            assertFalse(rule1.isFraud(transaction));
        }
    }

    @Nested
    class Test2 {

        private Rule2 rule2 = new Rule2();

        @Test
        public void shouldBeFraudTransactionFrom1000000Amount() {
            Trader trader = new Trader("Pok", "Rome");
            Transaction transaction = new Transaction(trader, 10000000);
            assertTrue(rule2.isFraud(transaction));
        }

        @Test
        public void shouldNotBeFraudTransactionFrom1000000Amount() {
            Trader trader = new Trader("Jone", "Rome");
            Transaction transaction = new Transaction(trader, 100000);
            assertFalse(rule2.isFraud(transaction));
        }
    }

    @Nested
    class Test3 {

        private Rule3 rule3 = new Rule3();

        @Test
        public void shouldBeFraudTransactionSydney() {
            Trader trader = new Trader("Pok", "Sydney");
            Transaction transaction = new Transaction(trader, 10000);
            assertTrue(rule3.isFraud(transaction));
        }

        @Test
        public void shouldNotBeFraudTransactionSydney() {
            Trader trader = new Trader("Jone", "Rome");
            Transaction transaction = new Transaction(trader, 1000);
            assertFalse(rule3.isFraud(transaction));
        }
    }

    @Nested
    class Test4 {

        private Rule4 rule4 = new Rule4();

        @Test
        public void shouldBeFraudTransactionJamaica() {
            Trader trader = new Trader("Pok", "Jamaica");
            Transaction transaction = new Transaction(trader, 10000);
            assertTrue(rule4.isFraud(transaction));
        }

        @Test
        public void shouldNotBeFraudTransactionJamaica() {
            Trader trader = new Trader("Jone", "Rome");
            Transaction transaction = new Transaction(trader, 1000);
            assertFalse(rule4.isFraud(transaction));
        }
    }

    @Nested
    class Test5 {

        private Rule5 rule5 = new Rule5();

        @Test
        public void shouldBeFraudTransactionGermany1000() {
            Trader trader = new Trader("Pok", "Germany");
            Transaction transaction = new Transaction(trader, 10000);
            assertTrue(rule5.isFraud(transaction));
        }

        @Test
        public void shouldNotBeFraudTransactionGermany1000() {
            Trader trader = new Trader("Jone", "Germany");
            Transaction transaction = new Transaction(trader, 500);
            assertFalse(rule5.isFraud(transaction));
        }
}
}
