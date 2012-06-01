package twitter.gui.swing;

import javax.swing.JFrame;
import javax.swing.JMenuBar;

import twitter.access.TwitterAccessor;
import twitter.gui.swing.display.TLDisplay;
import twitter.gui.swing.menu.Menu;
import twitter4j.Twitter;


/**
 * @author yamashita
 * @version $Revision$, 2012/05/25
 */
public class JTAMain extends JFrame {

  /**
	 * 
	 */
  private static final long serialVersionUID = 1L;
  private JMenuBar bar;

  /**
   * Initialize the generated object of {@link JTAMain}.
   * 
   * @param name
   */
  public JTAMain(String name) {
    super(name);
    this.bar = new Menu().getMenuBarComponent();
    this.setSize(400, 400);
    this.setLocationRelativeTo(null);
    this.setVisible(true);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    Twitter twitter = TwitterAccessor.accessTwitter();
    this.add(new TLDisplay(twitter));
  }

  /**
   * 
   */
  public void run() {
    this.setJMenuBar(this.bar);
  }
}
