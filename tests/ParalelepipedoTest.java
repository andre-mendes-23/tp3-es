package tests;

import org.junit.jupiter.api.*;
import classes.Paralelepipedo;

public class ParalelepipedoTest {

    // Declaração das variáveis utilizadas nos testes
    private Paralelepipedo paralelepipedo;
    private double comprimento = 5.0;
    private double largura = 7.0;
    private double altura = 10.0;
     
    // Esta função é executada antes de cada teste.
    @BeforeEach
    public void setup() {
       paralelepipedo = new Paralelepipedo(comprimento, largura, altura);
    }

    @Test
    public void testGetComprimento() {
       Assertions.assertEquals(comprimento, paralelepipedo.getComprimento());
    }

    @Test
    public void testSetComprimento() {
       paralelepipedo.setComprimento(comprimento);
       Assertions.assertEquals(comprimento, paralelepipedo.getComprimento());
    }

    @Test
    public void testGetLargura() {
       Assertions.assertEquals(largura, paralelepipedo.getLargura());
    }

    @Test
    public void testSetLargura() {
       paralelepipedo.setLargura(largura);
       Assertions.assertEquals(largura, paralelepipedo.getLargura());
    }

    @Test
    public void testGetAltura() {
        Assertions.assertEquals(altura, paralelepipedo.getAltura());
    }

    @Test
    public void testSetAltura() {
        paralelepipedo.setAltura(altura);
        Assertions.assertEquals(altura, paralelepipedo.getAltura());
    }

    @Test
    public void testToString() {
        String stringEsperada = "Paralelepipedo{comprimento='5.0', largura='7.0', altura='10.0'}";
        Assertions.assertEquals(stringEsperada, paralelepipedo.toString());
    }

    @Test
    public void testCalcularArea() {
        double areaEsperada = 2.0 * (comprimento * largura + comprimento * altura + largura * altura);
        Assertions.assertEquals(areaEsperada, paralelepipedo.calcularArea());
    }

    @Test
    public void testCalcularVolume() {
        double volumeEsperado = comprimento * largura * altura;
        Assertions.assertEquals(volumeEsperado, paralelepipedo.calcularVolume());
    }

    public void testClone() throws CloneNotSupportedException {
        Paralelepipedo paralelepipedoClone = (Paralelepipedo) paralelepipedo.clone();

        Assertions.assertEquals(paralelepipedo.getComprimento(), paralelepipedoClone.getComprimento());
        Assertions.assertEquals(paralelepipedo.getLargura(), paralelepipedoClone.getLargura());
        Assertions.assertEquals(paralelepipedo.getAltura(), paralelepipedoClone.getAltura());

        Assertions.assertNotSame(paralelepipedo, paralelepipedoClone);
    }

}
