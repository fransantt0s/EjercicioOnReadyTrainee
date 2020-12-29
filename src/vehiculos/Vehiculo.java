package vehiculos;

public  abstract class Vehiculo implements Comparable<Vehiculo>{
    private String marca;
    private double precio;
    private String modelo;

    public Vehiculo(String marca, double precio, String modelo){
        this.marca = marca;
        this.precio = precio;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }


    public double getPrecio() {
        return precio;
    }


    public String getModelo(){
        return this.modelo;
    }



    public int compareTo(Vehiculo o) {
        return (int) (this.precio - o.getPrecio());
//        if (this.precio<o.getPrecio()){
//            return 1;
//        }
//        else{
//            if(this.precio>o.getPrecio()){
//                return -1;
//            }
//            else{
//                return 0;
//        }
//
//        }
    }
}
