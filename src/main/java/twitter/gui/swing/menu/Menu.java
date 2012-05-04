package twitter.gui.swing.menu;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class Menu extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JMenuBar bar;

	public Menu() {
		this.bar = new JMenuBar();
		JMenu exit = new JMenu("EXIT"); //$NON-NLS-1$
		JMenu toMyTweet = new JMenu("自分へのツイート"); //$NON-NLS-1$
		
		exit.add(new ExitMenu().getExitMenuComponent());
		this.bar.add(exit);
		this.bar.add(toMyTweet);
	}

	public JMenuBar getMenuBarComponent() {
		return this.bar;
	}
}
