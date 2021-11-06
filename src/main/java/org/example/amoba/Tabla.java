package org.example.amoba;

import java.util.function.Function;

public class Tabla {
    private final Babu[][] halo;

    public enum Babu {
        X,
        O
    }

    public void babutLetesz(int sor, int oszlop, Babu babu) {
        try {
            if (halo[sor][oszlop] == null ){
                halo[sor][oszlop] = babu;
            } else {
                throw new TablaKivetel("A babut egy masik babura tetted!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new TablaKivetel("Tabla melle tetted a babut!");
        }
    }

    public Tabla() {
        this(3, 3);
    }

    public Tabla(int sor, int oszlop) {
        this.halo = new Babu[sor][oszlop];
    }

    public Babu[][] getHalo() {
        return halo;
    }

    public void haloKirajzol() {
        Function<Babu, String> b2s = b -> b == null ? " " : b.toString();
        System.out.println("    0      1     2");
        System.out.println("  ╔═════╤═════╤═════╗");
        System.out.println("0 ║  " + b2s.apply(halo[0][0]) + "  │  " + b2s.apply(halo[0][1]) + "  │  " +  b2s.apply(halo[0][2]) +
                "  ║");
        System.out.println("  ╟─────┼─────┼─────╢");
        System.out.println("1 ║  " + b2s.apply(halo[1][0]) + "  │  " + b2s.apply(halo[1][1]) + "  │  " + b2s.apply(halo[1][2]) + "  ║");
        System.out.println("  ╟─────┼─────┼─────╢");
        System.out.println("2 ║  " + b2s.apply(halo[2][0]) + "  │  " + b2s.apply(halo[2][1]) + "  │  " + b2s.apply(halo[2][2]) + "  ║");
        System.out.println("  ╚═════╧═════╧═════╝");
    }
}
