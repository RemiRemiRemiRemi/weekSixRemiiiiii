//C'est moi, Remi!
//3/10/25
//Test problem #2 - Pythagorean triples

import java.util.*;

public class assessmentRemi2 {
    public static void main(String[]args){


Scanner input = new Scanner(System.in);
int m;
int n;
int sideOne;
int sideTwo;
int hyp;
double cost;

System.out.println("Alright so like, what's the value of the variable m?? (we're gonna make a Pythagorean triple) Alsooooooo btw m should be greater than the next value you will input, n");

m = input.nextInt();

System.out.println("Okkkkkkkkkk now what's the value of n??????");

n = input.nextInt();

sideOne = (m * m) - (n * n);
sideTwo = 2 * m * n;
hyp = (m * m) + (n * n);

cost = (2.412 * sideOne) + (3.767 * sideTwo) + (15.758 * hyp);

System.out.println("Ok so like the measure of side one is " + sideOne + " units, the measure of side two is " + sideTwo + " units, and the measure of the hypotenuse is " + hyp + " units. Have a good day! ;)");
System.out.println("also btw the cost is " + cost);
    }
}
