package oops_concepts;

import java.sql.SQLOutput;

public class MainClass {
    public static void main(String[] args) {
        //houses
        System.out.println("Houses");

        Houses h=new Houses();
        h.Ownership();
        h.Address();
        h.permission();
        h.floors(1);
        h.parking("parking space");
        h.garden();

        System.out.println("\nDetached Houses\n");
        DetachedHouse d=new DetachedHouse();
        d.Address();
        d.Ownership();
        d.floors(1);
        d.garden();;
        d.parking("Driveway");
        d.permission();

        System.out.println("\nFlats\n");
        Flats f=new Flats();
        f.garden();
        f.floors(5);
        f.Address();
        f.parking("Allotted Parking Space");
        f.ownership();

        System.out.println("\nBungalow\n");
        Bungalow b=new Bungalow();
        b.floors();
        b.Address();
        b.garden();
        b.parking("Street Parking");




    }
}
