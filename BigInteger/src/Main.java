import java.math.BigInteger;
import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        BigInteger bigI = BigInteger.valueOf(20);
        System.out.println(bigI);

        BigInteger probablePrime = BigInteger.probablePrime(8, new Random());
        System.out.println("Probable prime number is " + probablePrime);

        BigInteger stringInt = new BigInteger("123456").add(BigInteger.ONE);
        System.out.println(stringInt);

        BigInteger result = new BigInteger("3").multiply(new BigInteger("3"))
                .divide(new BigInteger("2"));
        System.out.println(result);
    }
}