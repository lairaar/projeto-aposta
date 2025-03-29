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
public class jogador extends Pessoa {
    private conta dadosBancarios;

    jogador() {
        super();
        
        this.dadosBancarios = new conta();
    }
    
    @Override
    public void imprimirDados() {
        super.imprimirDados(); //To change body of generated methods, choose Tools | Templates.
        this.dadosBancarios.dadosDeposito();
    }
   
}
