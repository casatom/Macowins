package Estado;

public class Liquidacion implements Estado {

    private Double descuento;

    @Override
    public Double precioFinal(Double precioBase) {
        return precioBase*(1 - descuento /100);
    }

    public Liquidacion(Double liquidacion) {
        if(liquidacion>100) this.descuento =100.0;
        else this.descuento = liquidacion;
    }

    public Liquidacion() {
        this.descuento = Double.valueOf(50);
    }
}
