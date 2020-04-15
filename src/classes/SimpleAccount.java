/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import exceptions.NoMoney;

/**
 *
 * @author Stathis
 */
public class SimpleAccount extends User{

    public SimpleAccount(String Name, int balance) {
        super(Name, balance);
    }
    
   

    @Override
    public void withdraw(int x) {
        if(x>balance){
            throw new NoMoney("no moneyyy to withdraaw");
//            System.out.println("u can not take money nigga");
        }
        else{
        balance=balance-x;
        BankBalance=BankBalance-x;
            System.out.println("ur balance is"+balance);}
    }


    }
    
    
    

