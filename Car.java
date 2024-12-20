public class Car extends Vehical{
    int wheels = 4;
    int doors = 3;

    void model(int carDoors) {
        this.doors = carDoors;
        if(doors > 2) {
            System.out.println("This car is regular car");
        } else if (doors == 3 ){
            System.out.println("This is not car its Riksha");
        } else {
            System.out.println("This car is Sports car");
        }
    }

    @Override
    public void start(int carSpeed) {
        this.speed = carSpeed;
        System.out.println("Car start's at " + speed + "Km/h");
    }
}
