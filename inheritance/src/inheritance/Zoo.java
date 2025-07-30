package inheritance;

public class Zoo {
    public static void main(String[] args) {
        Bird parrot = new Bird("Parrot");
        FIsh goldfish = new FIsh("Goldfish");

        parrot.eat();
        parrot.fly();
        parrot.sleep();

        System.out.println();

        goldfish.eat();
        goldfish.swim();
        goldfish.sleep();
    }
}
