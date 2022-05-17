package zombi.appocalipces;

public class Car {
    public Zombie zombieDriver;
    public Car(Zombie currentZombie){
        this.zombieDriver = currentZombie;
    }
}
