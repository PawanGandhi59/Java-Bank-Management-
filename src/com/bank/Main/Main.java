package com.bank.Main;
import com.bank.banking.deposit.deposit;
import com.bank.banking.withdrawal.withdrwal;
import com.bank.account.current.current;
import com.bank.account.saving.saving;
import java.util.Scanner;
class exceptionpassword extends RuntimeException{
    exceptionpassword(String msg){
        super(msg);
    }
}
class exceptionoutofbound extends RuntimeException{
    exceptionoutofbound(String msg){
        super(msg);
    }
}
class exception extends RuntimeException{
    exception(String msg){
        super(msg);
    }
}
public class Main{
    static String Adminpassword;
    static {
         Adminpassword="SECURED";
    }
    current c=new current();
    saving s=new saving();
    withdrwal w=new withdrwal();
    deposit d=new deposit();
    public static void main(String[] args){
        int ch,ch1,ch2;
        int j=0,k=0;
        String cu="cu",sa="sa",pass;
        Scanner in=new Scanner(System.in);
        Main k0=new Main();
        Main k1=new Main();
        Main k2=new Main();
        Main k3=new Main();
        Main k4=new Main();
        Main k5=new Main();
        Main k6=new Main();
        Main k7=new Main();
        Main k8=new Main();
        Main k9=new Main();
        Main k10=new Main();
        Main k11=new Main();
        Main k12=new Main();
        Main k13=new Main();
        Main k14=new Main();
        Main k15=new Main();
        Main k16=new Main();
        Main k17=new Main();
        Main k18=new Main();
        Main k19=new Main();
        Main[] m ={k0,k1,k2,k3,k4,k5,k6,k7,k8,k9};
        Main[] m1={k10,k11,k12,k13,k14,k15,k16,k17,k18,k19};
        Main[][] m2={m,m1};
        do {
            System.out.println("1:create a current account:");
            System.out.println("2:create a saving account:");
            System.out.println("3:show details of all current accounts created:");
            System.out.println("4:show details of all saving accounts created:");
            System.out.println("5:perform withdrawal on account:");
            System.out.println("6:perform deposit on account:");
            System.out.println("7:Transfer between two account:");
            System.out.println("8:Change password of account:");
            System.out.println("Enter your choice:");
            ch=in.nextInt();
            switch (ch){
                case 1:
                    System.out.println("How many accounts you want to create?");
                    ch1= in.nextInt();
                    if(ch1>(m.length-j))
                    {
                        throw new exceptionoutofbound("Length exceeded!");
                    }
                    else
                     {
                    for (int i=0;i<ch1;i++)
                    {
                        m[j].c.get();
                        m[j].c.put();
                    j++;
                    }
                     }
                    break;
                case 2:
                    System.out.println("How many accounts you want to create?");
                    ch1= in.nextInt();
                    if(ch1>(m1.length-j))
                    {
                        throw new exceptionoutofbound("Length exceeded!");
                    }
                    else
                    {
                        for (int i = 0; i < ch1; i++)
                        {
                            m1[k].s.get();
                            m1[k].s.put();
                            k++;
                        }
                    }
                    break;
                case 3:
                    System.out.println("Enter adim password to access:");
                    pass= in.next();
                    if(pass.equals(Adminpassword))
                    {
                        for (int i = 0; i < j; i++)
                            m[i].c.put();
                    }
                    else
                    {
                        throw new exceptionpassword("Incorrect password!!!");
                    }
                    break;
                case 4:
                    System.out.println("Enter adim password to access:");
                    pass= in.next();
                    if(pass.equals(Adminpassword))
                    {
                        for (int i = 0; i < k; i++)
                            m1[i].s.put();
                    }
                    else
                    {
                        throw new exceptionpassword("Incorrect password!!!");
                    }
                    break;
                case 5:
                    int cp,x=1;
                    do{
                        System.out.println("1:current:");
                        System.out.println("2:saving:");
                        System.out.println("Select your account type:");
                        cp= in.nextInt();
                        switch (cp){
                            case 1:
                                String g;
                                x--;
                                System.out.println("Enter account number to withdraw from:");
                                g=in.next();
                                for (int i = 0; i < j; i++) {
                                    if (g.equals(m[i].c.actno)) {
                                        System.out.println("Enter password of account:");
                                        pass = in.next();
                                        if (pass.equals(m[i].c.password)) {
                                            m[i].c.bal = m[i].w.wd(cu, m[i].c.bal);
                                        } else {
                                            throw new exceptionpassword("Incorrect password!!!");
                                        }
                                    }
                                }
                                break;
                            case 2:
                                x--;
                                System.out.println("Enter index of account to withdraw from:");
                                ch1=in.nextInt();
                                System.out.println("Enter password of account:");
                                pass = in.next();
                                if(ch1<=k) {
                                    if(pass.equals(m1[ch1].s.password)) {
                                        m1[ch1].s.bal = m1[ch1].w.wd(sa, m1[ch1].s.bal);
                                    }
                                    else{
                                        throw new exceptionpassword("Incorrect password!!!");
                                    }
                                }
                                else{
                                    throw new exception("no such account created/found");
                                }
                                break;
                        }
                    }while(x>0);
                    break;
                case 6:
                    int z=1;
                    do{
                        System.out.println("1:current:");
                        System.out.println("2:saving:");
                        System.out.println("Select your account type:");
                        cp= in.nextInt();
                        switch (cp){
                            case 1:
                                z--;
                                System.out.println("Enter index of account to deposit in:");
                                ch1=in.nextInt();
                                if(ch1<=j) {
                                    System.out.println("Enter password of account:");
                                    pass = in.next();
                                    if (pass.equals(m[ch1].c.password)) {
                                        m[ch1].c.bal = m[ch1].d.depo(m[ch1].c.bal);
                                    }
                                    else{
                                        throw new exceptionpassword("Incorrect password!!!");
                                    }
                                }
                                else{
                                    throw new exception("no such account created/found");
                                }
                                break;
                            case 2:
                                z--;
                                System.out.println("Enter index of account to deposit in:");
                                ch1=in.nextInt();
                                System.out.println("Enter password of account:");
                                pass = in.next();
                                if(ch1<=k) {
                                    if (pass.equals(m1[ch1].s.password)) {
                                        m1[ch1].s.bal = m1[ch1].d.depo(m1[ch1].s.bal);
                                    }
                                    else{
                                        throw new exceptionpassword("Incorrect password!!!");
                                    }
                                }
                                else{
                                    throw new exception("no such account created/found");
                                }
                                break;
                        }
                    }while(z>0);
                    break;
                    case 7:
                        int y=1;
                        do{
                            System.out.println("1:Between 2 current:");
                            System.out.println("2:Between 2 saving:");
                            System.out.println("Select your account type:");
                            cp= in.nextInt();
                            switch (cp){
                                case 1:
                                    y--;
                                    System.out.println("Enter index of account to transfer from:");
                                    ch1=in.nextInt();
                                    System.out.println("Enter index of account to transfer to:");
                                    ch2=in.nextInt();
                                    if(ch1<=j && ch2<=j) {
                                        System.out.println("Enter password of account to transfer from:");
                                        pass = in.next();
                                        if (pass.equals(m[ch1].c.password)) {
                                            System.out.println("Enter amount to transfer");
                                            double amount = in.nextDouble();
                                            m[ch1].c.bal = m[ch1].w.wd1(cu, m[ch1].c.bal, amount);
                                            m[ch2].c.bal = m[ch2].d.depo1(m[ch2].c.bal, amount);
                                        } else {
                                            throw new exceptionpassword("Incorrect password!!!");
                                        }
                                    }
                                    else {
                                        throw new exception("no such account created/found");
                                    }
                                    break;
                                case 2:
                                    y--;
                                    System.out.println("Enter index of account to transfer from:");
                                    ch1=in.nextInt();
                                    System.out.println("Enter index of account to transfer to:");
                                    ch2=in.nextInt();
                                    if(ch1<=k && ch2<=k) {
                                        System.out.println("Enter password of account to transfer from:");
                                        pass = in.next();
                                        if (pass.equals(m1[ch1].s.password)) {
                                            System.out.println("Enter amount to transfer");
                                            double amount = in.nextDouble();
                                            m1[ch1].s.bal = m1[ch1].w.wd1(sa, m1[ch1].s.bal, amount);
                                            m1[ch2].s.bal = m1[ch2].d.depo1(m1[ch2].s.bal, amount);
                                        } else {
                                            throw new exceptionpassword("Incorrect password!!!");
                                        }
                                    }
                                    else {
                                        throw new exception("no such account created/found");
                                    }
                                    break;
                            }
                        }while(y>0);
                        break;
                case 8:
                    System.out.println("Enter type of your account in small letters:");
                    String type=in.next();
                    String type1="current",type2="saving";
                    String t;
                    if(type.equals(type1)){
                        System.out.println("Enter your account number:");
                        t= in.next();
                        for (int i = 0; i < j; i++) {
                            if (t.equals(m[i].c.actno)) {
                                System.out.println("Account found!");
                                System.out.println("Enter your old/current password:");
                                pass= in.next();
                                if(pass.equals(m[i].c.password)){
                                    System.out.println("Enter your desired new password:");
                                    String npass;
                                    npass= in.next();
                                    m[i].c.password=npass;
                                    System.out.println("Your new password is:"+npass);
                                }
                                else {
                                    throw new exception("Incorrect password!!!");
                                }
                            }
                        }
                    } else if (type.equals(type2)) {
                        System.out.println("Enter your account number:");
                        t= in.next();
                        for (int i = 0; i < k; i++) {
                            if (t.equals(m1[i].s.actno)) {
                                System.out.println("Account found!");
                                System.out.println("Enter your old/current password:");
                                pass= in.next();
                                if(pass.equals(m1[i].s.password)){
                                    System.out.println("Enter your desired new password:");
                                    String npass;
                                    npass= in.next();
                                    m1[i].s.password=npass;
                                    System.out.println("Your new password is:"+npass);
                                }
                                else {
                                    throw new exception("Incorrect password!!!");
                                }
                            }
                        }
                    }
                    else{
                        throw new exception("No such type found!");
                    }
                    break;
            }
        }while(true);
    }
}
