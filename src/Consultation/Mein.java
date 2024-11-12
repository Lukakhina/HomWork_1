package Consultation;

public class Mein {
    public static void main(String[] args) {
        Schrank schankKleidung = new Schrank();
        schankKleidung.material = "ДСП";
        schankKleidung.color = "Weis";

        System.out.println("material: " + schankKleidung.material);
        schankKleidung.setWidth(1000);
        schankKleidung.printInfo();
    }
}
