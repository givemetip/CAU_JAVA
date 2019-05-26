import java.util.ArrayList;

import javax.swing.JPanel;

public class JFriendList implements Attachable{
	private JFriendHeader jHeader;
	private ArrayList<JFriend> jFriendList;
	
	JFriendList()
	{
		jHeader = new JFriendHeader();
		jFriendList = new ArrayList<JFriend>();
	}

	public void setByFriendList(FriendList friendList)
	{
		jHeader.setHeader(friendList.getHeader());
		for(int i=0;i<=friendList.getTop();i++)
		{
			JFriend tmp = new JFriend();
			tmp.set(friendList.getFriend(i));
			jFriendList.add(tmp);
		}
	}
	
	
	public void attach(JPanel target)
	{
		jHeader.attach(target);
		for(JFriend elm : jFriendList)
		{
			elm.attach(target);
		}
	}
	
	public JFriend deleteCheckedJFriend()
	{
		JFriend selectedJFriend = getCheckedJFriend();
		if(selectedJFriend==null) return null;
		else
		{
			jFriendList.remove(selectedJFriend);
			return selectedJFriend;
		}
	}
	
	public JFriend getCheckedJFriend()
	{
		for(JFriend elm : jFriendList)
		{
			if(elm.isChecked()) return elm;
		}
		
		return null;
	}
	
	public void add(JFriend newJF)
	{
		jFriendList.add(newJF);
	}
}
