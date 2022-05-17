package zombi.appocalipces;

public class PolicemanZombie implements Policeman, Zombie{
    /*@Override
    public void shoot() {
        System.out.println("click-click");
    }*/

    @Override
    public void go() {
        System.out.println("TOP TOP TOP TOP");
    }

    @Override
    public void run() {
        System.out.println("RUN RUN RUN");
    }

    @Override
    public void sleep() {
        System.out.println("doesn't sleep");
    }
}
