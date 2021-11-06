package org.example.amoba;

public class MyAmoba {

    public static void main(String[] args) {
        Tabla tabla = new Tabla(3,3);
        Jatek jatek = new Jatek(tabla);
        jatek.start();
    }
}
