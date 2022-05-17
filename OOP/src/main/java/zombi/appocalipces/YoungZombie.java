package zombi.appocalipces;

public class YoungZombie implements Zombie{
    @Override
    public void go() {
        System.out.println("top-top-top-top");
    }

    @Override
    public void run() {
        System.out.println("quickly ran");
    }

    @Override
    public void sleep() {
        System.out.println("z");
    }
}
