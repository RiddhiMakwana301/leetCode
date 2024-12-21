import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cityName = new ArrayList<>(5);
        Scanner scanner = new Scanner(System.in);

        char ans;
        for (int i = 0 ;  ; i++) {
            System.out.println("Do you want to Add City name?(y/n)");
            ans = Character.toLowerCase(scanner.next().charAt(0));
            if (ans == 'y') {
                System.out.println("Please Enter your City name");
                cityName.add(scanner.nextLine());
            }
            else if (ans == 'n') break;
            else {
                System.out.println("Wrong Input please enter Y or N");
                continue;
            }
        }
        for (String city: cityName) {
            System.out.println(city);
        }

    }
}
