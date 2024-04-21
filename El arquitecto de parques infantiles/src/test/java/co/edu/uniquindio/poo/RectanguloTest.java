package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

public class RectanguloTest {
    private static final Logger LOG = Logger.getLogger(RectanguloTest.class.getName());

@Test
public void AreaRectanguloAnchoAltoPositivos (){
    LOG.info("Iniciando test AreaRectanguloAnchoAltoPositivos");

    var rectangulo = new Rectangulo(10, 20);

    assertEquals(200.0, rectangulo.calcularArea(), App.PRECISION);

    LOG.info("Finalizando test AreaRectanguloAnchoAltoPositivos");
}
@Test
public void AreaRectanguloAnchoNegativoAltoPositivo (){
    LOG.info("Iniciando test AreaRectanguloAnchoNegativoAltoPositivo");

    assertThrows(Throwable.class, ()-> new Rectangulo (-10, 20));

    LOG.info("Finalizando test AreaRectanguloAnchoNegativoAltoPositivo");
}
@Test
public void AreaRectanguloAnchoPositivoAltoNegativo (){
    LOG.info("Iniciando test AreaRectanguloAnchoPositivoAltoNegativo");

    assertThrows(Throwable.class, ()-> new Rectangulo (10, -20));

    LOG.info("Finalizando test AreaRectanguloAnchoPositivoAltoNegativo");
}
}
