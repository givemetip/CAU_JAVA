import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class JFriendHeader implements Attachable{
	private ArrayList<JTextField> jHeader;
	
	JFriendHeader()
	{
		jHeader = new ArrayList<JTextField>();
		
	}
	
	public void setHeader(String[] header)
	{
		JTextField tmp;
		/*
		tmp =new JTextField();
		tmp.setEditable(false);
		jHeader.add(tmp);
		*/
		
;		for(int i=0;i<header.length;i++)
		{
			tmp =new JTextField(header[i]);
			tmp.setEditable(false);
			tmp.setHorizontalAlignment(JTextField.CENTER);
			jHeader.add(tmp);
		}	
	}
	
	public void attach(JPanel target)
	{
		JTextField tmp = new JTextField();
		tmp.setEditable(false);
		target.add(tmp);
		for(JTextField elm : jHeader)
		{
			target.add(elm);
		}		
	}
	
	public void attachNoBlank(JPanel target)
	{
		for(JTextField elm : jHeader)
		{
			target.add(elm);
		}		
		
	}
}
