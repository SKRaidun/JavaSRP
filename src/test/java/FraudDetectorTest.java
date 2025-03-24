import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FraudDetectorTest {

        private FraudDetector fraudDetector = new FraudDetector();

        @Test
        public void shouldBeFraudTransactionFromTraderPokemon() {
            Trader trader = new Trader("Pokemon", "Rome");
            Transaction transaction = new Transaction(trader, 1000);
            assertTrue(fraudDetector.isFraud(transaction));
        }

        @Test
        public void shouldNotBeFraudTransactionFromOtherTraderThenPokemon() {
            Trader trader = new Trader("Jon", "Rome");
            Transaction transaction = new Transaction(trader, 1000);
            assertFalse(fraudDetector.isFraud(transaction));
        }

        @Test
        public void shouldBeFraudTransactionFrom1000000Amount() {
            Trader trader = new Trader("Pok", "Rome");
            Transaction transaction = new Transaction(trader, 1000000);
            assertTrue(fraudDetector.isFraud(transaction));
        }

        @Test
        public void shouldNotBeFraudTransactionFrom1000000Amount() {
            Trader trader = new Trader("Jone", "Rome");
            Transaction transaction = new Transaction(trader, 100000);
            assertFalse(fraudDetector.isFraud(transaction));
        }

        @Test
        public void shouldBeFraudTransactionSynney() {
            Trader trader = new Trader("Pok", "Synney");
            Transaction transaction = new Transaction(trader, 10000);
            assertTrue(fraudDetector.isFraud(transaction));
        }

        @Test
        public void shouldNotBeFraudTransactionSynney() {
            Trader trader = new Trader("Jone", "Rome");
            Transaction transaction = new Transaction(trader, 1000);
            assertFalse(fraudDetector.isFraud(transaction));
        }

        @Test
        public void shouldBeFraudTransactionJamaica() {
            Trader trader = new Trader("Pok", "Jamaica");
            Transaction transaction = new Transaction(trader, 10000);
            assertTrue(fraudDetector.isFraud(transaction));
        }

        @Test
        public void shouldNotBeFraudTransactionJamaica() {
            Trader trader = new Trader("Jone", "Rome");
            Transaction transaction = new Transaction(trader, 1000);
            assertFalse(fraudDetector.isFraud(transaction));
        }

        @Test
        public void shouldBeFraudTransactionGermany1000() {
            Trader trader = new Trader("Pok", "Germany");
            Transaction transaction = new Transaction(trader, 10000);
            assertTrue(fraudDetector.isFraud(transaction));
        }

        @Test
        public void shouldNotBeFraudTransactionGermany1000() {
            Trader trader = new Trader("Jone", "Germany");
            Transaction transaction = new Transaction(trader, 500);
            assertFalse(fraudDetector.isFraud(transaction));
        }
}
