package consecionaria;

import vehiculos.Vehiculo;

import java.util.ArrayList;

public class Consecionaria {
    private ArrayList <Vehiculo> vehiculos;

    public Consecionaria() {
        this.vehiculos = new ArrayList<Vehiculo>();
    }

    public void imprimirVehiculos(){
        for(int i = 0; i< vehiculos.size(); i++){
            System.out.println(vehiculos.get(i).toString());
        }
    }

    public void imprimirVehiculosMarcaYModelo(){
        for (int i = 0; i< vehiculos.size(); i++){
            System.out.println(vehiculos.get(i).getMarca() + " " + vehiculos.get(i).getModelo());
        }
    }



    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public void agregarVehiculo( Vehiculo vehiculo){
        this.vehiculos.add(vehiculo);

    }

    public void imprimirContieneLetra(String letra){
        for(int i=0; i<vehiculos.size();i++){
            if (vehiculos.get(i).getMarca().contains(letra) || vehiculos.get(i).getModelo().contains(letra)){
                System.out.println("Vehiculo que contiene en el modelo la letra" + " " + letra  + ":" + " " +
                    vehiculos.get(i).getMarca() + " " +  vehiculos.get(i).getModelo() + " " + "$" + vehiculos.get(i).getPrecio());
            }

        }

    }



    public void eliminarVehiculo(Vehiculo vehiculo){
        this.vehiculos.remove(vehiculo);
    }
}
