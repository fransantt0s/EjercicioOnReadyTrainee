package main;

import vehiculos.Auto;

import vehiculos.Moto;
import consecionaria.Consecionaria;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Consecionaria consecionaria = new Consecionaria();
        Auto peugeot206 = new Auto("Peugeot","206",4,200000);
        Moto hondaTitan = new Moto("Honda","Titan",125,60000);
        Auto peugeot208 = new Auto("Peugeot","208",5,250000);
        Moto yamahaYbr = new Moto("Yamaha","YBR",160,80500);
        consecionaria.agregarVehiculo(peugeot206);
        consecionaria.agregarVehiculo(peugeot208);
        consecionaria.agregarVehiculo(hondaTitan);
        consecionaria.agregarVehiculo(yamahaYbr);
        consecionaria.imprimirVehiculos();
        System.out.println("=======================================");
        Collections.sort(consecionaria.getVehiculos());
        System.out.println("Vehiculo más caro:" + " " + consecionaria.getVehiculos().get(consecionaria.getVehiculos().size()-1).getMarca() + " " +
                consecionaria.getVehiculos().get(consecionaria.getVehiculos().size()-1).getModelo());
        System.out.println("Vehiculo más barato:" + " " + consecionaria.getVehiculos().get(0).getMarca()
                + " " + consecionaria.getVehiculos().get(0).getModelo());
        System.out.println("=======================================");
        consecionaria.imprimirContieneLetra("Y");
        System.out.println("=======================================");
        Collections.reverse(consecionaria.getVehiculos());
        System.out.println("Vehiculos ordenados por precio de mayor a menor: ");
        consecionaria.imprimirVehiculosMarcaYModelo();
    }



}
