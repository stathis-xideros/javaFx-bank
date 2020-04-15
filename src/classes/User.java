/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Stathis
 */
public abstract class User implements Comparable{
    protected String Name;
    protected int balance;
    public static int BankBalance=100;

    public User(String Name, int balance) {
        this.Name = Name;
        this.balance = balance;
    }
    
    public void deposit(int x){
    balance=balance+x;
    BankBalance=BankBalance+x;}
    
    public abstract void withdraw(int x);

    @Override
    public String toString() {
        return "User{" + "Name=" + Name + ", balance=" + balance + '}';
    }

    @Override
    public int compareTo(Object o) {
       User temp=(User)o;
       return this.balance-temp.balance;
    }
    
    
    
    
}
