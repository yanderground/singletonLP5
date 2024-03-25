package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class ConfiguracaoTest {


    @Test
    public void testaIdioma() {
        Configuracao configuracoes = Configuracao.getInstancia();

        configuracoes.setIdioma("Português");
        assertEquals("Português", configuracoes.getIdioma());
    }

    @Test
    public void testaVolume() {
        Configuracao configuracoes = Configuracao.getInstancia();

        configuracoes.setVolume(50);
        assertEquals(50, configuracoes.getVolume());
    }

    @Test
    public void testaEfeitoSonoroAtivado() {
        Configuracao configuracoes = Configuracao.getInstancia();

        configuracoes.setEfeitosSonorosAtivados(true);
        assertTrue(configuracoes.getEfeitosSonorosAtivados());
    }
}


