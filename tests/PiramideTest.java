package tests;

import java.lang.Math;
import org.junit.jupiter.api.*;
import classes.Piramide;

public class PiramideTest {

    // Declaração das variáveis utilizadas nos testes
    private Piramide piramide;
    private double arestaDaBase = 5.0;
    private double altura = 10.0;

    // Esta função é executada antes de cada teste
    @BeforeEach
    public void setup() {
        piramide = new Piramide(arestaDaBase, altura);
    }

    @Test
    public void testGetArestaDaBase() {
        Assertions.assertEquals(arestaDaBase, piramide.getArestaDaBase());
    }

    @Test
    public void testSetArestaDaBase() {
        double novaArestaDaBase = 2.0;    
        piramide.setArestaDaBase(novaArestaDaBase);
    }

    @Test
    public void testGetAltura() {
        Assertions.assertEquals(altura, piramide.getAltura());
    }

    @Test
    public void testSetAltura() {
        double novaAltura = 7.0;
        piramide.setAltura(novaAltura);
    }

    @Test
    public void testToString() {
        String stringEsperada = "Piramide{arestaDaBase='5.0', altura='10.0'}";
        Assertions.assertEquals(stringEsperada, piramide.toString());
    }

    @Test
    public void testCalcularArea() {
        double hipotenusa = (altura * altura) + ((arestaDaBase / 2.0 )*(arestaDaBase / 2.0 ));
        double alturaDaFace = Math.sqrt(hipotenusa);
        double areaLateral = (arestaDaBase * alturaDaFace) / 2.0;
        double areaEsperada = (areaLateral * 4.0) + (arestaDaBase * arestaDaBase);
        Assertions.assertEquals(areaEsperada, piramide.calcularArea());
    }

    @Test
    public void testCalcularVolume() {
        double areaDaBase = arestaDaBase * arestaDaBase;
        double volumeEsperado = (areaDaBase * altura) / 3.0;
        Assertions.assertEquals(volumeEsperado, piramide.calcularVolume());
    }

    @Test
    public void testClone() throws CloneNotSupportedException {
        Piramide piramideClone = (Piramide) piramide.clone();

        Assertions.assertEquals(piramide.getArestaDaBase(), piramideClone.getArestaDaBase());
        Assertions.assertEquals(piramide.getAltura(), piramideClone.getAltura());

        Assertions.assertNotSame(piramide, piramideClone);
    }

}
