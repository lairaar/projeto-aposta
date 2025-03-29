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
public class organizador extends Pessoa {
    private String senha;
    
    organizador() {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o senha: ");
        this.senha = ler.nextLine();
    }
            
    boolean validarAcesso(String senhas) {
        return this.senha.equals(senhas);
    } 
}
