class Sofa{

public String name;
public String color;
public int cost;

public Sofa(String name,String color,int cost){
System.out.println("Object is created");
this.name=name;
this.color=color;
this.cost=cost;
}

public static void main(String a[]){

Sofa sofa=new Sofa("Wakefit Dreamer","Blue",17179);
System.out.println(sofa.name+" "+sofa.color+" "+sofa.cost);

}
}