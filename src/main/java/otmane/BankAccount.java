package otmane;

import java.util.Objects;
import java.util.UUID;

public abstract class BankAccount extends Object {

    private String accountId;
    private double balance;
    private String currency;
    private AccountStatus status;

    public abstract String type();

    public BankAccount (){
        this.accountId=  UUID.randomUUID().toString();
        status = AccountStatus.CREATED;

    }
    public BankAccount(String currency ,double balanceinit){
        this();
        this.currency = currency;
        this.balance = balanceinit;
    }
    public  String getaccountId(){

        return accountId;
    }
    public void setaccountId(String accountId){

        this.accountId = accountId;
    }


    public  double getbalance(){

        return balance;
    }
    public void  setbalance(double balance){

        this.balance = balance;
    }

    public  String getcurrency(){

        return currency;
    }
    public void  setcurrency(String currency){

        this.currency=currency;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    @Override

    public String toString() {
        return "BankAccount{" +
                "accountId" + accountId + '\'' +
                ",balance =" + balance +
                ", currency =" +currency + '\'' +
                ",status=" + status +

                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.accountId) +
                Objects.hashCode(this.balance)  +
                Objects.hashCode(this.currency) +
                Objects.hashCode(this.status) ;

    }
}