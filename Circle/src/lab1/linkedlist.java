package lab1;
import java.util.LinkedList;
public class linkedlist {
	public static void main(String[] args) {
		LinkedList<String> OyutniiMedeelel = new LinkedList<String>();
		
			//oyutnii medeelel awah
		  OyutniiMedeelel.add("B190910032");
		  OyutniiMedeelel.add("Ð—.Ð¢Ñ�Ð¼Ò¯Ò¯Ð»Ñ�Ð½");
		  OyutniiMedeelel.add("ÐŸÑ€Ð¾Ð³Ñ€Ð°Ð¼ Ñ…Ð°Ð½Ð³Ð°Ð¼Ð¶ 2");
		  OyutniiMedeelel.add("Ð£Ñ‚Ð°Ñ�:88956646");
		  OyutniiMedeelel.add("Gmail:ttemvvlen.0717@gmail.com");
		  
		   System.out.println(OyutniiMedeelel);
		   
		   
		   
		   
		   OyutniiMedeelel.add("B190910803");
			  OyutniiMedeelel.add("L. Enkhsuren");
			  OyutniiMedeelel.add("SoftWare");
			  OyutniiMedeelel.add("Phone: ********");
			  OyutniiMedeelel.add("Gmail:eenkhsuren10@gmail.com");
			  
			   System.out.println(OyutniiMedeelel);
		    
		
		
		
		  LinkedList<String> First = new LinkedList<String>();
		  First.add("B190910032");
		  First.add("Ð—.Ð¢Ñ�Ð¼Ò¯Ò¯Ð»Ñ�Ð½");
		  First.add("ÐŸÑ€Ð¾Ð³Ñ€Ð°Ð¼ Ñ…Ð°Ð½Ð³Ð°Ð¼Ð¶ 2");
		  First.add("Ð£Ñ‚Ð°Ñ�:88956646");
		  First.add("Gmail:ttemvvlen.0717@gmail.com");
		  
		  //GetFirst ashiglasan
		    System.out.println("Oyutnii code:"+OyutniiMedeelel.getFirst());
		    
		    
		    
		    LinkedList<String> Last = new LinkedList<String>();
		    
			  Last.add("B190910032");
			  Last.add("Ð—.Ð¢Ñ�Ð¼Ò¯Ò¯Ð»Ñ�Ð½");
			  Last.add("ÐŸÑ€Ð¾Ð³Ñ€Ð°Ð¼ Ñ…Ð°Ð½Ð³Ð°Ð¼Ð¶ 2");
			  Last.add("Ð£Ñ‚Ð°Ñ�:88956646");
			  Last.add("Gmail:ttemvvlen.0717@gmail.com");
			  
			  //GetLast ashiglasan
			    System.out.println(Last.getLast());
			    
	}		
}
