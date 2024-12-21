import java.util.ArrayList;

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
