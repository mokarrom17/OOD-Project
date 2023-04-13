
package supermarket;


public class ProductBilling extends ProductList{
  public double b;
   public double total ;
 public void totalbilling(){
        b++;
       System.out.println("Total Bill is "+b);
  }
    public   void Milk(double m){
         b = m*75;
        System.out.println("Your bill is "+b);        
    }
    
    public  void Bread(double m){
         b = m*50;
        System.out.println("Your bill is "+b);
    }
    
    public  void Eggs(double m){
         b = m*10;
        System.out.println("Your bill is "+b);
    }
    
    public  void Chips(double m ){
         b = m*15;
        System.out.println("Your bill is "+b);
    }
    
    public  void Cookies(double m){
         b = m*60;
        System.out.println("Your bill is "+b);
    }
        public  void Pant(double m){
         b = m*500;
        System.out.println("Your bill is "+b);
    }
    
    public  void Shirt(double m){
         b = m*400;
        System.out.println("Your bill is "+b);
    }
    
    public  void TShirt(double m){
        b = m*300;
        System.out.println("Your bill is "+b);
    }
    
    public  void Jogger(double m){
         b = m*250;
        System.out.println("Your bill is "+b);
    }
    
    public  void Jersey(double m){
         b = m*350;
        System.out.println("Your bill is "+b);
    }
     public  void Joggers(double m){
         b = m*350;
        System.out.println("Your bill is "+b);
    }
      public  void Gloves(double m){
         b = m*150;
        System.out.println("Your bill is "+b);
    }
       public  void SportShoe(double m){
        b = m*2000;
        System.out.println("Your bill is "+b);
    }
    
    
}
