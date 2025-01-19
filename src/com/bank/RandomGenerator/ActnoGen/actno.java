package com.bank.RandomGenerator.ActnoGen;
import java.util.Random;

public class actno {
    public String generator(){
        String a="0123456789";
         StringBuffer p=new StringBuffer();
        Random r=new Random();
        for(int i=0;i<4;i++){
            int j=r.nextInt(a.length());
            char rc=a.charAt(j);
            p.append(rc);
        }
        String password=p.toString();
        return password;
    }
}
