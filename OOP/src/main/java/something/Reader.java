package something;

public class Reader {
    public Publication reading;
    public Reader(Publication somethingToRead){
        this.reading = somethingToRead;
    }

    public void whatAmIReading(){
        System.out.println("I am reading " + this.reading.getName());
    }
}
