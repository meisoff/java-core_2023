package lr2.Example8;

// подкласс Bird
public class Bird extends Animal {
    private boolean canFly;

    public Bird(String name, int age, boolean canFly) {
        super(name, age);
        this.canFly = canFly;
    }

    public void chirp() {
        System.out.println("Chirp chirp!");
    }
}
