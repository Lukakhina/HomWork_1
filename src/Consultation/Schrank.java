package Consultation;

public class Schrank {
   String material = "ОСБ";
   String color ;
   private int width;
  private int height;
   private int length;

   public void setWidth(int width) {
      this.width = width ;
   }
   public void printInfo () {
      System.out.println("Width: " + width);
   }

}