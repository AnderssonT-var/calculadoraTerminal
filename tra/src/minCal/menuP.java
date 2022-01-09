package minCal;

import javax.swing.JOptionPane;

public class menuP {
    int op = 0, num1 = 0;
    double [][] matrizA = new double [12][3];
    
    public void menufun(){
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        menuCel();
        for (int fil =0; fil<12; fil++)
        {
            for (int col=0; col < 3; col++)
            {
                if (col == 0){
                    matrizA[fil][col] = fil+1;
                }else if (col == 1){
                    matrizA [fil][col] = num1;
                }else if (col == 2){
                    matrizA[fil][col] = 0;
                }
            }
        }
    }
    public void menuCel(){
        op = Integer.parseInt(JOptionPane.showInputDialog
        ("Opcion:"+
        "\n1) Suma"+
        "\n2) resta"+
        "\n3) Multiplicacion"+
        "\n4) Division"+
        "\n5) Salir"));
    }
}
