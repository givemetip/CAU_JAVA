import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class FriendListFrame extends JFrame{
	
	private JPanel flPanel;
	private JPanel fmPanel;
	
	FriendListFrame(String title)
	{
		super(title);
		
		flPanel = new JPanel();
		fmPanel = new JPanel();
		
		
	}
	
	public void init()
	{
		setSize(800,600);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		setLayout(new BorderLayout());
		
		flPanel.setLayout(new GridLayout(0,6));
		fmPanel.setLayout(new GridLayout(0,1));
		
		add(flPanel,BorderLayout.CENTER);
		add(fmPanel,BorderLayout.EAST);

		pack();
		setVisible(true);
	}
	
	
	public void AttachToListPanel(Attachable inAttach)
	{
		inAttach.attach(flPanel);
		
	}
	
	public void AttachToBttPanel(Attachable inAttach)
	{
		inAttach.attach(fmPanel);
	}
	
	public void removeFromListPanel(JFriend jf)
	{
		jf.deleteForm(flPanel);
	}
}
