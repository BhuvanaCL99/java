class FlimIndustryTester{

public static void main(String a[]){

FlimIndustry flimIndustry= new FlimIndustry();
 flimIndustry.nameOfIndustry="Sandalwood";
 flimIndustry.nameOfMovie="Maanikya";
 flimIndustry.nameOfActor="Sudeep Sanjeev";
 flimIndustry.nameOfProducers="N. M. Kumar,Priya Sudeep";
 flimIndustry.musicBy="Arjun Janya";
 
 System.out.println(flimIndustry.nameOfMovie+" " +flimIndustry.nameOfActor+ " " +flimIndustry.nameOfProducers+" " +flimIndustry.musicBy);
 flimIndustry.movie();
 
 FlimIndustry flimIndustry1= new FlimIndustry();
 flimIndustry1.nameOfIndustry="Bollywood";
 flimIndustry1.nameOfMovie="Chhichhore";
 flimIndustry1.nameOfActor="Sushant Singh Rajput";
 flimIndustry1.nameOfProducers="Nitesh Tiwari";
 flimIndustry1.musicBy="Pritam";
 
 System.out.println(flimIndustry1.nameOfMovie+" " +flimIndustry1.nameOfActor+ " " +flimIndustry1.nameOfProducers+" " +flimIndustry1.musicBy);
 flimIndustry.movie();
 
 FlimIndustry flimIndustry2= new FlimIndustry();
 flimIndustry2.nameOfIndustry="Tollywood";
 flimIndustry2.nameOfMovie="Maharshi";
 flimIndustry2.nameOfActor="Mahesh Babu";
 flimIndustry2.nameOfProducers="Dil Raju,C. Ashwini Dutt,Prasad V. Potluri,Param V. Potluri";
 flimIndustry2.musicBy="Devi Sri Prasad";
 
 System.out.println(flimIndustry2.nameOfMovie+" " +flimIndustry2.nameOfActor+ " " +flimIndustry2.nameOfProducers+" " +flimIndustry2.musicBy);
 flimIndustry.movie();
 
}
}