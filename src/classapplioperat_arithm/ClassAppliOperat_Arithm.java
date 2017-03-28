/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classapplioperat_arithm;

/**
 *
 * @author Haman Eyarre
 */
public class ClassAppliOperat_Arithm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 4 , y = 8 , z = 3, t = 7,calcul ;
        calcul = x-- ; 
        System.out.println(" x = "+x+" x-- = "+calcul);
        calcul = y---1 ;
        System.out.println(" y = "+y+" y---1 = "+calcul );
        calcul = z-- - z ;
        System.out.println(" z = "+z+" z-- - z = "+calcul);
        calcul = z - z-- ;
        System.out.println (" z = "+z+" z - z-- ="+calcul);
    }
        // TODO code application logic here
    }
 
