 class clavier{
public static void main(String[] args){
int[] tab = {12, 15, 13, 10, 8, 9, 13, 14};
int n;
boolean estLa = false;
Terminal.ecrireString("Entrez le nombre a chercher: ");
n = Terminal.lireInt();
for (int i = 0; i<tab.length; i++){
if (tab[i] == n){
estLa = true;
}
}
if (estLa){
Terminal.ecrireStringln("Le nombre est dans le tableau");
}else{
Terminal.ecrireStringln("Le nombre n’est pas dans le tableau");
}
}
}
