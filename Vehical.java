public abstract class Vehical {

    int speed;

    public void start(int speedAtStart) {
        this.speed = speedAtStart;
        System.out.println("Start's at " + speed + "Km/h");
    }
    public void stop(int speedAtStop){
        this.speed = speedAtStop;
        System.out.println("STOPED at " + speed + "Km/h");
    }
}
