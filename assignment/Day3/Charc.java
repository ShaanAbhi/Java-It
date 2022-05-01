

public class Charc{

	 void vowelAndConsonant(char ch){

	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            {
                System.out.println( ch +" is Vowel");
            }	
	else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
                System.out.println(ch +" is Consonant");
            else
                System.out.println("Not an alphabet");
        	

	}
  
        public static void main(String[] args) {
            
	Charc x1 = new Charc();
	 char ch = 'a';
	
	x1.vowelAndConsonant(ch);
	 ch = 'b';
	
	x1.vowelAndConsonant(ch);
	
	 ch = '2';
	
	x1.vowelAndConsonant(ch);
   } 
            
            
    }