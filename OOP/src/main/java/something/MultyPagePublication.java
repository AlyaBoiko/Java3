package something;

public abstract class MultyPagePublication extends Publication{
    public int pages;
    public void open(int page) {
        if ((page > 0) && (page < this.pages)) {
            System.out.println("The page " + page + " is open");
        } else {
            System.out.println("Такой страницы нет...");
        }
    }
}
