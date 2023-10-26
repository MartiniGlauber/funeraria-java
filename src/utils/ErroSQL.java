/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author Glauber
 */
public class ErroSQL extends RuntimeException{
        public ErroSQL(String message){            
        super (message);
    }
    
}
