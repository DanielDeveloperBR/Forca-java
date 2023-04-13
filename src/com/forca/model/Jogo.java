package com.forca.model;

public class Jogo {
    private String Palavra;
    private String erros;
    private String acertos;

    
    public String getPalavra() {
        return Palavra;
    }
    public void setPalavra(String palavra) {
        Palavra = palavra;
    }
    public String getErros() {
        return erros;
    }
    public void setErros(String erros) {
        this.erros = erros;
    }
    public String getAcertos() {
        return acertos;
    }
    public void setAcertos(String acertos) {
        this.acertos = acertos;
    }
    

}
