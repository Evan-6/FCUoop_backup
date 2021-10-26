import java.util.Locale;
import java.util.Scanner;
class employ {
    public String id;
    public int time;
    public int many;
    public String kind;
    public double sum;
    public int set;
    public void setName(String Name) {
        this.id = Name;
    }
    public void settime(int time) {
        this.time = time;
    }
    public void many(int many){
        this.many=many;
    }
    public void setKind(String kind){
        this.kind=kind;
    }
    public void setSet(int set){
        this.set=set;
    }
}

class commodity{
    public String name;
    public int num;
    public int price;

    public void setName(String name){
        this.name=name;
    }
    public void setNum(int num){
        this.num=num;
    }
    public void setPrice(int price){
        this.price=price;
    }
}


public class Main {

    public static void main(String args[]) {
        Scanner a = new Scanner(System.in);
        int num = a.nextInt();
        employ[] emp = new employ[1000];
        int b=num;
        for(int i=0 ; i<num ;i++){
            emp[i]=new employ();
            emp[i].setName(a.next());
            int kinds=a.nextInt();
            switch (kinds){
                case 1 :
                    emp[i].settime(a.nextInt());
                    emp[i].sum=500;
                    break;
                case 2 :
                    emp[i].settime(a.nextInt());
                    if (emp[i].time <= 40) {
                        emp[i].sum=emp[i].time*8;
                    }
                    else{
                        emp[i].sum=((emp[i].time-40)*12)+40*8;
                    }
                    break;
                case 3 :
                    emp[i].settime(a.nextInt());
                    emp[i].setSet(kinds);
                    emp[i].sum=250;
                    break;
                case 4 :
                    emp[i].many(a.nextInt());
                    emp[i].setSet(kinds);
                    emp[i].setKind(a.next());
                    break;
            }

        }

        num = a.nextInt();
        double weeksum=0;

        commodity[] com = new commodity[1000];
        for(int i=0 ; i<num ;i++){
            com[i]=new commodity();
            com[i].setName(a.next());
            com[i].setNum(a.nextInt());
            com[i].setPrice(a.nextInt());
            weeksum+=com[i].price*com[i].num;
        }
        int c=num;

        for(int i=0 ; i<b ; i++){
            if(emp[i].set==3){
                emp[i].sum+=weeksum*0.057;
            }
            else if(emp[i].set==4){
                for(int j=0 ; j<c ; j++){
                    if(emp[i].kind.equals(com[j].name)){
                        emp[i].sum+=emp[i].many*com[j].price/2;
                    }
                }
            }
            System.out.printf("%s %d\n",emp[i].id , Math.round(emp[i].sum));
        }
    }
}



