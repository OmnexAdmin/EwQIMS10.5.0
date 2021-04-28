package practice;

import java.util.HashMap;
import java.util.Map;

public class stringLearning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//String str1="https://www.google.com/search?q=cognizant&oq=cognizant&aqs=chrome.0.69i59j0i433l3j0i131i433j0l2j69i61.3365j0j7&sourceid=chrome&ie=UTF-8";
	String str1="Keerthivasan";
Map<Character, Integer> map= new HashMap<Character, Integer>();

char[] carr= str1.toCharArray();

for(Character ch:carr ) {
	
	if(map.containsKey('k')) {
		map.put('k', map.get('k'));
		
		//System.out.println(map);
			} /*
				 * else { map.put('k', 1); //System.out.println(map); }
				 */
}
System.out.println(map);

		/*
		 * String str2[]=str1.split("\\?");
		 * System.out.println("the splitted value for ? is "+ str2[1]);
		 * 
		 * String test=str2[1];
		 * 
		 * String str5[]=test.split("\\&");
		 * System.out.println("the splited value for & is "+ str5[0]);
		 * 
		 */
		/*
		 * String str3[]=str1.split("\\=");
		 * System.out.println("the splited value for = is "+ str3[1]);
		 * 
		 * String str4= str3[1]; System.out.println("the value stored in str4 is "+
		 * str4);
		 * 
		 * String str5[]=str4.split("\\&");
		 * System.out.println("the splited value for & is "+ str5[0]);
		 * 
		 * 
		 * int index= str1.indexOf('q'); System.out.println(index);
		 * 
		 * 
		 * int index1= str1.indexOf('t'); System.out.println(index1);
		 * 
		 */

	}

}
