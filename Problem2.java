public class Problem2
{
  public static void main(String[] args)
  {
    int val = 234;
    System.out.println("Initial value is " + val);
    System.out.println("Your first digit is " + (val/100));
    System.out.println("Your second digit is " + ((val/10)%10));
    System.out.println("Your third digit is " + (val%10));
  }
}


