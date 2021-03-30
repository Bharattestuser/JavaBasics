import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//system.out.println();
		System.out.println("I have stared JAVA learning");
		
		
	List<String> arraylist = new ArrayList<String>();
	arraylist.add("firstElement");
	arraylist.add("secondElement");
	arraylist.add("thirdElement");
	arraylist.add("FourthElement");
	
	System.out.println("elements added : "+ arraylist);
	String modified=null; String str=null;
	for (int i=0; i<arraylist.size() ;i++) {
		 str= arraylist.get(i);
		 modified= str.concat("concat");
		arraylist.remove(i);		
		arraylist.add(i, modified);
	}
		
	System.out.println("elements added ater processing : "+ arraylist);
	
	
	Map map = new HashMap<String,String>();
	map.put("name","user1");
	map.put("location", "loctionOne");
	
	System.out.println("to display maps" +map);
		
		
		
		
		
		
		
	}

}
