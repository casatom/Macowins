package Item;

import Estado.Estado;

public class Prenda {

    private Estado estado;
    private Double precioBase;
    private TipoItem tipoItem;


    public Double precio(){
        return  this.estado.precioFinal(this.precioBase);
    }

    public Prenda(Estado estado, Double precioBase, TipoItem tipoItem) {
        this.estado = estado;
        this.precioBase = precioBase;
        this.tipoItem = tipoItem;
    }
}
