public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal();

        animal.blinking();
        animal.breath();

        Birds birds = new Birds();
        birds.fly();

        Reptils reptils = new Reptils();
        reptils.crawl();

        Mammals mammals = new Mammals();
        mammals.loveWater();
        Mammals.setKg(105);
        System.out.println(mammals.toString());


        Sparrow sparrow = new Sparrow();
        sparrow.sings();

        Clover clover = new Clover();
        clover.tickles();

        Guster guster = new Guster();
        guster.gustersWalk();

        Crocodile crocodile = new Crocodile();
        crocodile.eat();

        Whale whale = new Whale();
        whale.swims();

        Elephant elephant = new Elephant();
        elephant.drink();

    }
}
