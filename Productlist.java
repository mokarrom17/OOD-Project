package SuperMarket;
import java.util.Scanner;
public class Productlist {
    public static class ProductList extends ProductBilling {

        private Object b;

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
                            double b = m * 75;
                            System.out.println("Your bill is " + b);


                            //p.Milk(m);
                            break;
                        }
                        case 2: {
                            System.out.println("Enter your amount:");
                            System.out.print("Bread =");
                            double m = (int) input.nextDouble();
                            double b = m * 50;
                            System.out.println("Your bill is " + b);
                            //p.Bread(m);
                            break;
                        }
                        case 3: {
                            System.out.println("Enter your amount:");
                            System.out.print("Eggs =");
                            double m = (int) input.nextDouble();
                            double b = m * 10;
                            System.out.println("Your bill is " + b);
                            break;
                        }
                        case 4: {
                            System.out.println("Enter your amount:");
                            System.out.print("Chips =");
                            double m = (int) input.nextDouble();
                            b = m * 15;
                            System.out.println("Your bill is " + b);
                            //p.Chips(m);
                            break;
                        }
                        case 5: {
                            System.out.println("Enter your amount:");
                            System.out.print("Cookies =");
                            double m = (int) input.nextDouble();
                            double b = m * 60;
                            System.out.println("Your bill is " + b);
                            //p.Cookies(m);
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
                            double b = m * 500;
                            System.out.println("Your bill is " + b);
                            //p.Pant(m);
                            break;
                        }
                        case 2: {
                            System.out.println("Enter your amount:");
                            System.out.print("Shirt =");
                            double m = input.nextDouble();
                            double b = m * 400;
                            System.out.println("Your bill is " + b);
                            // p.Shirt(m);
                            break;
                        }
                        case 3: {
                            System.out.println("Enter your amount:");
                            System.out.print("T-shirt =");
                            double m = input.nextDouble();
                            double b = m * 300;
                            System.out.println("Your bill is " + b);
                            // p.TShirt(m);
                            break;
                        }
                        case 4: {
                            System.out.println("Enter your amount:");
                            System.out.print("Jogger =");
                            double m = input.nextDouble();
                            double b = m * 250;
                            System.out.println("Your bill is " + b);
                            // p.Jogger(m);
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
                            double b = m * 350;
                            System.out.println("Your bill is " + b);
                            // p.Jersey(m);
                            break;
                        }
                        case 2: {
                            System.out.println("Enter your amount:");
                            System.out.print("Joggers =");
                            double m = input.nextDouble();
                            b = m * 350;
                            System.out.println("Your bill is " + b);
                            // p.Joggers(m);
                            break;
                        }
                        case 3: {
                            System.out.println("Enter your amount:");
                            System.out.print("Gloves =");
                            double m = input.nextDouble();
                            b = m * 150;
                            System.out.println("Your bill is " + b);
                            // p.Gloves(m);
                            break;
                        }
                        case 4: {
                            System.out.println("Enter your amount:");
                            System.out.print("Sport-show =");
                            double m = input.nextDouble();
                            b = m * 2000;
                            System.out.println("Your bill is " + b);
                            // p.SportShoe(m);
                            break;
                        }

                    }
                }

            }
        }
}
