package fr.tuto.java.objectoriented.animal;

public class MainAnimals {

    public static void main(String[] args) {
        Animal w = new Wolf("grey", 20);
        w.drink();
        w.eat();
        w.move();
        w.cry();
        System.out.println(w.toString());

        System.out.println("--------------------------------------------------");
        Dog d = new Dog("brown", 15);
        d.eat();
        d.drink();
        d.move();
        d.cry();

        d.giveHug();
        d.givelicks();
        d.rollover();

        System.out.println("--------------------------------------------------");
        Rintintin r = new Dog();
        r.giveHug();
        r.givelicks();
        r.rollover();
    }

}
