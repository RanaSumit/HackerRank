import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        BigInteger factorial = BigInteger.valueOf(n);
        for(int i = 1; i < n; i++) {
           factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.print(factorial);
        
    }
}