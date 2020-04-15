/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

import classes.SimpleAccount;
import classes.User;
import classes.VipAccount;
import exceptions.NoMoney;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Stathis
 */
public class Bank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SimpleAccount sa=new SimpleAccount("stathis",500);
       VipAccount va=new VipAccount("nikolaos",700);
       VipAccount va2=new VipAccount("nikol",640);
       
       ArrayList<User> users=new ArrayList();
       users.add(sa);
       users.add(va);
       users.add(va2);
       
        System.out.println(users);
        Collections.sort(users);
        System.out.println(users);
        
        System.out.println("****************************");
        try{
        va.withdraw(400000);
        }catch(NoMoney e){
            System.out.println(e);
        }
        sa.deposit(100);
        
        try{
        sa.withdraw(1000);
        }catch(NoMoney e){
            System.out.println(e);}
        
        System.out.println(va);
        System.out.println(sa);
        System.out.println(User.BankBalance);
        
        
        
        // TODO code application logic here
    }
    
}
