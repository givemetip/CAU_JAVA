
public class Friend {
	private String name;
	private int groupNumber;
	private String phone;
	private String email;
	private String profile;
	
	
	
	Friend(String name, int groupNumber, String phone, String email,String profile)
	{
		this.name = name;
		this.groupNumber = groupNumber;
		this.phone = phone;
		this.email = email;
		this.profile = profile;
	}
	
	Friend(String[] friendInfo)
	{
		if(friendInfo.length != 5)
		{
			System.out.println("Invalid Friend Info");
		}
		else
		{
			this.name = friendInfo[0];
			this.groupNumber = Integer.parseInt(friendInfo[1].strip());
			this.phone = friendInfo[2];
			this.email = friendInfo[3];
			this.profile = friendInfo[4];
		}
		
	}
	
	public void print()
	{
		System.out.println("Name: " + name);
		System.out.println("Group Number: " + groupNumber);
		System.out.println("Phone Number: " + phone);
		System.out.println("Email: " + email);
		System.out.println("Profile Picture: " + profile);
	}
	
	public String getName()
	{
		return name;
	}
	
	public String[] getFriendInfo()
	{
		String[] infoStr = new String[5];
		
		infoStr[0] = name;
		infoStr[1] = Integer.toString(groupNumber);
		infoStr[2] = phone;
		infoStr[3] = email;
		infoStr[4] = profile;
		
		return infoStr;
	}
	
}
