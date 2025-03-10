//Remi-Laurent Guy!
//3/10/25
//Test problem #1 - concrete

import java.util.*;

public class assessmentRemi{
    public static void main(String[]args){

int poles;
double concrete;
double price;

Scanner input = new Scanner(System.in);


System.out.println("how many poles in the barn?");

poles = input.nextInt();

concrete = poles * (3.14 * (1.5 * 1.5) * 5);

price = concrete * 12.98;

System.out.println("Ok so you are going to need " + concrete + " cubic feet of concrete to make this barn and it's gonna cost " + "$" + price);
    }
}