package Item;

public class Item {

    private Integer cantidad;
    Prenda prenda;

    public Double importe(){
        return prenda.precio()*this.cantidad;
    }

}
