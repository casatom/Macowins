package Estado;

import org.junit.Assert;
import org.junit.Test;

public class NuevaTest {

    public Double delta = new Double(1e-15);
    @Test
    public void evaluarNueva(){
        Nueva prendaNueva = new Nueva();

        Assert.assertEquals(50.0, prendaNueva.precioFinal(50.0),delta);
    }
}
