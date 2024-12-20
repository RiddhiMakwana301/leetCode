public class GetterAndSetter {
    class People {
        private String gender;
        private int age;

        public void setGender (String gender){
            this.gender = gender;
        }
        public String getGender (){
            return gender;
        }
        public void setAge (int age) {
            if(age<0 || age>99) {
                System.out.println("Please enter age Positive and not Grater than 100.");
            }
            else {
                this.age = age;
            }
        }
        public int getAge () {
            return age;
        }
    }

    public static void main (String[] arg) {
        GetterAndSetter getterAndSetter = new GetterAndSetter();
        GetterAndSetter.People people = getterAndSetter.new People();

//        People people = new People();
        people.setAge(100);
        people.setGender("Male");
        System.out.println(people.getAge());
        System.out.println(people.getGender());
    }
}
