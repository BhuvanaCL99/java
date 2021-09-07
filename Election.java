class Election{
  public static String Location="Tiptur";
  public static int age=35;
  
  public static void allow(String[] details){
	  System.out.println("inside allow method");
     if(age>18){
	 System.out.println("Eligible for voting");
	 
	 if(null!=details){
		 System.out.println("details are found");
		 
		 getCandidateDetails(details);
		 
	 }
	 else{
	   System.out.println("no details");
	 }
	 
	 }
  
  else{
	  
	  System.out.println("pleas gwon up");
  }
  System.out.println("end of allow method");
  }
  
  public static void getCandidateDetails(String[] details){
	  
	  for(int i=0;i<details.length; i++){
		  System.out.println(details[i]);
	}
  }
  
}