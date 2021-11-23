import java.util.Scanner;

class card{
    public long a;
    public long b;
    public void lcm(){
        int i=2 , ans=1;
        if( a==1 || b==1 )System.out.println(a*b);
        else if( a>=i && b>=i )
        {
            //a,b皆大於等於2開始質因數分解
            while( a>=i && b>=i )
            {
                //餘數皆為0時，2開始質因數分解，若都被2分完，則陸續增加為3、4、5……
                while( a%i==0 && b%i==0 )
                {
                    ans = ans * i;
                    a /= i;
                    b /= i;
                }
                i++;
            }
            System.out.printf("%d",ans*a*b);
        }
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        card member = new card();
        member.a=a.nextInt();
        member.b=a.nextInt();
        member.lcm();

    }
}
