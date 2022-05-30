public class Calculator {

    public static int addingMethod(int a, int b) {
        return a+b;
    }
        public static int deductingtMethod(int a, int b) {
            return a-b;
        }

    public static void main (String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(addingMethod(2,5));
        System.out.println(deductingtMethod(5,2));
    }
}
