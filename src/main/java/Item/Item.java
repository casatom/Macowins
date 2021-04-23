package Item;

public class Item {

    private Integer cantidad;
    private Prenda prenda;

    public Double importe(){
        return prenda.precio()*this.cantidad;
    }

    public Item(Integer cantidad, Prenda prenda) {
        this.cantidad = cantidad;
        this.prenda = prenda;
    }
}
