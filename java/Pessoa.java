/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho1;

import java.util.Scanner;

/**
 *
 * @author hsjunior
 */
public class Pessoa {
    protected String nome;
    protected String cpf;
    
    Pessoa() {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o nome: ");
        this.nome = ler.nextLine();

        System.out.println("Digite o cpf ");
        this.cpf = ler.nextLine();
        
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void imprimirDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
    }
}
