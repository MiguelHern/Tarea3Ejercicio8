/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea3ejercicio8;

/**
 *
 * @author marti
 */
public class Tarea3Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cat[][];
        cat = new String [3][3];
        cat[0][0]="0";
        cat[0][1]="x";
        cat[0][2]="0";
        cat[1][0]="0";
        cat[1][1]="0";
        cat[1][2]="0";
        cat[2][0]="0";
        cat[2][1]="0";
        cat[2][2]="0";
        for (int i=0;i<3;i++)
        {
            for (int j=0;i<3;j++){
                System.out.println("x["+i+"]["+j+"]=" +cat[i][j]);}
                }
        
    }
    
}
