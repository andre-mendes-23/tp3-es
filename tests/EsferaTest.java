package tests;

import org.junit.jupiter.api.*;
import classes.Esfera;

public class EsferaTest {

    // Declaração das variáveis utilizadas nos testes
    private Esfera esfera;
    private double raio = 5.0;
    final double pi = 3.14;

    // Esta função é executada antes de cada teste
    @BeforeEach
    public void setup() {
        esfera = new Esfera(raio);
    }

    @Test
    public void testGetRaio() {
        Assertions.assertEquals(raio, esfera.getRaio());
    }

    @Test
    public void testSetRaio() {
        double novoRaio = 3.0;
        esfera.setRaio(novoRaio);
    }

    public void testGetPi() {
        Assertions.assertEquals(pi, esfera.getPi());
    }

    @Test
    public void testToString() {
        String stringEsperada = "Esfera{raio='5.0'}";
        Assertions.assertEquals(stringEsperada, esfera.toString());
    }

    @Test
    public void testCalcularArea() {
        double areaEsperada = 4.0 * pi * raio * raio;
        Assertions.assertEquals(areaEsperada, esfera.calcularArea());
    }

    @Test
    public void testCalcularVolume() {
        double volumeEsperado = (4.0 / 3.0) * pi * raio * raio * raio;
        Assertions.assertEquals(volumeEsperado, esfera.calcularVolume());
    }

    @Test
    public void testClone() throws CloneNotSupportedException {
        Esfera esferaClone = (Esfera) esfera.clone();

        Assertions.assertEquals(esfera.getRaio(), esferaClone.getRaio());

        Assertions.assertNotSame(esfera, esferaClone);

    }

}
