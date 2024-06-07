package tests;

import org.junit.jupiter.api.*;
import classes.Trapezio;

public class TrapezioTest {

    // Declaração das variáveis utilizadas nos testes
    private Trapezio trapezio;
    private double baseMaior = 5.0;
    private double baseMenor = 7.0;
    private double lado1 = 1.0;
    private double lado2 = 3.0;
    private double altura = 10.0;

    // Esta função é executada antes de cada teste.
    @BeforeEach
    public void setup() {
        trapezio = new Trapezio(baseMaior, baseMenor, lado1, lado2, altura);
    }

    @Test
    public void testGetBaseMaior() {
        Assertions.assertEquals(baseMaior, trapezio.getBaseMaior());
    }

    @Test
    public void testSetBaseMaior() {
        trapezio.setBaseMaior(baseMaior);
        Assertions.assertEquals(baseMaior, trapezio.getBaseMaior());
    }
    
    @Test
    public void testGetBaseMenor() {
        Assertions.assertEquals(baseMenor, trapezio.getBaseMenor());
    }

    @Test
    public void testSetBaseMenor() {
        trapezio.setBaseMenor(baseMenor);
        Assertions.assertEquals(baseMenor, trapezio.getBaseMenor());
    }    

    @Test
    public void testGetLado1() {
        Assertions.assertEquals(lado1, trapezio.getLado1());
    }

    @Test
    public void testSetLado1() {
        trapezio.setLado1(lado1);
        Assertions.assertEquals(lado1, trapezio.getLado1());
    }
    
    @Test
    public void testGetLado2() {
        Assertions.assertEquals(lado2, trapezio.getLado2());
    }

    @Test
    public void testSetLado2() {
        trapezio.setLado2(lado2);
        Assertions.assertEquals(lado2, trapezio.getLado2());
    }

    @Test
    public void testGetAltura() {
        Assertions.assertEquals(altura, trapezio.getAltura());
    }

    @Test
    public void testSetAltura() {
        trapezio.setAltura(altura);
        Assertions.assertEquals(altura, trapezio.getAltura());
    }

    @Test
    public void testToString() {
        String stringEsperada = "Trapezio{baseMaior='5.0', baseMenor='7.0', lado1='1.0', lado2='3.0', altura='10.0'}";
        Assertions.assertEquals(stringEsperada, trapezio.toString());
    }

    @Test
    public void testCalcularArea() {
        double areaEsperada = ((baseMaior + baseMenor) * altura) / 2;
        Assertions.assertEquals(areaEsperada, trapezio.calcularArea());
    }

    @Test
    public void testCalcularPerimetro() {
        double perimetroEsperado = baseMaior + baseMenor + lado1 + lado2;
        Assertions.assertEquals(perimetroEsperado, trapezio.calcularPerimetro());
    }

    @Test
    public void testClone() throws CloneNotSupportedException {
        Trapezio trapezioClone = (Trapezio) trapezio.clone();

        Assertions.assertEquals(trapezio.getBaseMaior(), trapezioClone.getBaseMaior());
        Assertions.assertEquals(trapezio.getBaseMenor(), trapezioClone.getBaseMenor());
        Assertions.assertEquals(trapezio.getLado1(), trapezioClone.getLado1());
        Assertions.assertEquals(trapezio.getLado2(), trapezioClone.getLado2());

        Assertions.assertNotSame(trapezio, trapezioClone);

    }

}
