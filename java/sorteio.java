/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho1;
import java.util.Scanner;
/**
 *
 * @author 20171tiimi0270
 */
public class sorteio {
    private String cod;
    private int[] numeros;
    private Data data;
    private double premio;
    
     
    sorteio() {
        Scanner ler = new Scanner(System.in);
        
        System.out.printf("Digite o codigo: ");
        this.cod = ler.nextLine();
        
        this.numeros = new int[6];
        
        for(int i = 0; i < 6; i++){
            System.out.printf("Digite o " + (i + 1) +  " número: ");
            this.numeros[i] = ler.nextInt();
        }
    
        this.data = new Data();
        
        
        System.out.printf("Digite o premio: ");
        this.premio = ler.nextInt();
    }

    public double getPremio() {
        return premio;
    }
    

    public Data getData() {
        return data;
    }

    public String getCod() {
        return cod;
    }

    public int[] getNumeros() {
        return numeros;
    }
    
    
}
