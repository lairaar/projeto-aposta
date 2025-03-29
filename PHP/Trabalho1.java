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
public class Trabalho1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bolao b = new Bolao();
        String menu = "*** Bem-vindo ao BOLÃO! Escolha uma opção:\n (1) Cadastrar jogador\n"
                + " (2) Cadastrar organizador\n (3) Cadastrar aposta\n (4) Cadastrar sorteio\n"
                + " (5) Listar vencedores\n (6) Listar por código do sorteio\n"
                + " (7) Listar por data do sorteio\n"
                + " (0) Sair ***";

        System.out.println(menu);
        Scanner ler = new Scanner(System.in);
        int opcao = ler.nextInt();
        while (opcao != 0) {
            switch(opcao) {
                case 1:
                    b.cadastrarJogador();
                    break;
                case 2:
                    b.cadastrarOrganizador();
                    break;
                case 3:
                    b.cadastrarAposta();
                    break;
                case 4:
                    b.cadastrarSorteio();
                    break;
                case 5:
                    b.listarVencedores();
                    break;
                case 6:
                    System.out.println("Digite o codigo do sorteio: ");
                    String cod = ler.next();
                    b.listarVencedores(cod);
                    break;
                case 7:
                    b.listarVencedores(new Data());
                    break;
                default:
                    System.out.println("Opção inválida");
            }
            System.out.println(menu);
            opcao = ler.nextInt();
        }
   
    }
    
}
