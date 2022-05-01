public class CricketScore {
	
	 public static void Score(int one, int two,int three, int four,int six)
	 {
		     
		     int total = one + two + three + four*4 + six*6;
		     System.out.println("Total Score is : "+total);
	 }
	 
	 public static void main(String[] args) {
		   
		   Score(6, 5, 9, 24, 15);
	}
	 
	 

}