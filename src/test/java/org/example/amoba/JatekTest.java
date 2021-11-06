package org.example.amoba;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JatekTest {

    @Test
    void haHaromAzonosBabuVanEgySorbanAkkorAzNyert() {
        final Tabla tabla = new Tabla();
        final Jatek jatek = new Jatek(tabla);

        tabla.babutLetesz(0, 0, Tabla.Babu.O);
        tabla.babutLetesz(0, 1, Tabla.Babu.O);
        tabla.babutLetesz(0, 2, Tabla.Babu.O);

        final boolean vanNyertes = jatek.vanENyertes(0, 2);

        assertTrue(vanNyertes);
    }

    @Test
    void haHaromAzonosBabuVanEgyOszlopbanAkkorAzNyert() {
        final Tabla tabla = new Tabla();
        final Jatek jatek = new Jatek(tabla);

        tabla.babutLetesz(0, 0, Tabla.Babu.O);
        tabla.babutLetesz(1, 0, Tabla.Babu.O);
        tabla.babutLetesz(2, 0, Tabla.Babu.O);

        final boolean vanNyertes = jatek.vanENyertes(0, 0);

        assertTrue(vanNyertes);
    }

    @Test
    void haHaromAzonosBabuVanBalrolLefeleAtlobanAkkorAzNyert() {
        final Tabla tabla = new Tabla();
        final Jatek jatek = new Jatek(tabla);

        tabla.babutLetesz(0, 0, Tabla.Babu.O);
        tabla.babutLetesz(1, 0, Tabla.Babu.O);
        tabla.babutLetesz(2, 0, Tabla.Babu.O);

        final boolean vanNyertes = jatek.vanENyertes(0, 0);

        assertTrue(vanNyertes);
    }

}