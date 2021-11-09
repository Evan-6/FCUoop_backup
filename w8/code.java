import java.util.Scanner;

class card{
    public String id;
    public int age;
    public double amount;

    public void setid(String id) {
        this.id=id;
    }
    public void setage(int age) {
        this.age=age;
    }
    public void setamount(double amount) {
        this.amount=amount;
    }
    public void show() {
        int a;
        System.out.printf("%s %d ",id,age);
        System.out.printf("%.0f\n",amount);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        card[] list = new card[100];
        int i=0;
        int flag;
        flag=a.nextInt();
        while(flag!=-1) {
            switch(flag) {
                case 1:
                    list[i] = new card();
                    list[i].setid(a.next());
                    list[i].setage(a.nextInt());
                    list[i].setamount(a.nextInt());
                    i++;
                    break;
                case 2:
                    list[i] = new card();
                    list[i].setid(a.next());
                    list[i].setage(0);
                    list[i].setamount(0);
                    i++;
                    break;
                case 3:
                    String name=a.next();
                    int j=0;
                    for(j=0 ; j<i ; j++) {
                        if(list[j].id.equals(name)){
                            break;
                        }
                    }
                    switch(a.nextInt()) {
                        case 1:
                            list[j].setage(a.nextInt());
                            break;
                        case 2:
                            int all=a.nextInt();
                            list[j].setamount(list[j].amount+all);
                            break;
                    }
                    break;
                case 4:
                    name=a.next();
                    j=0;
                    for(j=0 ; j<i ; j++) {
                        if(list[j].id.equals(name)){
                            break;
                        }
                    }
                    int road=a.nextInt();
                    if(list[j].age>65) {
                        if(road<=10)break;
                        else {
                            list[j].setamount(list[j].amount-(road-10)*0.5);
                        }
                    }
                    else if (list[j].age<18) {
                        if(road<=10)break;
                        else {
                            list[j].setamount(list[j].amount-(road-10)*2.5);
                        }
                    }
                    else{
                        if(road<=10)break;
                        else {
                            list[j].setamount(list[j].amount-(road-10)*5);
                        }
                    }

                    break;
                case 5:
                    name=a.next();
                    j=0;
                    for(j=0 ; j<i ; j++) {
                        if(list[j].id.equals(name)){
                            break;
                        }
                    }
                    list[j].show();
                    break;
                case -1:
                    break;
            }

            flag=a.nextInt();
        }
    }
}
