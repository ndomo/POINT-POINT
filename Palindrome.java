/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package palindrome;

/**
 *
 * @author proxy giga
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String T="rotor";
        int i=0;
        int j=T.length()-1;
        //affichage de la suite de carractere saisie
                  System.out.print(T);
        //test de palindrome
        while ((i<j)&&(T.charAt(i)==T.charAt(j))) 
            i=i+1;
            j=j-1;
        if (T.charAt(i)!=T.charAt(j))
            System.out.println("n'est pas un palindrome");
        else
            System.out.println("est un palindrome");
    }
    
}
