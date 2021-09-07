class Ncr{
public static void main(String a[]){
int nCr=fact(5)/(fact(4)*fact(5-4));
System.out.println(nCr);
}

public static int fact(int n){
int fact=1;
for (int i=1;i<=n;i++){
fact=fact*i;
}
return fact;
}
}