class Factorial{

public static void main(String a[]){

System.out.println("main method started");
myFact(6);
System.out.println("main method ended");

}

public static void myFact(int n){
System.out.println("myFact method started");
int fact=1;
for (int i=1;i<=n;i++){

fact=fact*i;
}
System.out.println(fact);
System.out.println("myFact method ended");

}
}




