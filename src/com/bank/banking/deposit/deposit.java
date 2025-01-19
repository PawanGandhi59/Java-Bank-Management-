package com.bank.banking.deposit;
import java.util.Scanner;
public class deposit {
    double bal;
    double amount;
    Scanner in=new Scanner(System.in);
    public double depo(double vbal){
        bal=vbal;
        System.out.println("Enter balance to deposit");
        amount= in.nextDouble();
        bal=bal+amount;
        return bal;
    }
    public double depo1(double vbal,double amount){
        bal=vbal;
        double amo=amount;
        bal=bal+amo;
        System.out.println("Balance after transfer="+bal);
        return bal;

    }
}
