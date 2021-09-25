class Weather{

public  String name;
public String temperature;
public String clouds;

public Weather(String na, String temp,String cld){
System.out.println("atmosphere object is created");
	name=na;
	temperature=temp;
	clouds=cld;
}
public void atmosphere(){
System.out.println("nice weather");
}
public void displayDetails(){
System.out.println(name+" " +temperature+" " +clouds);

}
}