package org.example.amoba;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Jatek {

    private final Tabla tabla;

    public Jatek(Tabla tabla) {
        this.tabla = tabla;
    }

    public boolean vanENyertes(int sor, int oszlop) {
        final Tabla.Babu babu = tabla.getHalo()[sor][oszlop];
        List<Tabla.Babu> sorErtekek = Arrays.asList(tabla.getHalo()[sor]);
        List<Tabla.Babu> oszlopErtekek = Arrays.asList(
                tabla.getHalo()[0][oszlop],
                tabla.getHalo()[1][oszlop],
                tabla.getHalo()[2][oszlop]);
        List<Tabla.Babu> balrolLefeleAtloErtekek = Arrays.asList(
                tabla.getHalo()[0][0],
                tabla.getHalo()[1][1],
                tabla.getHalo()[2][2]);
        List<Tabla.Babu> jobbrolLefeleAtloErtekek = Arrays.asList(
                tabla.getHalo()[0][2],
                tabla.getHalo()[1][1],
                tabla.getHalo()[2][0]);
        return egyformakE(sorErtekek, babu)
                || egyformakE(oszlopErtekek, babu)
                || egyformakE(balrolLefeleAtloErtekek, babu)
                || egyformakE(jobbrolLefeleAtloErtekek, babu);
    }

    private boolean egyformakE(List<Tabla.Babu> babuk, Tabla.Babu babu) {
        return babuk.stream().allMatch(babu::equals);
    }

    public void start() {
        clearScreen();
        tabla.haloKirajzol();
        final Scanner scanner = new Scanner(System.in);
        Tabla.Babu aktivBabu = Tabla.Babu.O;
        boolean vanNyertes = false;

        do {
            try {
                int sorKoordinata = koordinataBekerdez(scanner, aktivBabu + " jatekos, sor koordinata:");
                int oszlopKoordinata = koordinataBekerdez(scanner,  aktivBabu + " jatekos, oszlop koordinata:");
                tabla.babutLetesz(sorKoordinata, oszlopKoordinata, aktivBabu);
                aktivBabu = aktivBabu == Tabla.Babu.O ? Tabla.Babu.X : Tabla.Babu.O;
                clearScreen();
                tabla.haloKirajzol();
                vanNyertes = vanENyertes(sorKoordinata, oszlopKoordinata);
            } catch (TablaKivetel e) {
                clearScreen();
                tabla.haloKirajzol();
                System.out.println(e.getMessage());
            }

        } while(!vanNyertes);
        System.out.println("A vesztes: " + aktivBabu);
    }

    private int koordinataBekerdez(Scanner scanner, String message) {
        System.out.println(message);
        while (!scanner.hasNextInt()) {
            System.out.println(message);
            scanner.next();
        }
        return scanner.nextInt();
    }

    private void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
