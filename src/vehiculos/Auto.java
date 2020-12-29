package vehiculos;

public class Auto extends Vehiculo {
    private int puertas;
    public Auto(String marca, String modelo, int puertas, double precio ) {
        super(marca, precio,modelo);
        this.puertas = puertas;
    }

    public double getPuertas() {
        return this.puertas;
    }


    public String toString() {
        return "Marca:" +" " + this.getMarca() + " " + "///" +
                " " + "Modelo:" + " " + this.getModelo()+ " " + "///" +
                " " + "Puertas:" + " " + this.getPuertas() + " " + "///" +
                " " + "Precio:" + " "  +"$" + this.getPrecio();
    }

    @Override
    public int compareTo(Vehiculo o) {
        return 0;
    }
}
