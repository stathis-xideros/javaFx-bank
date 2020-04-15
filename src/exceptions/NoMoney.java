/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author Stathis
 */
public class NoMoney extends RuntimeException{

    public NoMoney(String message) {
        super(message);
    }
    
    
}
