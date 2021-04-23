package Venta;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

public class Negocio {
    private List<Venta> ventas;

    public Double gananciasDe(LocalDate fecha){
        return ventas.stream().filter(v->v.esDeFecha(fecha)).mapToDouble(v->v.importe()).sum();
    }

    public Negocio(List<Venta> ventas) {
        this.ventas = ventas;
    }

    public Negocio(Venta  ... ventas) {
        Collections.addAll(this.ventas,ventas);
    }
}
