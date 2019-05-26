import javax.swing.JButton;
import javax.swing.JPanel;

public class JDoneButton extends JButton implements Attachable{
	JDoneButton(String title)
	{
		super(title);
	}
	public void attach(JPanel target)
	{
		target.add(this);
	}
}
