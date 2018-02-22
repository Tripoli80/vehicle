public class Plane extends vehicle {
    int h;//Переопределение координаты
int    number_of_passengers;



    public Plane(int x, int y, int price, int spead, int year, int h, int number_of_passengers) {
        super(x, y, price, spead, year);//вызов конструктора родителя
        this.h = h;
        this.number_of_passengers = number_of_passengers;
    }
    public Plane(int h, int number_of_passengers) {
        this.h = h;
        this.number_of_passengers = number_of_passengers;
    }
    protected void show()
    {
        System.out.println("Plane");
        System.out.println("vusota  = " + h);
        System.out.println("number_of_passengers  ="+number_of_passengers);
        super.Show_vahicle();

    }
}
