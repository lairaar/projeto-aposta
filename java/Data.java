/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho1;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

/**
 *
 * @author hsjunior
 */
public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data() {
        Scanner ler = new Scanner(System.in);
        
        System.out.printf("Digite o dia: ");
        this.dia = ler.nextInt();

        System.out.printf("Digite o mes: ");
        this.dia = ler.nextInt();

        System.out.printf("Digite o ano: ");
        this.dia = ler.nextInt();

    }
    
    public boolean mesmaSemana(Data dataSorteio) {
        LocalDate d1 = LocalDate.of(this.ano, this.mes, this.dia);
        LocalDate d2 = LocalDate.of(dataSorteio.ano, dataSorteio.mes, dataSorteio.dia);
        
        int diferenca = Period.between(d1, d2).getDays();
        if (diferenca > 0 && diferenca < 7) return true;
        else return false;
    }
    
    public boolean equal(Data d2){
            if(this.ano == d2.ano) {
                if(this.mes == d2.mes) {
                    if(this.dia == d2.dia) {
                        return true;
                    }
                }
            }
    return false;
    }
    
    public void databonitinha() {
        System.out.println(this.dia+"/"+this.mes+"/"+this.ano);
    }
}
