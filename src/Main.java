
public class Main {

    public static void main(String[] args)
    {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i] + "\t" + Palindrome.isPalindrome(args[i]));
        }
        System.out.println();

        for (int i = 0; i < 100; i++)
        {
            if (Primes.isPrime(i))
                System.out.print(i + " ");
        }
    }

}
