package org.example;

public class Configuracao {

    private Configuracao() {};
    private static Configuracao instancia = new Configuracao();
    public static Configuracao getInstancia() {
        return instancia;
    }

    private String idioma;
    private int volume;
    private boolean efeitosSonorosAtivados;

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean getEfeitosSonorosAtivados() {
        return efeitosSonorosAtivados;
    }

    public void setEfeitosSonorosAtivados(boolean efeitosSonorosAtivados) {
        this.efeitosSonorosAtivados = efeitosSonorosAtivados;
    }
}

