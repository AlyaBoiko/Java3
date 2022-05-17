package zombi.appocalipces;

public interface Policeman {
    default void shoot(){
        System.out.println("Boom!");
    }
}
