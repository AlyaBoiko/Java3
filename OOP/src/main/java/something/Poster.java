package something;

import java.util.Locale;

public class Poster extends Publication{
    @Override
    public String getName() {
        return this.name.toUpperCase();
    }

    public Poster(String name){
        this.name = name;
    }
}
