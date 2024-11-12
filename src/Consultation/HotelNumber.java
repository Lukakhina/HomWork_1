package Consultation;

/**
 * @author : Sergey Danilko
 * created : 12.11.2024
 **/

public class HotelNumber {
    private int number;
    private int flour;
    private int quantity;
    private Person[] people = new Person[quantity];

    HotelNumber(int number, int flour, int quantity) {
        this.number = number;
        this.flour = flour;
        this.quantity = quantity;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setFlour(int number) {
        this.flour = number;
    }

    public int getFlour() {
        return flour;
    }

    public void setQuantity(int number) {
        this.quantity = number;
    }

    public int getQuantity() {
        return quantity;
    }
}
