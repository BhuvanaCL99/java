class WeatherUtil{

public static void main(String a[]){

Weather climate = new Weather("Rainy","23DC","Strato-form");
climate.atmosphere();
climate.displayDetails();


Weather climate1 = new Weather("Windy","45DC","Nimbo-form");
climate1.atmosphere();
climate1.displayDetails();

}

}