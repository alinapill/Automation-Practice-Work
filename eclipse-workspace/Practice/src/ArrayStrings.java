
public class ArrayStrings {

	public static void main (String[] args) {
		String[] string = new String[3];
		string[0] = "a";
		string[1] = "b";
		string[2] = "c";		
	
		for(String s : string) {
			System.out.println(s);
		}
	}
}
