import java.util.Scanner;

class reverse{
    public int a[] = new int[20];
    public int count;
    public void reverseary() {
        int tmp;
        for(int i=0 ; i<count/2 ; i++){
            tmp=a[i];
            a[i]=a[count-1-i];
            a[count-1-i]=tmp;
        }
    }
    public void print(){
        for(int i=0 ; i<count; i++){
            System.out.print(a[i]+" ");
        }
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        reverse member = new reverse();
        int i=0;
        while(a.hasNextInt()){
            member.a[i++]=a.nextInt();
        }
        member.count=i;
        member.reverseary();
        member.print();
    }
}


