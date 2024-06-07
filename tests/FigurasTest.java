package tests;

import org.junit.jupiter.api.*;
import classes.Figuras;

public class FigurasTest {

    // Declaração das variáveis utilizas nos testes
    private Figuras figuras;
    private String nomeFigura = "Circulo";

    // Esta função é executada antes de cada teste
    @BeforeEach
    public void setup(){
        figuras = new Figuras(nomeFigura);
    }

    @Test
    public void testGetNome() {
        Assertions.assertEquals(nomeFigura, figuras.getNome());
    }

    @Test
    public void testSetNome() {
        figuras.setNome(nomeFigura);
        Assertions.assertEquals(nomeFigura, figuras.getNome());
    }

    @Test
    public void testToString() {
        String stringEsperada = "Figuras{nome='Circulo'}";
        Assertions.assertEquals(stringEsperada, figuras.toString());
    }

}
