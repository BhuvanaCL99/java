class GasCylinder{

public String name;
public int cost;
public String color;

public GasCylinder(String name,int cost,String color){
System.out.println("Object is created");
this.name=name;
this.cost=cost;
this.color=color;
}

public static void main(String a[]){

GasCylinder gas=new GasCylinder("Indian",850,"Red");

System.out.println(gas.name+" "+gas.cost+" "+gas.color);
}
}