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
  private ResponseList<Status> resList;

  /**
   * Initialize the generated object of {@link TLDisplay}.
   * 
   * @param twitter
   */
  public TLDisplay(Twitter twitter) {
    setBackground(Color.white);
    this.twitter = twitter;
    this.resList = getResList();
  }

  private ResponseList<Status> getResList() {
    FriendsTimeLine tl = new FriendsTimeLine(this.twitter);
    tl.func();
    return tl.getResList();
  }

  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.setColor(Color.black);
    int x = 10;
    int y = 30;
    int count = 1;
    for (Status status : this.resList) {
      g.drawString(status.getUser().getName(), x, y * count);
      g.drawString(status.getText(), x, y * count + 10);
      count++;
    }
  }
}
