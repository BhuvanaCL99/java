class AmusementParkTester{

public static void main(String a[]){

AmusementPark amusementPark= new AmusementPark();

amusementPark.name="Wonderala";
amusementPark.location="Bangalore";
amusementPark.fee=2000;

System.out.println(amusementPark.name+" "+amusementPark.location+" "+amusementPark.fee);

amusementPark.entertainment();

AmusementPark amusementPark1= new AmusementPark();

amusementPark1.name="Snow City";
amusementPark1.location="Bangalore";
amusementPark1.fee=1500;

System.out.println(amusementPark1.name+" "+amusementPark1.location+" "+amusementPark1.fee);

amusementPark.entertainment();

AmusementPark amusementPark2= new AmusementPark();

amusementPark2.name="GRS Fantasy park";
amusementPark2.location="Mysore";
amusementPark2.fee=2500;

System.out.println(amusementPark2.name+" "+amusementPark2.location+" "+amusementPark2.fee);

amusementPark.entertainment();

}
}