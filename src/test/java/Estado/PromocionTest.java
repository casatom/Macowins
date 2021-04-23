package Estado;

import org.junit.Assert;
import org.junit.Test;

public class PromocionTest {

    public Double delta = new Double(1e-15);

    @Test
    public void evaluarPromocion(){
        Promocion promo = new Promocion(70);

        Assert.assertEquals(500.0, promo.precioFinal(570.0),delta);
    }

    @Test
    public void evaluarSobrePromocion(){
        Promocion promo = new Promocion(70);

        Assert.assertEquals(0.0, promo.precioFinal(50.0),delta);
    }


}
