/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weightcalculator;

import java.util.InputMismatchException;

/**
 *
 * @author emir
 */
public class MyException extends InputMismatchException{
    public MyException(String message){
        super(message);
    }
    
}
