package twitter.gui.swing.display;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import twitter.tl.friends.FriendsTimeLine;
import twitter4j.ResponseList;
import twitter4j.Status;
import twitter4j.Twitter;


/**
 * @author yamashita
 * @version $Revision$, 2012/05/29
 */
public class TLDisplay extends JPanel {

  /** */
  private static final long serialVersionUID = 1L;
  private Twitter twitter;

  /**
   * Initialize the generated object of {@link TLDisplay}.
   * 
   * @param twitter
   */
  public TLDisplay(Twitter twitter) {
    setBackground(Color.white);
    this.twitter = twitter;
  }

  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.setColor(Color.black);
    FriendsTimeLine tl = new FriendsTimeLine(this.twitter);
    ResponseList<Status> resList = tl.getResList();
    for (Status status : resList) {

    }
    g.drawString("test", 10, 30);
  }
}
