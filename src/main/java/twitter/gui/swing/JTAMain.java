package twitter.gui.swing;

import javax.swing.JFrame;

import twitter.gui.swing.menu.Menu;


/**
 * @author yamashita
 * @version $Revision$, 2012/05/25
 */
public class JTAMain extends JFrame {

  /**
	 * 
	 */
  private static final long serialVersionUID = 1L;

  /**
   * Initialize the generated object of {@link JTAMain}.
   * 
   * @param name
   */
  public JTAMain(String name) {
    super(name);
    this.setSize(400, 400);
    this.setLocationRelativeTo(null);
    this.setVisible(true);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  /**
   * 
   */
  public void run() {
    this.setJMenuBar(new Menu().getMenuBarComponent());
  }
}
