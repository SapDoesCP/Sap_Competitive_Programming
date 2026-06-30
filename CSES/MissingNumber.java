import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n-1];
        int XOR1 = 0;
        int XOR2 = 0;
        for(int i = 0;i<n-1; i++)
        {
            arr[i] = sc.nextInt();
            XOR1 ^= arr[i];
        }
        for(int i = 1;i<=n; i++)
        {
            XOR2 ^= i;
        }
        System.out.println(XOR1^XOR2);
        sc.close();
    }
    
}
