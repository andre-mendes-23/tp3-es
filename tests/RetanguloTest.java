package tests;

import org.junit.jupiter.api.*;
import classes.Retangulo;

public class RetanguloTest {

    // Declaração das variáveis utilizadas nos testes
    private Retangulo retangulo;
    private double comprimento = 5.0;
    private double largura = 10.0;

    // Esta função é executada antes de cada teste.
    @BeforeEach
    public void setup() {
        retangulo = new Retangulo(comprimento, largura);
    }

    @Test
    public void testGetComprimento() {
        Assertions.assertEquals(comprimento, retangulo.getComprimento());
    }

    @Test
    public void testSetComprimento() {
        retangulo.setComprimento(comprimento);
        Assertions.assertEquals(comprimento, retangulo.getComprimento());
    }

    @Test
    public void testGetLargura() {
        Assertions.assertEquals(largura, retangulo.getLargura());
    }

    @Test
    public void testSetLargura() {
        retangulo.setLargura(largura);
        Assertions.assertEquals(largura, retangulo.getLargura());
    }

    @Test
    public void testToString() {
        String stringEsperada = "Retangulo{comprimento='5.0', largura='10.0'}";
        Assertions.assertEquals(stringEsperada, retangulo.toString());
    }

    @Test
    public void testCalcularArea() {
        double areaEsperada = comprimento * largura;
        Assertions.assertEquals(areaEsperada, retangulo.calcularArea());
    }

    @Test
    public void testCalcularPerimetro() {
        double perimetroEsperado = 2 * (comprimento + largura);
        Assertions.assertEquals(perimetroEsperado, retangulo.calcularPerimetro());
    }

    @Test
    public void testClone() throws CloneNotSupportedException {
        Retangulo retanguloClone = (Retangulo) retangulo.clone();

        Assertions.assertEquals(retangulo.getComprimento(), retanguloClone.getComprimento());
        Assertions.assertEquals(retangulo.getLargura(), retanguloClone.getLargura());

        Assertions.assertNotSame(retangulo, retanguloClone);
    }

}
