import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

public class JFriendButton implements Attachable{

	private ArrayList<JButton> buttons;

	JFriendButton()
	{
		buttons = new ArrayList<JButton>();
	}
	
	public void init()
	{
		buttons.add(new JButton("Add"));
		buttons.add(new JButton("Delete"));
		buttons.add(new JButton("Modify"));
		buttons.add(new JButton("Save_All"));
	}
	
	public void attach(JPanel target)
	{
		for(JButton elm : buttons)
		{
			target.add(elm);
		}
	}
	
	public void setActionListener(ActionListener al, BttType type)
	{
		JButton btt = buttons.get(type.ordinal());
		btt.addActionListener(al);
	}
}

