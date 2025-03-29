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
public class aposta {
    private String id;
    private int[] numeros;
    private int qtdNumeros;
    private jogador[] jogadores;
    private int qtdJogadores;
    private organizador org;
    private Data data;
    
    aposta() {
        Scanner ler = new Scanner(System.in);
        
        System.out.printf("Digite o id: ");
        this.id = ler.nextLine();
        
        System.out.printf("Digite o a quantidade de numeros: ");
        this.qtdNumeros = ler.nextInt();
       
        this.numeros = new int[qtdNumeros];
        
        
        System.out.printf("Digite o número: ");
        this.qtdNumeros = ler.nextInt();
        
        
        System.out.printf("Digite o a quantidade de jogadores: ");
        this.qtdJogadores = ler.nextInt();
       
        this.jogadores = new jogador[qtdJogadores];
        
        this.org = new organizador();
        
        this.data = new Data();
        
    }
    

    public int getQtdNumeros() {
        return qtdNumeros;
    }

    public int getQtdJogadores() {
        return qtdJogadores;
    }

    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }

    public void setJogadores(jogador[] jogadores) {
        this.jogadores = jogadores;
    }

    public void setOrg(organizador org) {
        this.org = org;
    }

    public Data getData() {
        return data;
    }
    
    public void listarVencedores(double premio){
        double dezporcento = premio * 0.1;
        premio = premio - dezporcento;
        double qntdistrib = premio / (this.qtdJogadores + 1);
    }

    public boolean vencedora(sorteio s) {  
        s.getData().databonitinha();
        this.getData().databonitinha();
        if(this.getData().mesmaSemana(s.getData())){
            int aux = 0;
            for(int i = 0; i < this.qtdNumeros; i++){
                for(int j = 0; j < 6; j++){
                    if(this.numeros[i] == s.getNumeros()[j]){
                        aux++;
                    }
                }
            }
            if(aux == 6){
                return true; 
            }
        } else {
        }
        return false;
    }
    
}
