package otmane;

public class SavingAccount extends BankAccount{
    public double interestRate;

    public SavingAccount(){
        super();
    }
    public SavingAccount(String currency, double balanceinit, double interestRate) {
        super(currency, balanceinit);
        this.interestRate = interestRate;

    }

    @Override
    public String type() {
        return "saving account";
    }

    public double getInterestRate() {
        return interestRate;
    }
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public String toString() {
        return super.toString()+"//interestRate = "+ interestRate ;
    }
}
