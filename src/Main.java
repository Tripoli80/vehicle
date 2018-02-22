public class Main {

    public static void main(String[] args) {
        System.out.println("Hello vehicle!");

        Plane plane_1=new Plane(5055,456,56,56,5,54,556);
        Ship ship_1 =new Ship(1200,"potti");
        Car car_1=new Car();
        car_1.spead=190;
        car_1.price=22000;

        ship_1.show();
        plane_1.show();
        car_1.show();


    }
}
