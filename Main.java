import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Array length ");
          int n = scan.nextInt();
          Array a = new Array(n);

          while (true){
              System.out.println("Press 1 ---Inserting");
              System.out.println("Press 2 ---Deleting");
              System.out.println("Press 3 ---Display");

              System.out.println("Enter your choice");
               int choice = scan.nextInt();

              switch (choice){
                  case 1 :
                      a.instar();
                      break;

                  case 2:
                      a.delete();
                      break;
                  case 3:
                      a.display();
                        break;

                  default:System.exit(0);

              }


          }
    }
}