package supermarket;

import java.util.Scanner;

public class ProductList extends Login {

    private Object p;
    private Object p1;
@Override
    void Logindisplay()
    {
        System.out.println("Login succesful");
    }
    
//    private Object b;

    void ProductList() {
        System.out.println(" Which types of Products are: ");
        System.out.println("""
                               1. Grocery.
                               2. Garments.
                               3. Sports.
                               """);
        Scanner input = new Scanner(System.in);
        System.out.println("Select your Product");
        int i = input.nextInt();

        switch (i) {
            case 1: {
                System.out.println("Which product:");
                System.out.println("""
                                       1.Milk.
                                       2.Bread.
                                       3.Eggs
                                       4.Chips.
                                       5.Cookies.
                                       """);
                System.out.println("Select your Product : ");

                int g = input.nextInt();

                switch (g) {
                    case 1: {
                        System.out.println("Enter your amount:");
                        System.out.print("Milk =");
                        double m = (int) input.nextDouble();
                        
                    ProductBilling p = new ProductBilling();
                        p.Milk(m);
                        break;
                    }
                    case 2: {
                        System.out.println("Enter your amount:");
                        System.out.print("Bread =");
                        double m = (int) input.nextDouble();
                    ProductBilling p = new ProductBilling();
                        p.Bread(m);
                        break;
                    }
                    case 3: {
                        System.out.println("Enter your amount:");
                        System.out.print("Eggs =");
                        double m = (int) input.nextDouble();
                    ProductBilling p = new ProductBilling();
                        p.Eggs(m);
                        break;
                    }
                    case 4: {
                        System.out.println("Enter your amount:");
                        System.out.print("Chips =");
                        double m = (int) input.nextDouble();
//                    
                    ProductBilling p = new ProductBilling();
                        
                       p.Chips(m);
                        break;
                    }
                    case 5: {
                        System.out.println("Enter your amount:");
                        System.out.print("Cookies =");
                        double m = (int) input.nextDouble();
                        ProductBilling p = new ProductBilling();
                       
                        p.Cookies(m);
                        break;
                    }
                }
            }
            break;
            case 2: {
                System.out.println("Which product:");
                System.out.println("""
                                       1.Pant.
                                       2.Shirt.
                                       3.T-shirt
                                       4.Jogger.
                                      
                                       """);
                System.out.println("Select your Product : ");
                int gm = input.nextInt();

                switch (gm) {
                    case 1: {
                        System.out.println("Enter your amount:");
                        System.out.print("Pant =");
                        double m = input.nextDouble();
                        ProductBilling p = new ProductBilling();
                        
                        p.Pant(m);
                        break;
                    }
                    case 2: {
                        System.out.println("Enter your amount:");
                        System.out.print("Shirt =");
                        double m = input.nextDouble();
                    ProductBilling p = new ProductBilling();
                        
                        p.Shirt(m);
                        break;
                    }
                    case 3: {
                        System.out.println("Enter your amount:");
                        System.out.print("T-shirt =");
                        double m = input.nextDouble();
                    ProductBilling p = new ProductBilling();
                       
                        p.TShirt(m);
                        break;
                    }
                    case 4: {
                        System.out.println("Enter your amount:");
                        System.out.print("Jogger =");
                        double m = input.nextDouble();
                    ProductBilling p = new ProductBilling();
                        
                        p.Jogger(m);
                        break;
                    }

                }
            }
            break;
            case 3: {
                System.out.println("Which product:");
                System.out.println("""
                                       1.Jersey.
                                       2.Joggers.
                                       3.Gloves.
                                       4.Sport-Show.
                                       
                                       """);
                System.out.println("Select your Product : ");

                int s = input.nextInt();

                switch (s) {
                    case 1: {
                        System.out.println("Enter your amount:");
                        System.out.print("Jersey =");
                        double m = input.nextDouble();
//                        double b = m * 350;
//                        System.out.println("Your bill is " + b);
                        // p.Jersey(m);
                        break;
                    }
                    case 2: {
                        System.out.println("Enter your amount:");
                        System.out.print("Joggers =");
                        double m = input.nextDouble();
                    ProductBilling p = new ProductBilling();
                        
                        p.Joggers(m);
                        break;
                    }
                    case 3: {
                        System.out.println("Enter your amount:");
                        System.out.print("Gloves =");
                        double m = input.nextDouble();
                    ProductBilling p = new ProductBilling();
                       
                         p.Gloves(m);
                        break;
                    }
                    case 4: {
                        System.out.println("Enter your amount:");
                        System.out.print("Sport-show =");
                        double m = input.nextDouble();
                    ProductBilling p = new ProductBilling();
                        p.SportShoe(m);
                        break;
                    }

                }
            }

        }
    }


}
