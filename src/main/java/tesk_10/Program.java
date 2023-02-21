package tesk_10;

public class Program {

    public static void main(String[] args) throws MyOwnException {
        try {
            Test(8, 0);
        } catch (ArithmeticException e) {
            new MyOwnException("Деление на ноль !");
        }
    }

    static void Test(int i, int b) {
        System.out.println(i / b);
    }
}

class MyOwnException extends Exception {
    public MyOwnException(String error) {
        System.out.println(error);
    }
}