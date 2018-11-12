import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class GettysburgMain {

	public static void main(String []args) throws FileNotFoundException
	{
		File getty = new File("GettysburgAddress.txt");
		Scanner file = new Scanner(getty);
		String gettyFile = file.nextLine();
		while(file.hasNextLine())
		{
			gettyFile = gettyFile + file.nextLine();
		}
	
		
		ArrayList<String> gettyRay = new ArrayList<String>(gettyFile.length());
		// variables for characters that would normally split sentences or end them
		String space = " ";
		String period = ".";
		String comma = ",";
		String dash = "-";
		
		String word = "";
		for(int i = 0; i < gettyFile.length(); i++)
		{
			// if the character at the index reaches the 
			if(gettyFile.charAt(i) == space.charAt(0) || gettyFile.charAt(i) == period.charAt(0) || gettyFile.charAt(i) == comma.charAt(0) || gettyFile.charAt(i) == dash.charAt(0))
			{
				gettyRay.add(word);
				word = "";
			}
			
			else
			{
				word = "" + word + gettyFile.charAt(i);
			}
			
			
		}
		
		// Failsafe: removes non-letter elements from arraylist gettyRay
		for(int i = 0; i < gettyRay.size(); i++)
		{
			String currentWord = gettyRay.get[i];
			if(currentWord.equals(".") || currentWord.equals(",") || currentWord.equals(" ") || currentWord.equals("-")) || currentWord.equals(""))
			{
				gettyRay.remove(i);
			}
			
			
		{
		
		String longest = "";
		// for(String gRWord : gettyRay)
		for(int i = 0; i < gettyRay.size(); i++)
		{
			String gRWord = gettyRay.get(i);
			if(longest.length() < gRWord.length())
			{
				longest = gRWord;
			}
			
		}
	
		double avgLength = 0;
		for(String gWord : gettyRay)
		{
			avgLength = avgLength + gWord.length();
			
		}
		avgLength = avgLength / gettyRay.size();
		
		System.out.println("The longest word in the Gettysburg Address is: " + longest);
		System.out.println("The average word length is: " + avgLength);
		
			
		// This was me just troubleshooting my program. Don't mind it too much!
		
		// System.out.println(gettyFile.length());
		// System.out.println(gettyRay.size());
		// System.out.println("" + gettyRay.get(gettyRay.size()-1));
		// System.out.println(gettyRay.get(11));
		
		// System.out.println(gettyFile);
		
		
		
		
	}

}
