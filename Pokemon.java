public class Pokemon {
    int level;

//    create constructor
    public Pokemon(int pLevel) {
        this.level = pLevel;
    }

    public void attack(){
        if(level>5){
            System.out.println("my Pokemon on HIGH Level " + level + ". So i Won.");
            return;
        }
        System.out.println("my pokemon on Level " + level + ". So i Loose.");
    }

    public void stop(){
        System.out.println("Stop.");
    }
}
