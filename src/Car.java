public class Car {
    public void build () {
        System.out.println("You must build a new car");
    }
    public void buy () {
        System.out.println("I will buy this car");
    }
    int carspeed = 0;

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.build();
        myCar.buy();
    }

}
