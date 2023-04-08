package SuperMarket;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter user name :");
        String user = sc.nextLine();
        System.out.println("Enter password :");
        String pass = sc.nextLine();

        ProductBilling p = new ProductBilling();
        p.setUsername("Mokarrom");
        p.setPassword("454520");
        String x = p.getUsername();
        String y = p.getPassword();
        int a = x.compareTo(user);
        int b = y.compareTo(pass);

        if (a == 0 && b == 0) {
            p.Logindisplay();
            Productlist p1 = new Productlist();
            new Productlist.ProductList();
            rep();

        }
        else{
            System.out.println("Login unsucessful");

        }




    }
    static void rep(){
        Scanner input = new Scanner(System.in);
        System.out.println("\nDo you wants to go Menu again? \n If yes enter 1 else 0");
        int choice = input.nextInt();
        Productlist p1 = new Productlist();
        if (choice == 1){
            new Productlist.ProductList();
            rep();
        }
        else
        {
            System.out.println("Thank you");
        }
    }
}
}
