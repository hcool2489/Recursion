import java.math.BigInteger;

public class Recursion {
    private static int sum(int number){
        if(number == 1){
            return 1;
        }
        return number + sum(--number);
    }

    private static BigInteger factorial(BigInteger number){
        if(number.equals(BigInteger.ONE)){
            return BigInteger.ONE;
        }
        return number.multiply(factorial(number.subtract(BigInteger.ONE)));
    }

    public static void main(String[] args) {
        System.out.println(sum(10));
        System.out.println(factorial(BigInteger.valueOf(1000)));
    }
}
