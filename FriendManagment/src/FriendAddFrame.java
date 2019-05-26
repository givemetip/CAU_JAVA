import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class FriendAddFrame extends JFrame {
	
	private JPanel listPanel;
	private JPanel bttPanel;
	
	FriendAddFrame(String title)
	{
		super(title);
	
		listPanel = new JPanel();
		bttPanel = new JPanel();
	}
	
	public void init()
	{
		setSize(800,200);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		setLayout(new BorderLayout());
		
		listPanel.setLayout(new GridLayout(2,5));
		bttPanel.setLayout(new GridLayout(0,1));
		
		add(listPanel,BorderLayout.CENTER);
		add(bttPanel,BorderLayout.EAST);
		
		setVisible(false);
	}
	
	public void attachToListPanel(Attachable inAttach)
	{
		inAttach.attach(listPanel);
	}
	
	public void attachToBttPanel(Attachable inAttach)
	{
		inAttach.attach(bttPanel);
	}
}
