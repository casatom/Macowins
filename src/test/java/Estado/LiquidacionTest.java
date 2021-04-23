package Estado;

import org.junit.Assert;
import org.junit.Test;

public class LiquidacionTest {

    public Double delta = new Double(1e-15);
    @Test
    public void pruebaLiquidacionDefault(){
        Liquidacion liquidacion = new Liquidacion();
        Assert.assertEquals(160.0,liquidacion.precioFinal(320.0),delta);
    }

    @Test
    public void pruebaLiquidacionModificable(){
        Liquidacion liquidacion = new Liquidacion(75.0);
        Assert.assertEquals(80.0,liquidacion.precioFinal(320.0),delta);

        liquidacion = new Liquidacion(25.0);
        Assert.assertEquals(240.0,liquidacion.precioFinal(320.0),delta);

        //si la liquidacion excede del 100% se le coloca como default 100%
        liquidacion = new Liquidacion(300.0);
        Assert.assertEquals(0.0,liquidacion.precioFinal(320.0),delta);
    }
}
