public class StringLearning {
    public String reverseString (String string) {
        if (string == null || string == "") {
            throw new IllegalArgumentException("Given String is empty.");
        }
        StringBuilder sb = new StringBuilder(string);
        return sb.reverse().toString();
    }

    public String toReplaceWord (StringBuffer sentance, String replaceWord, int startIndex, int endIndex) {
        sentance.replace(startIndex, endIndex, replaceWord);
        return sentance.toString();
    }


    public static void main(String[] arg) {
        StringLearning stringLearning = new StringLearning();
        System.out.println(stringLearning.reverseString("Hello"));

        StringBuffer sb = new StringBuffer("hello! Welcome.");
        System.out.println(stringLearning.toReplaceWord(sb, "Hi", 0, 5));
    }
}
