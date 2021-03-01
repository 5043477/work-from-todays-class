import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("welcome to the dmv. lets help you get your permit. what is your name.");
    Scanner scan = new Scanner(System.in);
    String name = scan.next();
    System.out.println("hello " + name + ". how old are you ");
    int age = scan.nextInt();

    if (age < 18) {
      System.out.println("lets check if you qualify for your permit");
      System.out.println("have you passed the traffic law test ");
      boolean trafficTest = scan.nextBoolean();
      System.out.println("have you passed the road rules test?");
      boolean roadTest = scan.nextBoolean();
      System.out.println("have you passed the vision and hearing test");
      boolean vhTest = scan.nextBoolean();

      if (trafficTest && roadTest && vhTest) {

      } else {
        System.out.println("uh oh! looks like you haven't passed all 3 tests. make sure to go back and complete them.");
      }
    }
  }
  public static void qualifies() {
    System.out.println("have you passed the traffic law test ");
    boolean trafficTest = Scan.nextBoolean();
    System.out.println("have you passed the road rules test?");
    boolean roadTest = Scan.nextBoolean();
    System.out.println("have you passed the vision and hearing test");
    boolean vhTest = Scan.nextBoolean();

    if (trafficTest && roadTest && vhTest) {
System.out.println("looks like you're ready for the next step");
proofOfId();
    } else {
      System.out.println("uh oh! looks like you haven't passed all 3 tests. make sure to go back and complete them.");
    }
  }
  public static void proofOfId(){
    Scanner scan = new Scanner(System.in);
    System.out.println("do you have proof of completion for the traffic law course?");
    boolean dataProof = scan.nextBoolean();
    System.out.println("do you have parental consent?");
    boolean consent = Scan.nextBoolean();
    System.out.println("do you have proof of identity?");
boolean id = scan.nextBoolean();

if(dataProof && consent && id)
   {
    System.out.println("Congratulations, here is your permit.");
   }
  }
}