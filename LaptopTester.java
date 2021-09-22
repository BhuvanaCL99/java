class LaptopTester{

public static void main(String a[]){

  Laptop laptop = new Laptop();                                                                             
  laptop.name="DELL";
  laptop.price=70989;
  laptop.color="Dark Shadow Grey";
  laptop.type="Gaming Laptop";
  
  System.out.println(laptop.name+" "+laptop.price+" "+laptop.color+" "+laptop.type);
  
  laptop.work();
  
  
  Laptop laptop1 = new Laptop();                                                                             
  laptop1.name="LENEVO";
  laptop1.price=56499;
  laptop1.color="Platinum Grey";
  laptop1.type="Gaming Laptop";
  
  System.out.println(laptop1.name+" "+laptop1.price+" "+laptop1.color+" "+laptop1.type);
  
  laptop.work();
  
  
  
  Laptop laptop2 = new Laptop();                                                                             
  laptop2.name="HP";
  laptop2.price=71979;
  laptop2.color="Black";
  laptop2.type="ultrabook";
  
  System.out.println(laptop2.name+" "+laptop2.price+" "+laptop2.color+" "+laptop2.type);
  
  laptop.work();
  
  
}
}