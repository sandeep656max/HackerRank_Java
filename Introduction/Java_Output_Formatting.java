import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
                System.out.print(s1);
                for(int j=s1.length(); j<15;j++)
                {
                    System.out.print(" ");
                }
                int temp=x;
                int c=0;
                while(temp!=0)
                {
                    temp/=10;
                    c++;
                }
                if(c==1||x==0)
                {
                    System.out.println("00"+x);
                }
                else if(c==2)
                {
                    System.out.println("0"+x);
                }
                else
                {
                    System.out.println(x);
                }
            }
            System.out.println("================================");

    }
}
