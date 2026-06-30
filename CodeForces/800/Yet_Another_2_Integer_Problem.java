import java.util.*;
public class Yet_Another_2_Integer_Problem
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while((t--) > 0)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int diff = Math.abs(b-a);
            if(diff%10 == 0)
                System.out.println(diff/10);
            else
                System.out.println(diff/10 + 1);
        }
        sc.close();
    }
}