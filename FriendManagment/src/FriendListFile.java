import java.util.Scanner;
import java.io.File;

public class FriendListFile {
	
	public FriendList readFileToList(String fileName)
	{

		File friendFile = new File(fileName);
		Scanner input = null;
		String curLine=null;
		String[] parsedString;
		FriendList fList = new FriendList();
		
		try {
			input = new Scanner(friendFile);
			while(input.hasNextLine())
			{
				curLine = input.nextLine();
				if(curLine.contains("//"))
					continue;
				else
				{
					parsedString = curLine.split(":");
					String[] trimedString = new String[parsedString.length];
					for(int i=0;i<parsedString.length;i++)
					{
						trimedString[i] = parsedString[i].trim();
					}
					
					if(fList.checkNameRepeat(trimedString[0]))
					{
						System.out.println("Name Conflict");
						fList.setError();
						break;
					}
					else if(trimedString.length != 5)
					{
						System.out.println("Irregular input line");
						System.out.println("Skip the input line : " + curLine);
						fList.setError();
						break;
					}
					else if(!trimedString[3].contains("@"))
					{
						System.out.println("Illegal email address");
						System.out.println("Skip the input line : "+ curLine);
						fList.setError();
						break;
					}
					else 
					{
						fList.addFriend(new Friend(trimedString));
					}

				}
			}
			
			input.close();
		}
		catch(NumberFormatException e)
		{
			System.out.println("Illegal value");
			System.out.println("Skip the input line : "+ curLine);
			fList.setError();
		}
		catch(Exception e)
		{
			System.out.println("Unknown File");
			fList.setError();
		}
		
		return fList;
	}
	
}
