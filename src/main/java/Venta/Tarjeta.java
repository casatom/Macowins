package Venta;

public class Tarjeta extends Venta{
    private Integer cantudadCuotas;
    private Double coeficienteTarjeta;

    @Override
    public Double importe(){
        return coeficienteTarjeta*cantudadCuotas + 0.01*super.importe() + super.importe();
    }
}
