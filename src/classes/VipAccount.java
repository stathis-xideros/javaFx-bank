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
public class VipAccount extends User{

    public VipAccount(String Name, int balance) {
        super(Name, balance);
    }

    
    @Override
    public void withdraw(int x) {
        if(x>BankBalance){
            throw new NoMoney("no money left in bankbalance");}
        else{
        balance=balance-x;
        BankBalance=BankBalance-x;
            System.out.println("to ipolipo s ein"+balance);}
    }
    
}
