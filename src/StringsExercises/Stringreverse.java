package StringsExercises;

public class Stringreverse {

	public static void main(String[] args) {
		
		String str="Testing Masters Technologies";
		String rev = "";
		
		int strlength = str.length();
		System.out.println(str +strlength);
		
		for(int i=strlength-1; i>=0; i--)
		{
			rev = rev+str.charAt(i);
		}
		System.out.println("Reverse :: "+rev);
	}

}
