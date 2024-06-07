package tests;

import org.junit.jupiter.api.*;
import classes.Quadrado;

public class QuadradoTest {
    
    // Declaração das variáveis utilizadas nos testes
    private Quadrado quadrado;
    private double lado = 5.0;

    // Esta função é executada antes de cada teste.
    @BeforeEach
    public void setup() {
        quadrado = new Quadrado(lado);
    }

    @Test
    public void testGetLado() {
        Assertions.assertEquals(lado, quadrado.getLado());
    }

    @Test
    public void testSetLado() {
        quadrado.setLado(lado);
        Assertions.assertEquals(lado, quadrado.getLado());
    }

    @Test
    public void testToString() {
        String stringEsperada = "Quadrado{lado='5.0'}";
        Assertions.assertEquals(stringEsperada, quadrado.toString());
    }

    @Test
    public void testCalcularArea() {
        double areaEsperada = lado * lado;
        Assertions.assertEquals(areaEsperada, quadrado.calcularArea());
    }

    @Test
    public void testCalcularPerimetro() {
        double perimetroEsperado = 4 * lado;
        Assertions.assertEquals(perimetroEsperado, quadrado.calcularPerimetro());
    }

    @Test
    public void testClone() throws CloneNotSupportedException {
        Quadrado quadradoClone = (Quadrado) quadrado.clone();

        Assertions.assertEquals(quadrado.getLado(), quadradoClone.getLado());

        Assertions.assertNotSame(quadrado, quadradoClone);

    }

}
