package vehiculos;

public class Moto extends Vehiculo {
    private int cilindrada;

    public Moto(String marca, String modelo, int cilindrada, double precio) {
        super(marca, precio,modelo);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return this.cilindrada;
    }


    @Override
    public String toString() {
        return "Marca:" +" " + this.getMarca() + " " + "///" +
                " " + "Modelo:" + " " + this.getModelo()+ " " + "///" +
                " " + "Cilindrada:" + " " + this.getCilindrada() + "cc" + " " + "///" +
                " " + "Precio:" + " "  +"$" + this.getPrecio();
    }
}
