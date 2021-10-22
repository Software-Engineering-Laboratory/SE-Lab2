package calculator;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public double rvs(int a){
        if (a == 0){
            return 0;
        }
        return 1 / (double)a;
    }
    public double sqr(int a){
        if (a < 0){
            return -1;
        }
        return Math.sqrt(a);
    }
}