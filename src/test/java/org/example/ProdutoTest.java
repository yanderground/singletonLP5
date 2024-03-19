package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProdutoTest {    @Test
public void deveRetornarNome() {
    Produto.getInstance().setNome("Produto 2");
    assertEquals("Produto 2", Produto.getInstance().getNome());
}

    @Test
    public void devePrecoProduto() {
        Produto.getInstance().setPreco(39.00);
        assertEquals(39.00, Produto.getInstance().getPreco());
    }


}
