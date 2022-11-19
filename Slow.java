import java.util.Scanner;

public class Slow {
    public static void main(String[] args) {
        int fast,slow;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter X index: ");
        fast = sc.nextInt();
        System.out.println("Enter Y index: ");
        slow = sc.nextInt();
        if(fast>12 || slow>12)
        {
            System.out.println("Invalid points");
        }
        else
        {
            comparePoints(fast,slow);
        }

    }
    public static int comparePoints(int fast,int slow)
    {
        while(fast<=12 && slow<=12)
        {
            fast = fast + 2;
            slow = slow + 1;
            if(fast==slow)
            {
                int intersect = fast;
                if(intersect>12)
                {
                    intersect = intersect -12;
                }
                System.out.println("The intersecting point is: " + intersect);
            }
        }
        return 0;
    }

}
