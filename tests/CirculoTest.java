package tests;

import org.junit.jupiter.api.*;
import classes.Circulo;

public class CirculoTest {

    // Declaração das variáveis utilizadas nos testes
    private Circulo circulo;
    private double raio = 5.0;
    final double pi = 3.14;

    // Esta função é executada antes de cada teste
    @BeforeEach
    public void setup() {
        circulo = new Circulo(raio);
    }

    @Test
    public void testGetRaio() {
        Assertions.assertEquals(raio, circulo.getRaio());
    }

    @Test
    public void testSetRaio() {
        circulo.setRaio(raio);
        Assertions.assertEquals(raio, circulo.getRaio());
    }

    @Test
    public void testGetPi() {
        Assertions.assertEquals(pi, circulo.getPi());
    }

    @Test
    public void testToString() {
        String stringEsperada = "Circulo{raio='5.0'}";
        Assertions.assertEquals(stringEsperada, circulo.toString());
    }

    @Test
    public void testCalcularArea() {
        double areaEsperada = pi * (raio * raio);
        Assertions.assertEquals(areaEsperada, circulo.calcularArea());
    }

    @Test
    public void testCalcularPerimetro() {
        double perimetroEsperado = 2 * pi * raio;
        Assertions.assertEquals(perimetroEsperado, circulo.calcularPerimetro());
    }

    @Test
    public void testClone() throws CloneNotSupportedException {
        Circulo circuloClone = (Circulo) circulo.clone();

        Assertions.assertEquals(circulo.getRaio(), circuloClone.getRaio());

        Assertions.assertNotSame(circulo, circuloClone);
    }

}