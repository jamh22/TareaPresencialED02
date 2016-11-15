/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea;

import java.util.Date;

/**
 *
 * @author munoz
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola Mundoo");
        Date ahora=new Date();
        System.out.printf("%s %tT", "son las ", ahora);
    }
    
}
