import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class FriendApp {


	private FriendListFrame flFrame;
	private FriendAddFrame faFrame;
	
	
	//Component
	private FriendList friendList;	
	private JFriendList jFriendList;
	private JFriendAddForm jFriendAddForm;
	
	private JFriendButton jFriendButton;
	private JDoneButton addDone;
	
	FriendApp()
	{
		flFrame = new FriendListFrame("FriendList");
		faFrame = new FriendAddFrame("FriendAddForm");
		
		jFriendList = new JFriendList();
		jFriendAddForm = new JFriendAddForm();
		
		FriendListFile file = new FriendListFile();
		friendList = file.readFileToList("res/friendlist-norm.data");
		
		jFriendButton = new JFriendButton();
		addDone = new JDoneButton("Done");
	}
	
	public void init()
	{
		
		jFriendList.setByFriendList(friendList);
		jFriendAddForm.setForm(friendList);
		jFriendButton.init();
		
		flFrame.AttachToListPanel(jFriendList);
		flFrame.AttachToBttPanel(jFriendButton);
		flFrame.init();
		
		faFrame.attachToListPanel(jFriendAddForm);
		faFrame.attachToBttPanel(addDone);
		faFrame.init();
		
		setListener();
		
		
	}
	
	private void setListener()
	{
		//Add
		ActionListener addActListener = new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				faFrame.setVisible(true);
				
			}
		};

		jFriendButton.setActionListener(addActListener, BttType.ADD);
		
		//Delete
		ActionListener deleteListener = new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JFriend selectedJF = jFriendList.deleteCheckedJFriend();
				if(selectedJF==null)
				{
					System.out.println("There are no selected Friend");
					return;
				}
				else
				{
					flFrame.removeFromListPanel(selectedJF);
					flFrame.pack();
					flFrame.repaint();
				}
				
			}
		};
		
		jFriendButton.setActionListener(deleteListener, BttType.DELETE);
		
		//Modify
		ActionListener modifyListener = new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
			}
		};
		
		jFriendButton.setActionListener(modifyListener, BttType.MODIFY);
		
		//Save
		ActionListener saveListener = new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
			}
		};
		
		jFriendButton.setActionListener(saveListener, BttType.SAVE);
		
		//Done
		ActionListener doneListener = new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				ArrayList<String> addedText = jFriendAddForm.getAddedText();
				JFriend newJF = new JFriend();
				newJF.set(addedText);
				jFriendList.add(newJF);
				flFrame.AttachToListPanel(newJF);
				
				faFrame.setVisible(false);
				flFrame.pack();
				flFrame.repaint();
			}
		};
		
		addDone.addActionListener(doneListener);
		
	}
	
}
