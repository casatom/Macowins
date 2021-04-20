package Estado;

public class Nueva implements Estado {

    @Override
    public Double precioFinal(Double precioBase) {
        return precioBase;
    }
}
