/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientcontrollersocket;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.physicballs.items.*;

/**
 *
 * @author Liam-Portatil
 */
public class dummy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            ClientControllerSocket c = new ClientControllerSocket();
            Scanner i = new Scanner(System.in);
            Thread.sleep(5000);
            
            int[] a = {0 , 0};
           AndroidBall aux= new AndroidBall(0, 0, 0, 0, 0, 0, 0, "N");
            c.sendBall(aux, a);
        } catch (InterruptedException ex) {
            Logger.getLogger(dummy.class.getName()).log(Level.SEVERE, null, ex);
        }
                 
             
            }
        }

    


