import java.util.Scanner;
public class WeNeedTheZero {
    public static void main(String[] args) 
    {
        
    Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while((t--) > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            int xor = 0;
            int finalXor = 0;
            for(int i = 0; i<n; i++)
            {
                arr[i] = sc.nextInt();
                xor ^= arr[i];
            }
            finalXor = xor;
            if(n%2 == 0)
            {
                if(finalXor == 0)
                    System.out.println(0);
                else
                    System.out.println(-1);
            }
            else
            {
                System.out.println(xor);
            }
        }
        sc.close();
    }
    
}
