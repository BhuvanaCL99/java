class CountryArray{
static String countryName[]=new String[4];

public static void main(String a[]){

countryName[0]="India";
countryName[1]="Srilanka";
countryName[2]="Pakistan";
countryName[3]="Japan";
getCountryNames();

}

public static void getCountryNames(){
for(int i=0;i<countryName.length;i++)
{
System.out.println(countryName[i]);
}
}
}