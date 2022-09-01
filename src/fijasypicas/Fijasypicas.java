
package fijasypicas;

import javax.swing.JOptionPane;

public class Fijasypicas {

    static int ran = 1, contadorpicas = 0, contadorfijas = 0;
    static int rand[]= new int[4];
    static int numu[]= new int[4];

    public static void main(String args[]) {
        numran();
        numpj();
        comparador();
    }

    public static void numran() {
        int min = 1, max = 9;
        int ran = (int) (Math.random() * (max - min + 1) + min);

        for (int i = 0; i < 4; i++) {
            rand[i] = (int) (Math.random() * (max - min + 1) + min);
            for (int j = 0; j < i; j++) {
                if (rand[i] == rand[j]) {
                    i--;
                }
            }
        }
       // for (int k = 0; k < 4; k++) {
      //    System.out.print(" " + rand[k]);    Muestra el numero generado de manera aleatoria
       // }

    }

    public static void numpj() {
        String num = JOptionPane.showInputDialog("Adivine el numero de 4 cifras: ");
        for (int i = 0; i < 4; i++) {
            String numint = "" + num.charAt(i);
            numu[i] = Integer.parseInt(numint);
        }
        }
    public static void comparador(){
        for (int i = 0; i < 4; i++) {
            if(numu[i]==rand[i]){
            contadorfijas++;
            }
            else{
                for(int j=0; j<4;j++){
                    if(j==i)continue;
                    if(numu[i]==rand[j])
                        contadorpicas++;
                }
            }
        }System.out.println("\n Tiene "+contadorfijas+" fijas");
        System.out.println(" Tiene "+contadorpicas+" picas");
        if(contadorfijas<4){
            contadorfijas=0;
            contadorpicas=0;
            numpj();
            comparador();
        }
    }
}
