package bankofmiles;

import java.util.Scanner;

public class Account {

//    Class Variables
    int balance;
    int previousTransaction;
    String customerName;
    String customerID;

//    Class Constructor
    Account(String name, String cid) {
        customerName = name;
        customerID = cid;
    }

}
