package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

public class TrianguloRectanguloTest {
    private static final Logger LOG = Logger.getLogger(TrianguloRectanguloTest.class.getName());

@Test
public void AreaTrianguloRectanguloBaseAlturaPositivas (){
    LOG.info("Iniciando test AreaTrianguloRectanguloBaseAlturaPositivas");

    TrianguloRectangulo trianguloRectangulo = new TrianguloRectangulo (10, 20);

    assertEquals(100.0, trianguloRectangulo.calcularArea(), App.PRECISION);

    LOG.info("Iniciando test AreaTrianguloRectanguloBaseAlturaPositivas");
}
@Test
public void AreaTrianguloRectanguloBaseNegativaAlturaPositiva (){
    LOG.info("Iniciando test AreaTrianguloRectanguloBaseNegativaAlturaPositiva");

    assertThrows(Throwable.class, ()-> new TrianguloRectangulo(-10, 20));

    LOG.info("Iniciando test AreaTrianguloRectanguloBaseNegativaAlturaPositiva");
}
@Test
public void AreaTrianguloRectanguloBasePositivaAlturaNegativa (){
    LOG.info("Iniciando test AreaTrianguloRectanguloBasePositivaAlturaNegativa");

    assertThrows(Throwable.class, ()-> new TrianguloRectangulo(10, -20));

    LOG.info("Iniciando test AreaTrianguloRectanguloBasePositivaAlturaNegativa");
}

}
