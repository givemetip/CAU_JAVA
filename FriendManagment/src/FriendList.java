
public class FriendList {
	private Friend[] friendList = new Friend[100];
	private int top=-1;
	final private String[] header = {"이름", "그룹", "전화번호", "Email", "사진"};
	
	public void addFriend(Friend newFriend)
	{
		top++;
		friendList[top] = newFriend;
	}
	
	public int numFriends()
	{
		return top;
	}
	
	public Friend getFriend(int i)
	{
		if(top < i)
		{
			System.out.println("Number of Friend is " + top);
			return null;
		}
		else
		{
			return friendList[i];	
		}
		
	}
	
	
	public int getTop()
	{
		return top;
	}
	
	public boolean checkNameRepeat(String inputName)
	{
		String nowName;
		for(int i=0;i<top+1;i++)
		{
			nowName = friendList[i].getName();
			if(nowName.equals(inputName)) return true; 
		}
		return false;
	}
	
	public void setError()
	{
		this.top = -1;
	}
	
	public String[] getHeader()
	{
		return header;
	}
}
