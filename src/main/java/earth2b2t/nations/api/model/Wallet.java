package earth2b2t.nations.api.model;

/**
 * Represents a wallet.
 * Every nation and every player have wallets.
 */
public interface Wallet {

    /**
     * Returns the balance.
     *
     * @return balance of this wallet
     */
    double balance();

    /**
     * Withdraws specified amount from this wallet.
     *
     * @param amount amount
     * @return balance of this wallet if successful, otherwise insufficient amount in negative number.
     */
    double withdraw(double amount);

    /**
     * Deposits specified amount to this wallet.
     *
     * @param amount amount
     */
    void deposit(double amount);
}
