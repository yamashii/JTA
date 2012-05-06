package twitter.ui.swing;

import java.awt.Container;

import javax.swing.JFrame;

import twitter.ui.swing.menu.Menu;


public class JTAMain extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public JTAMain(String name) {
		super(name);
		this.setSize(400, 400);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void run() {
		Container pane  = this.getContentPane();
		this.setJMenuBar(new Menu().getMenuBarComponent());
	}
}
