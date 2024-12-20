
public class ValidParenthese {
    public String makeFancyString(String s) {
        if (s.length() < 3) return s;

        char c = s.charAt(0);
        StringBuilder finalString = new StringBuilder();
        finalString.insert(0,c);
        int count= 1;
        int index =1;
        for (int i=1; i<s.length() ; i++){
            if(count>=2){
                count++;
            }
            if(c != s.charAt(i) ){
                count = 1;
                c = s.charAt(i);
                finalString.insert(index,c);
                index++;
                continue;
            }
            if(c==s.charAt(i) && count <2){
                finalString.insert(index,c);
                index++;
                count++;
            }
        }
        return finalString.toString();
    }

    public static void main(String[] arg){
        ValidParenthese al = new ValidParenthese();
        System.out.println(al.makeFancyString("leeetcode"));
    }
}
