import java.util.ArrayList;

import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JFriend implements Attachable{
	private JCheckBox checkBox;
	private ArrayList<JTextField> friendInfo;
	
	JFriend()
	{
		friendInfo = new ArrayList<JTextField>();
		checkBox = new JCheckBox();
		
	}
	
	public void set(Friend friend)
	{
		String[] fInfo = friend.getFriendInfo();
		for(int i=0;i<fInfo.length;i++)
		{
			JTextField jInfo = new JTextField(fInfo[i]);
			friendInfo.add(jInfo);
		}
		friendInfo.get(0).setEditable(false);
	}
	
	public void set(ArrayList<String> info)
	{
		for(String elm : info)
		{
			JTextField jInfo = new JTextField(elm);
			friendInfo.add(jInfo);
		}
		friendInfo.get(0).setEditable(false);
	}
	
	
	
	public void attach(JPanel target)
	{
		target.add(checkBox);
		
		for(JTextField info : friendInfo)
		{	
			target.add(info);
		}
		
	}
	
	public boolean isChecked()
	{
		if(checkBox.isSelected()) return true;
		else return false;
	}
	
	public void deleteForm(JPanel panel)
	{
		panel.remove(checkBox);
		for(JTextField elm : friendInfo)
		{
			panel.remove(elm);
		}
	}
}
