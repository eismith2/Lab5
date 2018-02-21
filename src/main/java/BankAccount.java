import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        /**
         *
         */
        CHECKINGS,
        /**
         *
         */
        SAVINGS,
        /**
         *
         */
        STUDENT,
        /**
         *
         */
        WORKPLACE
    }

    /**
     *
     */
    public int accountNumber;
    /**
     *
     */
    private BankAccountType accountType;
    /**
     *
     */
    public double accountBalance;
    /**
     *
     */
    private String ownerName;
    /**
     *
     */
    private double interestRate;
    /**
     *
     */
    private double interestEarned;

    /**
     *
     * @param name kmklknk.
     * @param accountCategory kmkmkm.
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        /*
         * Implement this function
         */
    }

    /**
     *
     * @param accountNumber fidonodif.
     */
    public final void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     *
     * @return account number.
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     *
     * @param accountType oinvodnv.
     */
    public void setAccountType(final BankAccountType accountType) {
        this.accountType = accountType;
    }

    /**
     * ivkndov i.
     * @return onvofuihb.
     */
    public BankAccountType getAccountType() {
        return accountType;
    }
    /**
     *
     * @param accountBalance flknvosidv.
     */
    public void setAccountBalance(final double accountBalance) {
        this.accountBalance = accountBalance;
    }
    /**
     *
     * @return gdlknbodi.
     */
    public double getAccountBalance() {
        return accountBalance;
    }
    /**
     *
     * @param interestEarned fdnodubg.
     */
    public void setInterestEarned(final double interestEarned) {
        this.interestEarned = interestEarned;
    }
    /**
     *
     * @return onbofbf.
     */
    public double getInterestEarned() {
        return interestEarned;
    }
    /**
     *
     * @param interestRate lfkndfon.
     */
    public void setInterestRate(final double interestRate) {
        this.interestRate = interestRate;
    }
    /**
     *
     * @return fkngofighf.
     */
    public double getInterestRate() {
        return interestRate;
    }
    /**
     *
     * @param ownerName fdonodigd.
     */
    public void setOwnerName(final String ownerName) {
        this.ownerName = ownerName;
    }

    /**
     *
     * @return owner name.
     */
    public String getOwnerName() {
        return ownerName;
    }
}