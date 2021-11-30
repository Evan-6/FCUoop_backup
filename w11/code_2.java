import java.util.Scanner;

class reverse{
    public char a[] = new char[20];
    public int count;
    public void bubble() {
        char tmp;
        for(int j=0 ; j<count ; j++){
            for(int i=0 ; i<count-1 ; i++) {
                if(Character.getNumericValue(a[i])>Character.getNumericValue(a[i+1])){
                    tmp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = tmp;
                }
            }
        }
    }
    public void linear(char find){
        for(int i=0 ; i<count; i++){
            if(a[i]==find){
                System.out.print(i);
            }
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
        while(a.hasNext())
//        for(i=0 ; i<9 ; i++)
        {
            member.a[i]=a.next().charAt(0);
        }
        member.count=i;
        member.bubble();
        member.print();
        member.linear(a.next().charAt(0));
    }
}


