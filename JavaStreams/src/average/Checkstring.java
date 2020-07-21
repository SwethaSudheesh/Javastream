package average;
import java.util.*; 
//import java.util.Scanner;
import java.util.stream.Collectors;
//import java.util.ArrayList;
public class Checkstring {
	public static List<String> search(List<String> list) {
		return list.stream()
				  .filter(s -> s.startsWith("a"))
				  .filter(s -> s.length() == 3)
				  .collect(Collectors.toList());
	}
	 public static void main(String[] args) 
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter number of elements");
		 int n=sc.nextInt();
	    ArrayList<String> a = new ArrayList<>();
		 System.out.println("Enter elements");
	    for(int i=0;i<n;i++)
	     a.add(sc.next());
	      List<String> result= search(a);
	            System.out.println(result);
	     sc.close();  
	    }
}
