package practice3oct;

import java.util.Arrays;
import java.util.Scanner;

public class Car {
    String manufacturer;
    float price;
    Car(String manufacturer,float price){
        this.manufacturer=manufacturer;
        this.price=price;
    }
    Car(){

    }
    public void sort(float str[],Car arr[]){
        Arrays.sort(str);
        for(int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr.length; j++) {
                if (str[i] == arr[j].price)
                    System.out.println(arr[j].manufacturer + " " + arr[j].price);
            }
        }
    }
}
class display10{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Car obj = new Car();
        Car arr[]= new Car[3];
        float str[]= new float [3];
        for(int i=0;i<arr.length;i++){
            arr[i]=new Car(scan.next(),scan.nextFloat());
            str[i]=arr[i].price;
        }
        obj.sort(str,arr);
    }
}
