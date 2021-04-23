package Item;

import Estado.Liquidacion;
import Estado.Nueva;
import Estado.Promocion;
import org.junit.Assert;
import org.junit.Test;

public class PrendaTest {
    public Double delta = new Double(1e-15);

    @Test
    public void evaluarPrenda(){
        //Evaluamos que prendas que solo cambien su estado cambien de precio
        Prenda prenda1 = new Prenda(new Promocion(50),300.0,TipoItem.SACO);
        Prenda prenda2 = new Prenda(new Liquidacion(),300.0,TipoItem.SACO);
        Prenda prenda3 = new Prenda(new Liquidacion(25.0),300.0,TipoItem.SACO);
        Prenda prenda4 = new Prenda(new Nueva(),300.0,TipoItem.SACO);

        Assert.assertEquals(250.0,prenda1.precio(),delta);
        Assert.assertEquals(150.0,prenda2.precio(),delta);
        Assert.assertEquals(225.0,prenda3.precio(),delta);
        Assert.assertEquals(300.0,prenda4.precio(),delta);

    }

    //TODO ver que test faltan

}
