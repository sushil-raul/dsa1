import java.util.*;
public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
    	int n = sc.nextInt();
        boolean result = isOdd(n);
        System.out.println(n + " is odd: " + result);
    }
    
    public static boolean isOdd(int n) {
        return (n & 1) != 0;
    }
}
