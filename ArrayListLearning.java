import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListLearning {
    public ArrayList<Integer> evenNumberFinder (ArrayList<Integer> numbers) {
        if (numbers==null) {
            throw new IllegalArgumentException("Given arraysList is empty.");
        }
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for (int i = 0; i<numbers.size() ; i++) {
            if (numbers.get(i)%2 == 0){
                evenNumbers.add(numbers.get(i));
            }
        }
        return evenNumbers;
    }

    public ArrayList<String> addCityName (String cityName) {
        ArrayList<String> cityNames = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        char ans;
        for (int i = 0 ;  ; i++) {
            System.out.println("Do you want to Add City name?(y/n)");
            ans = Character.toLowerCase(scanner.next().charAt(0));
            if (ans == 'y') {
                System.out.println("Please Enter your City name");
                cityNames.add(cityName);
            }
            else if (ans == 'n') break;
            else {
                System.out.println("Wrong Input please enter Y or N");
            }
        }
        return cityNames;
    }

    public void getCityName (ArrayList<String> cityNames) {
        for (String city: cityNames) {
            System.out.println(city);
        }
    }

    public static void main (String[] arg) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(60);
        numbers.add(0);
        numbers.add(1);
        numbers.add(23);
        numbers.add(50);
        numbers.add(20);
        numbers.add(16);
        numbers.add(51);
        numbers.add(11);
        ArrayListLearning arrayListLearning = new ArrayListLearning();
        for (int num : arrayListLearning.evenNumberFinder(numbers)) {
            System.out.println(num);
        }
    }
}
