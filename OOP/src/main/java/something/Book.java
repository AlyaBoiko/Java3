package something;

import java.nio.charset.Charset;
import java.util.Random;

public class Book extends MultyPagePublication{
    public String coverage;

    public Book(String name, int pages) {
        this.name = name;
        this.pages = pages;
    }

    public boolean theSame(Book toCompare){
        return (this.name.equals(toCompare.name)) && (this.pages == toCompare.pages);
    }

    public String getName() {
        return this.name;
    }

//инкапсуляция

    protected void protectedOne(){ // can use all children
        System.out.println("I am protected");
    }

    void withoutModificator(){ // can use all children but only in the same package
        System.out.println("withoutModificator");
    }

    private void privateOne(){//can use in this class only
        System.out.println("privat");
    }

    public String readLine(int line){
        return  this.randomLine(line, 80);
        }
    public String publicationHouse(){
        return  this.randomLine(9999, 15);
    }
    public String randomLine(int line, int length) {
        byte[] array = new byte[length];
        new Random(line).nextBytes(array);
        return new String(array, Charset.forName("UTF-8"));
    }
// полиморфизм
    @Override
    public void open(int page) {
        super.open(page); // вызвать метод в том виде, в котором он был у родителя
        /*System.out.println("The first line is: ");
        System.out.println(this.readLine(page*100+1));*/
        }

}
