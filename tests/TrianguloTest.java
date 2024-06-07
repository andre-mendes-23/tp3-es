package tests;

import org.junit.jupiter.api.*;
import classes.Triangulo;

public class TrianguloTest {

    // Declaração das variáveis utilizadas nos testes
    private Triangulo triangulo;
    private double lado1 = 5.0;
    private double lado2 = 7.0;
    private double altura = 10.0;

    // Esta função é executada antes de cada teste.
    @BeforeEach
    public void setup() {
        triangulo = new Triangulo(lado1, lado2, altura);
    }

    @Test
    public void testGetLado1() {
        Assertions.assertEquals(lado1, triangulo.getLado1());
    }

    @Test
    public void testSetLado1() {
        triangulo.setLado1(lado1);
        Assertions.assertEquals(lado1, triangulo.getLado1());
    }

    @Test
    public void testGetLado2() {
        Assertions.assertEquals(lado2, triangulo.getLado2());
    }

    @Test
    public void testSetLado2() {
        triangulo.setLado1(lado2);
        Assertions.assertEquals(lado2, triangulo.getLado2());
    }

    @Test
    public void testGetAltura() {
        Assertions.assertEquals(altura, triangulo.getAltura());
    }

    @Test
    public void testSetAltura() {
        triangulo.setAltura(altura);
        Assertions.assertEquals(altura, triangulo.getAltura());
    }

    @Test
    public void testToString() {
        String stringEsperada = "Triangulo{lado1='5.0', lado2='7.0', altura='10.0'}";
        Assertions.assertEquals(stringEsperada, triangulo.toString());
    }

    @Test
    public void testCalcularArea() {
        double areaEsperada = (lado1 * altura) / 2;
        Assertions.assertEquals(areaEsperada, triangulo.calcularArea(), 0.001);
    }

    @Test
    public void testCalcularPerimetro() {
        double perimetroEsperado = lado1 + lado2 + altura;
        Assertions.assertEquals(perimetroEsperado, triangulo.calcularPerimetro());
    }

    @Test
    public void testClone() throws CloneNotSupportedException {
        Triangulo trianguloClone = (Triangulo) triangulo.clone();

        Assertions.assertEquals(triangulo.getLado1(), trianguloClone.getLado1());
        Assertions.assertEquals(triangulo.getLado2(), trianguloClone.getLado2());
        Assertions.assertEquals(triangulo.getAltura(), trianguloClone.getAltura());
        
        Assertions.assertNotSame(triangulo, trianguloClone);
    }

}
