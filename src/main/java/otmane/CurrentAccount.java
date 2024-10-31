package otmane;

public class CurrentAccount extends BankAccount {
    public double overDraft;

    public CurrentAccount() {
        super();
    }
    public CurrentAccount(String currency ,double balanaceinit, double overDraft) {
        super(currency, balanaceinit);
        this.overDraft = overDraft;
    }

    @Override
    public String type() {
        return "current Account";
    }

    public double getOverDraft() {
        return overDraft;
    }

    public void setOverDraft(double overDraft) {
        this.overDraft = overDraft;
    }

    @Override
    public String toString() {
        return super.toString()+"//overDraft = "+overDraft ;
    }
}
