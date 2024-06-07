package tests;

import org.junit.jupiter.api.*;
import classes.Cilindro;

public class CilindroTest {

    // Declaração das variáveis utilizadas nos testes
    private Cilindro cilindro;
    private double raio = 5.0;
    private double altura = 10.0;
    final double pi = 3.14;


    // Esta função é executada antes de cada teste
    @BeforeEach
    public void setup() {
        cilindro = new Cilindro(raio, altura);
    }

    @Test
    public void testGetRaio() {
        Assertions.assertEquals(raio, cilindro.getRaio());
    }

    @Test
    public void testSetRaio() {
        cilindro.setRaio(raio);
        Assertions.assertEquals(raio, cilindro.getRaio());
    }

    @Test
    public void testGetAltura() {
        Assertions.assertEquals(altura, cilindro.getAltura());
    }

    @Test
    public void testSetAltura() {
        cilindro.setAltura(altura);
        Assertions.assertEquals(altura, cilindro.getAltura());
    }

    @Test
    public void testGetPi() {
        Assertions.assertEquals(pi, cilindro.getPi());
    }

    @Test
    public void testToString() {
        String stringEsperada = "Cilindro{raio='5.0', altura='10.0'}";
        Assertions.assertEquals(stringEsperada, cilindro.toString());
    }

    @Test
    public void testCalcularArea() {
        double areaEsperada = 2 * pi * raio * (raio + altura);
        Assertions.assertEquals(areaEsperada, cilindro.calcularArea());
    }

    @Test
    public void testCalcularVolume() {
        double volumeEsperado = pi * raio * raio * altura;
        Assertions.assertEquals(volumeEsperado, cilindro.calcularVolume());
    }

    @Test
    public void testClone() throws CloneNotSupportedException {
        Cilindro cilindroClone = (Cilindro) cilindro.clone();

        Assertions.assertEquals(cilindro.getRaio(), cilindroClone.getRaio());
        Assertions.assertEquals(cilindro.getAltura(), cilindroClone.getAltura());

        Assertions.assertNotSame(cilindro, cilindroClone);
    }

}