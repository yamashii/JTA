package twitter.gui.swing;

import java.awt.Container;

import javax.swing.JFrame;

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
