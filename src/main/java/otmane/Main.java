package otmane;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {


        BankAccount account1 = new CurrentAccount();
        //account1.setaccountId("36403287");;
        account1.setcurrency("MAD");
        account1.setbalance(7600);

        BankAccount account2 = new SavingAccount("MAD",1299,22);
        printAccount(account1);
        System.out.println("=========================");;
        printAccount(account2);
        BankAccount account3 = new SavingAccount("MAD",1299,44);
        printAccount(account3);
        account3.setaccountId(account2.getaccountId());
        System.out.println(account2.equals(account3));
        System.out.println("==========================");
        System.out.println(account2.hashCode());
        System.out.println(account3.hashCode());
        // etat des comptes
        System.out.println("))))))))))))))))))))))))");

        if (account3.hashCode()==(account2.hashCode())){
            System.out.println("les deux comptes ont  meme etat");
        }else {
            System.out.println("les deux comptes ne pas  meme etat");
        }

    }


    public static void printAccount (BankAccount account ){

        System.out.println("*******************************");
        System.out.println("account id ="+account.getaccountId());
        System.out.println("balance ="+account.getbalance());
        System.out.println("status ="+account.getStatus());
        System.out.println("currency ="+account.getcurrency());
        System.out.println(account);
        System.out.println(account.hashCode());

    }

}
