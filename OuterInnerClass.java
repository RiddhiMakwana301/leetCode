public class OuterInnerClass {

    void methods() {
        System.out.println("This is the Method." );

        class LocalInnerClass {
            String localInnerClassVariable = "Hii i am local Inner Class";

            void printLocalInnerClass() {
                System.out.println(localInnerClassVariable);
            }
        }
        // Creating an instance of Local Inner Class
        LocalInnerClass localInnerClass = new LocalInnerClass();
        localInnerClass.printLocalInnerClass();
    }

    static class InnerClass {
        void innerClass() {
            System.out.println("This is Inner Class" );
        }
    }
}
