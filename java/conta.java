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
public class conta {
    private String banco;
    private String cod;
    private String agencia;
    private String conta;
    
    conta() {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o banco: ");
        this.banco = ler.nextLine();

        System.out.println("Digite o codigo: ");
        this.cod = ler.nextLine();
        
        System.out.println("Digite a agencia: ");
        this.agencia = ler.nextLine();
        
        System.out.println("Digite o conta: ");
        this.conta = ler.nextLine();
        
    }
    
    public void dadosDeposito() {
        System.out.println("*** DADOS DO DEPÓSITO ***");
        System.out.println("Banco: " + this.banco);
        System.out.println("Codigo: " + this.cod);
        System.out.println("Agência: " + this.agencia);
        System.out.println("Conta: " + this.conta);
    
    }    
    
}
