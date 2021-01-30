package lab1;
import java.util.LinkedList;
public class linkedlist {
	public static void main(String[] args) {
		LinkedList<String> OyutniiMedeelel = new LinkedList<String>();
		
			//oyutnii medeelel awah
		  OyutniiMedeelel.add("B190910032");
		  OyutniiMedeelel.add("З.Тэмүүлэн");
		  OyutniiMedeelel.add("Програм хангамж 2");
		  OyutniiMedeelel.add("Утас:88956646");
		  OyutniiMedeelel.add("Gmail:ttemvvlen.0717@gmail.com");
		  
		   System.out.println(OyutniiMedeelel);
		    
		
		
		
		  LinkedList<String> First = new LinkedList<String>();
		  First.add("B190910032");
		  First.add("З.Тэмүүлэн");
		  First.add("Програм хангамж 2");
		  First.add("Утас:88956646");
		  First.add("Gmail:ttemvvlen.0717@gmail.com");
		  
		  //GetFirst ashiglasan
		    System.out.println("Oyutnii code:"+OyutniiMedeelel.getFirst());
		    
		    
		    
		    LinkedList<String> Last = new LinkedList<String>();
		    
			  Last.add("B190910032");
			  Last.add("З.Тэмүүлэн");
			  Last.add("Програм хангамж 2");
			  Last.add("Утас:88956646");
			  Last.add("Gmail:ttemvvlen.0717@gmail.com");
			  
			  //GetLast ashiglasan
			    System.out.println(Last.getLast());
			    
	}		
}
