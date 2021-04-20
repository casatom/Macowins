package Estado;

public class Promocion implements Estado{

    //TODO solo que sea natural
    private Integer descuento;

    @Override
    public Double precioFinal(Double precioBase) {
        return precioBase-this.descuento;
    }
}
