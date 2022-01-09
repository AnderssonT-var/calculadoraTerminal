package minCal;

import javax.swing.JOptionPane;

public class prosH extends menuP{
    String Resultado=" ";
    public void Calculos(){
        menufun();
        while (op != 5){
            for (int fil=0; fil<12; fil++){
                switch (op) {
                    case 1:
                    matrizA[fil][2] = matrizA[fil][0] + matrizA[fil][1];
                        break;
                    case 2:
                    matrizA[fil][2] = matrizA[fil][0] - matrizA[fil][1];
                        break;
                    case 3:
                    matrizA[fil][2] = matrizA[fil][0] * matrizA[fil][1];
                        break;
                    case 4:
                    matrizA[fil][2] = matrizA[fil][0] / matrizA[fil][1];
                        break;
                }
            }
            
            imprecion();
            menuCel();
        }
    }
    public void imprecion() {
        for (int fil=0; fil<12; fil++){
            for (int col=0; col<3; col++){    
                cleanconsol();
                Resultado += matrizA[fil][col]+ "      ";
            }

            Resultado += "\n";
        }
        JOptionPane.showMessageDialog(null, Resultado);
    }
    public void cleanconsol(){
        System.out.print("Everything on the console will cleared");
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
