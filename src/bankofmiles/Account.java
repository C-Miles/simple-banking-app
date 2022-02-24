package bankofmiles;

import java.util.Scanner;

public class Account {

//    Class Variables
    int balance;
    int previousTransaction;
    String customerName;
    String customerID;

//    Class Constructor
    Account(String cname, String cid) {
        customerName = cname;
        customerID = cid;
    }

//    Methods for Depositing Money
    void deposit(int amount) {
        if (amount > 0) {
            balance = balance + amount;
            previousTransaction = amount;
        }
    }

    

}
