import java.util.Scanner;

public class RoundValues{
  public static void main(String[] args){
    double v1;
    Scanner userinput = new Scanner(System.in);
    System.out.println("Enter a decimal value which has more than two decimal points: ");
    v1 = userinput.nextDouble();
    userinput.close();
    v1 = Math.round(v1*100)/100.0d;
    System.out.println("The value you entered rounded to two decimal points is " + v1);
  }
}
