import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class JFriendAddForm implements Attachable{
	private JFriendHeader jHeader;
	private ArrayList<JTextField> addForm;
	
	JFriendAddForm()
	{
		jHeader = new JFriendHeader();
		addForm = new ArrayList<JTextField>();
	}
	
	public void setForm(FriendList friendList)
	{
		String[] header = friendList.getHeader();
		jHeader.setHeader(header);
		
		for(int i=0;i<header.length;i++)
		{
			addForm.add(new JTextField());
		}

		for(JTextField elm : addForm)
		{
			System.out.println(elm.getText());
		}
	}
	
	public void attach(JPanel target)
	{
		
		jHeader.attachNoBlank(target);
		
		for(JTextField elm : addForm)
		{
			target.add(elm);
		}
	}
	
	public ArrayList<String> getAddedText()
	{
		ArrayList<String> addedText = new ArrayList<String>();
		for(JTextField elm : addForm)
		{
			addedText.add(elm.getText());
		}
		return addedText;
	}
}
