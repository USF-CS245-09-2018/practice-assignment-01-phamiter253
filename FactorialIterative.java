public class FactorialIterative implements Factorial{

    public int factorial(int n){
        int totalFact = n;

        for(int i = n - 1; i != 0; i--){
            totalFact*=i;
        }

        return totalFact;
    }
}
