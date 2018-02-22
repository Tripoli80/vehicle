public class vehicle {
    protected int x =0;
    protected int y=0;
    protected int price=125 ;
protected int spead=60;
private int year=1990;

    public vehicle(int x, int y, int price, int spead, int year) {
        this.x = x;
        this.y = y;
        this.price = price;
        this.spead = spead;
        this.year = year;
    }

    public vehicle() {
    }
    protected void Show_vahicle()
    {
        System.out.println("spead = " + spead);
        System.out.println("coordinate x/y = "+ x+"/"+y);
        System.out.println("price  ="+price);
        System.out.println("year = "+year);
        System.out.println("\n");
    }
}
