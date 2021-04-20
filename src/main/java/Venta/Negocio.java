package Venta;

import java.time.LocalDate;
import java.util.List;

public class Negocio {
    private List<Venta> ventas;

    public Double gananciasDe(LocalDate fecha){
        return ventas.stream().filter(v->v.esDeFecha(v.getFecha())).mapToDouble(v->v.importe()).sum();
    }
}
