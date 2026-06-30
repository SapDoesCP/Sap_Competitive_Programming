import java.util.Scanner;

public class OneAndTwo {
    public static void main(String[] args) 
    {
        
    Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while((t--) > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            int cnt2 = 0;
            for(int i = 0; i<n; i++)
            {
                arr[i] = sc.nextInt();
                if(arr[i] == 2)
                    cnt2++;
            }
            int count = 0;
            int index = -1;
            if(cnt2 == 0)
                System.out.println(1);
            else if(cnt2%2 == 1)
                System.out.println(-1);
            else
            {
                for(int i = 0; i<n; i++)
                {
                    if(arr[i] == 2)
                        count++;
                    if(count == cnt2/2)
                    {    index = i;
                        break;
                    }
                }
                System.out.println(index+1); //1-based array is given 
            }
        }
        sc.close();
    }    
}
