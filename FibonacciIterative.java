public class FibonacciIterative implements Fibonacci{

    public int fibonacci(int n){

        int fib1 = 0;
        int fib2 = 1;
        int temp;

        for(int i = 1; i < n; i++){
            temp = fib2;
            fib2 = fib2 + fib1;
            fib1 = temp;
        }
        return fib2;
    }
}
