package task_6;

public class task_6 {
    public static void main(String[] args) {
        Figure myfig = new Figure(5,5);
    }
}

class Figure {
    float h;
    float w;

    Figure(float h, float w) {
        if (h == w) System.out.println("Фигура является квадратом");
        else System.out.println("Это не квадрат");

    }
}



