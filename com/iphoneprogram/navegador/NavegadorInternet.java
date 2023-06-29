package com.iphoneprogram.navegador;

public interface NavegadorInternet {
    void abrirURL(String url);
    void fecharURL();
    void navegarPaginaAnterior();
    void navegarProximaPagina();
}