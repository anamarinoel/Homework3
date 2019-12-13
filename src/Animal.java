public class Animal {

   private String eyes;
   private String nose;


    public Animal(String eyes, String nose) {
        this.eyes = eyes;
        this.nose = nose;
    }

    public Animal() {
    }

    public void blinking() {
       System.out.println("\nEvery animal blinkings!");
   }

   public void breath() {
       System.out.println("Every animal breathes!");
   }

}
