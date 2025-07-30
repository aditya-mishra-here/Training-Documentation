package inheritance;

public class FIsh extends Animal {

    public FIsh(String name) {
        super(name);
    }

    public void swim() {
        System.out.println(name + " is swimming.");
    }
}
