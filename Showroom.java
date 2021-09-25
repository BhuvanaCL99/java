class Showroom{

public String name;
public String location;
public String type;

public Showroom(String name,String location,String type){

this.name=name;
this.location=location;
this.type=type;

}

public static void main(String a[]){

Showroom sr= new Showroom("Maruthi","Tiptur","Bike");
System.out.println(sr.name+" "+sr.location+" "+sr.type);
}
}