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
public class ErroSql extends RuntimeException{
        public ErroSql(String message){            
        super (message);
    }
    
}
