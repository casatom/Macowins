package Estado;

public class Liquidacion implements Estado {

    @Override
    public Double precioFinal(Double precioBase) {

        return precioBase/2;
    }
}
