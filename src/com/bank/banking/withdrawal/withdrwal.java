package com.bank.banking.withdrawal;
import java.util.Scanner;
class exceptionmaintain extends RuntimeException{
    exceptionmaintain(String msg){
        super(msg);
    }
}
class exception extends RuntimeException{
    exception(String msg){
        super(msg);
    }

}
public class withdrwal {
    double bal;
    String m;
    public double wd(String q,double vbal){
        bal=vbal;
        m=q;
        double amount;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter balance to withdraw");
        amount=in.nextDouble();
        if(m.equals("cu")) {
            if (amount > bal) {
                throw new exception("insufficient balance");
            } else if ((bal - amount) < 5000) {
                throw new exceptionmaintain("Maintain balance by 5000!!!");
            } else {
                bal = bal - amount;
                System.out.println("Balance after withdrawal=" + bal);
            }
        }
        else{
            if (amount > bal) {
                throw new exception("insufficient balance");
            } else if ((bal - amount) < 2000) {
                throw new exceptionmaintain("Maintain balance by 2000!!!");
            } else {
                bal = bal - amount;
                System.out.println("Balance after withdrawal=" + bal);
            }
        }
        return bal;

    }
    public double wd1(String q,double vbal,double amount) {
        bal = vbal;
        m = q;
        double am = amount;
        Scanner in = new Scanner(System.in);
        if (m.equals("cu")) {
            if (am > bal) {
                throw new exception("insufficient balance");
            } else if ((bal - am) < 5000) {
                throw new exceptionmaintain("Maintain balance by 5000!!!");
            } else {
                bal = bal - am;
                System.out.println("Balance after transfer=" + bal);
            }
        } else {
            if (am > bal) {
                throw new exception("insufficient balance");
            } else if ((bal - am) < 2000) {
                throw new exceptionmaintain("Maintain balance by 2000!!!");
            } else {
                bal = bal - am;
                System.out.println("Balance after transfer=" + bal);
            }
        }
        return bal;

    }
}
