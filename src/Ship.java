public class Ship extends vehicle {
    int    number_of_passengers;
            String port;

    public Ship(int number_of_passengers, String port) {
        this.number_of_passengers = number_of_passengers;
        this.port = port;
    }

    public Ship(int x, int y, int price, int spead, int year, int number_of_passengers, String port) {
        super(x, y, price, spead, year);
        this.number_of_passengers = number_of_passengers;
        this.port = port;
    }
    protected void show()
    {
        System.out.println("ship ");

        System.out.println("port  = " + port);
        System.out.println("number_of_passengers  ="+number_of_passengers);  super.Show_vahicle();


    }
}

