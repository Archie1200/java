package practice3oct;

import java.util.Scanner;

public class Topper {
    String name;
    float pct;
    String smax;
    Topper(){
        super();
    }
    Topper(String name,float pct){
        this.name=name;
        this.pct=pct;
    }
    public void show(Topper arr[]){
        float max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].pct>=max) {
                max = arr[i].pct;
                smax = arr[i].name;
            }
        }
        System.out.println("Topper of the University is:");
        System.out.println("Name"+" "+smax+""+"Percentage"+" "+max+"%");
    }
}

class display9{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Topper obj = new Topper();
        Topper arr[]= new Topper[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=new Topper(scan.next(), scan.nextFloat());
        }
        obj.show(arr);
    }
}
