package zombi.appocalipces;

public class OldZombie implements Zombie{

    @Override
    public void go() {
        System.out.println("Top-Top");
    }

    @Override
    public void run() {
        System.out.println("Run!!!");
    }

    @Override
    public void sleep() {
        System.out.println("z-z-z--z");

    }
}
