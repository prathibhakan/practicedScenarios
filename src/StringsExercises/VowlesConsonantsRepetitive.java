package StringsExercises;

public class VowlesConsonantsRepetitive {

	public static void main(String[] args) {
		
		String str="Testing master";
		String[] arr = str.split("");
		System.out.println(arr.length);
		
		int vowelcount = 0;
		int consoCount = 0;
		for(int i = 0; i<str.length(); i++)
		{
			char c = str.charAt(i);
			if(c=='a' || c=='e'|| c=='i'|| c=='o' || c=='u' )
			{
				vowelcount = vowelcount+1;
				System.out.print(c);
			}
			else{
				consoCount=consoCount+1;
			}
		}
		System.out.println("No of consonants" +consoCount);
		System.out.println("No of Vowels : "+vowelcount);
	}
}