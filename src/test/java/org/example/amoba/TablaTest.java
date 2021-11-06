package org.example.amoba;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TablaTest {

    @Test
    void defaultTabla3szor3as() {
        final Tabla tabla = new Tabla();

        assertEquals(3, tabla.getHalo().length, "3 kene h legyen");
    }

    //ne essen le
    @Test
    void haTablaMelleTesszukAkkorKiveteltKapunk() {
        //Adott
        final Tabla tabla = new Tabla();

        //Akkor
        assertThrows(TablaKivetel.class, () -> tabla.babutLetesz(3,3, Tabla.Babu.O), "Tabla melle tetted");
    }

    @Test
    void haABabutEgyMasikBaburaTesszukAkkorKiveteltKapunk() {
        final Tabla tabla = new Tabla();

        tabla.babutLetesz(0,0, Tabla.Babu.O);

        assertThrows(TablaKivetel.class, () -> tabla.babutLetesz(0,0, Tabla.Babu.O), "Babura nem leht tenni");
    }

    @Test
    void haABabutUresHelyreTesszukAkkorABabuJoHelyreKerul() {
        final Tabla tabla = new Tabla();

        tabla.babutLetesz(0,0, Tabla.Babu.O);

        assertEquals(Tabla.Babu.O, tabla.getHalo()[0][0]);
    }

    @Test
    void testHaloKirajzol() {
        final Tabla tabla = new Tabla();

        tabla.babutLetesz(0,0, Tabla.Babu.O);

        tabla.haloKirajzol();

    }

}