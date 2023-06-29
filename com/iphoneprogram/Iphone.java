package com.iphoneprogram;
import com.iphoneprogram.navegador.NavegadorInternet;
import com.iphoneprogram.reprodutor.ReprodutorMusical;
import com.iphoneprogram.telefone.AparelhoTelefonico;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    
    public void reproduzirMusica() {
        System.out.println("Iniciando Musica...");
    }
    
    public void pausarMusica() {
        System.out.println("Musica Pausada");
    }
    
    public void avancarMusica() {
        System.out.println("Proxima Musica");
    }
    
    public void retrocederMusica() {
        System.out.println("Musica Anterior");
    }
    
    public void fazerChamada(String numero) {
        System.out.println("Iniciando Chamada...");
    }
    
    public void receberChamada(String numero) {
        System.out.println("Voce está recebendo uma ligação!");
    }
    
    public void finalizarChamada() {
        System.out.println("Chamada encerrada");
    }
    
    public void abrirURL(String url) {
        System.out.println("Abrindo Site");
    }
    
    public void fecharURL() {
        System.out.println("Site Fechado!");
    }
    
    public void navegarPaginaAnterior() {
        System.out.println("Pagina Anterior");
    }
    
    public void navegarProximaPagina() {
        System.out.println("Proxima Pagina");
    }
}