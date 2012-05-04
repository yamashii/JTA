package twitter.gui.swing.menu.action;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExitMenuAction implements ActionListener {

	public void actionPerformed(ActionEvent arg0) {
		System.out.println("システムを終了します。"); //$NON-NLS-1$
		System.exit(0);
	}

}
