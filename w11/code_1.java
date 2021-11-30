import java.util.Scanner;

class reverse{
    public int a[] = new int[9];
    public void reverseary() {
        int tmp;
        for(int i=0 ; i<4 ; i++){
            tmp=a[i];
            a[i]=a[8-i];
            a[8-i]=tmp;
        }
    }
    public void print(){
        for(int i=0 ; i<9 ; i++){
            System.out.print(a[i]+" ");
        }
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        reverse member = new reverse();
        for(int i=0 ; i<9 ; i++){
            member.a[i]=a.nextInt();
        }
        member.reverseary();
        member.print();
    }
}


