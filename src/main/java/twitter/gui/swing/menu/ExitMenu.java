package twitter.gui.swing.menu;

import javax.swing.JMenuItem;

import twitter.gui.swing.menu.action.ExitMenuAction;

public class ExitMenu {
	private JMenuItem item;

	public ExitMenu() {
		this.item = new JMenuItem("EXIT"); //$NON-NLS-1$
		this.item.addActionListener(new ExitMenuAction());
	}

	public JMenuItem getExitMenuComponent() {
		return this.item;
	}
}
