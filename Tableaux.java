/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tableaux;

import java.util.Scanner;

/**
 *
 * @author proxy giga
 */
public class Tableaux {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] tab = {12, 15, 13, 10, 8, 9, 13, 14};

boolean estLa = false;
Scanner sc= new Scanner (System.in);
System.out.println("Entrez le nombre a chercher: ");
int n = sc.nextInt();
//Terminal.ecrireString("Entrez le nombre a chercher: ");
//n = Terminal.lireInt();
for (int i = 0; i<tab.length; i++){
if (tab[i] == n){
estLa = true;
}
}
if (estLa){
    System.out.println("Le nombre est dans le tableau");
//Terminal.ecrireStringln("Le nombre est dans le tableau");
}else{
    System.out.println("Le nombre n’est pas dans le tableau");
//Terminal.ecrireStringln("Le nombre n’est pas dans le tableau");
}
}
}
