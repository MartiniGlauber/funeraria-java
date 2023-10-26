/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import errors.ValidationException;
import java.time.LocalDate;


public class Validator {
    public static boolean isValidString(String s){
        if (s==null) return false;
        return !(s.trim().isEmpty());        
    }
    public static boolean isValidCpf(String cpf){
        if (!isValidString(cpf)) return false;
        return cpf.length()==11;
    }
    public static boolean compareDate(LocalDate date1,LocalDate date2){
        if (date1 == null|| date2 == null) throw new ValidationException("As datas não podem ser nulas");
        if (date1.isAfter(LocalDate.now()) || date2.isAfter(LocalDate.now())) throw new ValidationException("As datas não podem ser superiores a data atual");
        return date1.isBefore(date2);
    }
}
