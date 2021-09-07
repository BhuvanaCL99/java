class ShoppingMallsArray{
static String[] nameOfMalls={"Orion","GT","Mantri"};

public static void main(String a[])
{
getMallsName();
}
public static void getMallsName()
{
for(int i=0;i< nameOfMalls.length;i++)
{
System.out.println(nameOfMalls[i]);
}
}
}