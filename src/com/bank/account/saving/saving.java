package com.bank.account.saving;
import com.bank.RandomGenerator.ActnoGen.actno;
import com.bank.RandomGenerator.PasswordGenerator.password;

import java.util.Scanner;


class exceptionn extends RuntimeException{
    exceptionn(String msg){
        super(msg);
    }
}
public class saving{
    String actholder;
    static int i=-1;

   public double bal,vbal;
    com.bank.RandomGenerator.PasswordGenerator.password p=new password();
    com.bank.RandomGenerator.ActnoGen.actno a=new actno();
    Scanner in=new Scanner(System.in);
    public String password =p.generator();
    public String actno=a.generator();
    public void get(){
        System.out.println("Enter account holder name:");
        actholder=in.nextLine();
        System.out.println("Enetr deposit of minimum balance of 2000");
        vbal=in.nextDouble();
        if(vbal>=2000){
            bal=vbal;
            i++;
        }
        else{
            throw new exceptionn("your balance should be maintained by 5000");
        }
    }
    public void put(){
        System.out.println("congratulations!you have created a new saving account:");
        System.out.println("Account holder name:"+actholder);
        System.out.println("Account number:"+actno);
        System.out.println("Password:"+password);
        System.out.println("Current balance:"+bal);
        System.out.println("Index number of account is:"+i);
    }
    public double getbal(){
        return bal;
    }


}

