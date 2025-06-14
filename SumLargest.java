import java.util.Scanner;
public class SumLargest{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter First number");
int a = sc.nextInt();
System.out.println("Enter second number");
int b = sc.nextInt();
System.out.println("Enter third number");
int c = sc.nextInt();

int largest = Math.max(a,Math.max(b,c));
System.out.println("Largest of three is "+largest);
System.out.println("Sum with largest:"+(a+b+c));

int sum = a + b + c;
double avg = sum / 3.0;

System.out.println("Average :" + avg);

}


}
