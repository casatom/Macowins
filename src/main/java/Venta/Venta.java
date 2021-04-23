package Venta;

import Item.Item;

import java.time.LocalDate;
import java.util.List;

public class Venta {

    private LocalDate fecha;
    private List<Item> items;

    public Boolean esDeFecha(LocalDate fecha){
            return this.fecha.isEqual(fecha);
    }

    public Double importe(){
        return items.stream().mapToDouble(v -> v.importe()).sum();
    }
}
