class Telecommunication{
  
  public static long adharNo=806850461223l;
  
  public static void allow(String[] details){
	  System.out.println("inside allow method");
     if(adharNo>0){
	 System.out.println("Eligible to have sim");
	 
	 if(null!=details){
		 System.out.println("details are found");
		 
		 getCandidateDetails(details);
		 
	 }
	 else{
	   System.out.println("no details");
	 }
	 
	 }
  
  else{
	  
	  System.out.println("go and get CitizenShip");
  }
  System.out.println("end of allow method");
  }
  
  public static void getCandidateDetails(String[] details){
	  
	  for(int i=0;i<details.length; i++){
		  System.out.println(details[i]);
	}
  }
  
}