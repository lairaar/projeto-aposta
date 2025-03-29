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
public class Bolao {
    private aposta[] apostas;
    private jogador[] jogadores;
    private organizador[] organizadores;
    private sorteio[] sorteios;
    private int qtdApostas;
    private int qtdJogadores;
    private int qtdOrganizadores;
    private int qtdSorteios;
    
    public Bolao(){
    this.apostas = new aposta[1000];
    this.jogadores = new jogador[1000];
    this.organizadores = new organizador[1000];
    this.sorteios = new sorteio[1000];
    this.qtdApostas = 0;
    this.qtdJogadores = 0;
    this.qtdOrganizadores = 0;
    this.qtdSorteios = 0;
    
    }
    
    public void cadastrarJogador() {
        jogador w = new jogador();
        this.jogadores[this.qtdJogadores] = w;
        this.qtdJogadores = this.qtdJogadores + 1;
    }
    
    public void cadastrarOrganizador() {
        organizador w = new organizador();
        this.organizadores[this.qtdOrganizadores] = w;
        this.qtdOrganizadores = this.qtdOrganizadores + 1;
    }
    
    public void cadastrarAposta() {
        aposta w = new aposta();
        this.apostas[this.qtdApostas] = w;
        this.qtdApostas = this.qtdApostas + 1;
    }
    
    private void inserirNumerosAposta(aposta apt){
        int[] w = new int[apt.getQtdNumeros()];
        Scanner ler = new Scanner(System.in);
        
        for(int i = 0; i < apt.getQtdNumeros(); i++){
            System.out.println("Números: ");
            w[i] = ler.nextInt();        
        }
        apt.setNumeros(w);
    }
    
    private boolean existeJogador(String cpf){
        for(int i = 0; i < qtdJogadores; i++){
            if(jogadores[i].getCpf().equals(cpf)){
                return true;
            }          
        }
        return false;
    }
    
    private jogador localizaJogador(String cpf){
        if(existeJogador(cpf) == true){
            for(int i = 0; i < qtdJogadores; i++){
                if(jogadores[i].getCpf().equals(cpf)){
                    return jogadores[i];
            }   
        }   
      } 
       return jogadores[0];
    }
    
    private void inserirJogadoresAposta(aposta apt){
        Scanner ler = new Scanner(System.in);
        jogador[] joga = new jogador[this.qtdJogadores];
        for(int i = 0; i < this.qtdJogadores; i++){    
            System.out.println("Cpf: ");
            String cpf = ler.nextLine();
            if (this.existeJogador(cpf) == true){
                jogador j = localizaJogador(cpf);
                joga[i] = j;
            }
            else{
                System.out.println("Digite novamente o cpf: ");
                i--;
            }
        }
        apt.setJogadores(jogadores);
    }
    
    private boolean existeOrganizador(String cpf){
        for(int i = 0; i < qtdOrganizadores; i++){
            if(this.organizadores[i].getCpf().equals(cpf)){
                return true;
            }    
        }
        return false;
    }
    
    private organizador localizaOrganizador(String cpf){
        if(existeOrganizador(cpf) == true){
            for(int i = 0; i < qtdOrganizadores; i++){
                if(this.organizadores[i].getCpf().equals(cpf)){
                    return this.organizadores[i];
            }   
        }   
      } 
       return this.organizadores[0];
    }
    
    private void inserirOrganizadorAposta(aposta a){
        Scanner ler = new Scanner(System.in);
        organizador o;
        System.out.println("Cpf: ");
        String cpf = ler.nextLine();
        if (this.existeOrganizador(cpf) == true){
            o = this.localizaOrganizador(cpf);
            a.setOrg(o);
        }
        else{
            System.out.println("Digite novamente o cpf: ");
        }
    }
    
    public void cadastrarSorteio() {
        int qtdSorteios = 0;
        sorteio sort = new sorteio();
        this.qtdSorteios = this.qtdSorteios + 1;
    }
    
    private int numBilhetesPremiados(sorteio s){ 
        int numBilhetesPrem = 0;
        for(int i = 0; i < this.qtdApostas; i++){
            if(this.apostas[i].vencedora(s)){
                numBilhetesPrem ++;
            }
        }
        return numBilhetesPrem;
    }
    
    public void listarVencedores(){
        sorteio s = this.sorteios[qtdSorteios - 1];
            int bilhetPremiados = this.numBilhetesPremiados(s);
            if (bilhetPremiados > 0){
                for(int i = 0; i < this.qtdApostas; i++){
                    if (this.apostas[i].vencedora(s)){
                        this.apostas[i].listarVencedores(s.getPremio()/bilhetPremiados);
                    }
                }
            }
            else{
                System.out.println("Não houve nenhum jogador.");
            }
    }
    
    public void listarVencedores(String cod){
        sorteio s = this.sorteios[this.qtdSorteios];
        for(int i = 0; i < this.qtdSorteios; i++){
            if(this.sorteios[i].getCod().equals(cod)){
                for (int j = 0; j < this.qtdApostas; j++){
                    if (this.apostas[i].vencedora(this.sorteios[i])){
                        int bilhetPremiados = this.numBilhetesPremiados(this.sorteios[i]);
                        this.apostas[i].listarVencedores(s.getPremio()/bilhetPremiados);
                    }
                }    
            }
        }
    }
    
    public void listarVencedores(Data dat){
        sorteio s = this.sorteios[this.qtdSorteios];
        for (int i = 0; i < this.qtdSorteios; i++){
            if(this.sorteios[i].getData().equal(dat)){ 
                int bilhetPremiados = this.numBilhetesPremiados(this.sorteios[i]);
                for(int j = 0; j < this.qtdApostas; j++){
                    if (this.apostas[j].vencedora(this.sorteios[i])){
                        this.apostas[j].listarVencedores(s.getPremio()/bilhetPremiados);
                    } 
                }
            }
        }
    }
}

