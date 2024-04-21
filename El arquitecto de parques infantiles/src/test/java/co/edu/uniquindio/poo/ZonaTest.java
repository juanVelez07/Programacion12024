package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

public class ZonaTest {
    private static final Logger LOG = Logger.getLogger(ZonaTest.class.getName());

@Test
public void ZonaCircularArena (){
    LOG.info("Iniciando test ZonaCircularArena");

    var zona = new Zona("Zona 1", new Circulo(10), Material.ARENA);

    assertEquals(3141592.65, zona.calcularValorZona(), App.PRECISION);

    LOG.info("Finalizando test ZonaCircularArena");
}
}
