public class Mammals extends Animal {

    private static int kg;

    @Override
    public void blinking() {
        super.blinking();
    }

    @Override
    public void breath() {
        super.breath();
    }

    public static void setKg(int kg) {
        Mammals.kg = kg;
    }

    public void loveWater() {
        System.out.println("Sisari vole vodu.");
    }

    public String toString() {

        StringBuilder sb = new StringBuilder();

         sb.append("Takodje, sisari imaju bar po " + kg + " kila!!");

         return sb.toString();
    }
}
