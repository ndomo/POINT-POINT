/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package impaire;

/**
 *
 * @author proxy giga
 */
public class Impaire {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("taper un nombre");
    Scanner entier=new Scanner(System.in);
    
        // n=q*2+r
        int n=entier.nextInt();
        int r=n%2;
    if(r==0){
        System.out.println("ce nombre est paire");
    }  
    else{System.out.println("ce nombre n'est pas paire");
    }
    }
    
}
