class Stadium{

public String name;
public String location;

public Stadium(String name,String location){

this.name=name;
this.location=location;
}

public static void main(String a[]){

Stadium st=new Stadium("Chinnaswamy","Bangalore");
System.out.println(st.name+" "+st.location);
}
}