package supermarket;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter user name :");
        String user = sc.nextLine();
        System.out.println("Enter password :");
        String pass = sc.nextLine();

        ProductList pl = new ProductList();
        pl .setUsername("Mokarrom");
        pl .setPassword("454520");
        String x = pl.getUsername();
        String y = pl.getPassword();
        int a = x.compareTo(user);
        int b = y.compareTo(pass);

        if (a == 0 && b == 0) {
          pl.ProductList();
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
        ProductList pl = new ProductList();
        if (choice == 1){
            pl.ProductList();           
            rep();
             
        }
        else
        {
            System.out.println("Thank you");
        }
        }
}
