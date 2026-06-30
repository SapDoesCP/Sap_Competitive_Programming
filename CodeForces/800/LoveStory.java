import java.util.Scanner;

public class LoveStory {
    public static void main(String[] args) 
    {        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // consume newline
        while((t--) > 0)
        {
            int count = 0;
            String s = "codeforces";
            String tt = sc.nextLine();
            for(int i=0;i<s.length(); i++)
            {
                if(s.charAt(i) != tt.charAt(i))
                    count ++;
            }
            System.out.println(count);
        }
        sc.close();
    }
    
}
