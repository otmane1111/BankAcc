package otmane;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        BankAccount [] accounts = new BankAccount[4];
        accounts [0] = new SavingAccount("USD",4500,22);
        accounts [1] = new SavingAccount("MAD",1299,3000);
        accounts [2] = new CurrentAccount("USD",1200,200);
        accounts [3] = new CurrentAccount("MAD",1000,2400);
        for (int i = 0 ; i < accounts.length; i++){
            System.out.println(accounts[i].toString());

        }
        System.out.println("000000000000000000000000000000000000000000000000");
       for (BankAccount account : accounts) {
           System.out.println(account.type());
       }
//
//            System.out.println("balance ="+acc.getbalance());
//
//        }

        System.out.println("listes");
        List<BankAccount> BankAccountList = new ArrayList<>();
        BankAccountList.add(new SavingAccount("MAD",123860.,44));
        BankAccountList.add(new SavingAccount("MAD",1200,3209));
        BankAccountList.add(new SavingAccount("MAD",5500,98346));
        BankAccountList.add(new CurrentAccount("MAD",3972,872));
        BankAccountList.add(new CurrentAccount("MAD",12030,8734));

//        for (BankAccount acc1:BankAccountList){
//
//            System.out.println("balance ="+acc1.getbalance());
//
//        }

    }

}