package Estado;

public class Promocion implements Estado{

    private Integer descuento;

    @Override
    public Double precioFinal(Double precioBase) {
        if(precioBase<=this.descuento) return Double.valueOf(0);
        return precioBase-this.descuento;
    }

    public Promocion(Integer descuento) {
        this.descuento = descuento;
    }
}
