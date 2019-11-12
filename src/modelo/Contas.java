
package modelo;

import java.util.Date;


public class Contas {
    //variaveis necessárias para inserir no banco de dados
    private int boletoCod;
    private String boletoValor;
    private String boletoDataVencimento;
    private String acrecimoMulta;
    private String acrecimoJuros;
    private String acrecimoNovoValor;

    //get e set para todas as variáveis
    public int getBoletoCod() {
        return boletoCod;
    }

    public void setBoletoCod(int boletoCod) {
        this.boletoCod = boletoCod;
    }

    public String getBoletoValor() {
        return boletoValor;
    }

    public void setBoletoValor(String boletoValor) {
        this.boletoValor = boletoValor;
    }

    public String getBoletoDataVencimento() {
        return boletoDataVencimento;
    }

    public void setBoletoDataVencimento(String boletoDataVencimento) {
        this.boletoDataVencimento = boletoDataVencimento;
    }

    public String getAcrecimoMulta() {
        return acrecimoMulta;
    }

    public void setAcrecimoMulta(String acrecimoMulta) {
        this.acrecimoMulta = acrecimoMulta;
    }

    public String getAcrecimoJuros() {
        return acrecimoJuros;
    }

    public void setAcrecimoJuros(String acrecimoJuros) {
        this.acrecimoJuros = acrecimoJuros;
    }

    public String getAcrecimoNovoValor() {
        return acrecimoNovoValor;
    }

    public void setAcrecimoNovoValor(String acrecimoNovoValor) {
        this.acrecimoNovoValor = acrecimoNovoValor;
    }
    
    
}
