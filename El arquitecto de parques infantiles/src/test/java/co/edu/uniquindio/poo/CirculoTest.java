package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

public class CirculoTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

@Test
public void circuloRadiopositivo (){
    LOG.info("Iniciando test circuloRadiopositivo");

    Circulo circulo= new Circulo(10);

    assertEquals(314.159, circulo.calcularArea(), App.PRECISION);

    LOG.info("Finalizando test circuloRadiopositivo");
}
@Test
public void circuloRadioNegativo (){
    LOG.info("Iniciando test circuloRadioNegativo");

    assertThrows(Throwable.class,()-> new Circulo(-10) );

    LOG.info("Finalizando test circuloRadioNegativo");
}
    
}
