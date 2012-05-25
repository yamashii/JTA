package twitter.tl.friends;

import twitter.TwitterFunction;
import twitter4j.ResponseList;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;


/**
 * @author yamashita
 * @version $Revision$, 2012/05/02
 */
public class FriendsTimeLine implements TwitterFunction {

  Twitter twitter;

  /**
   * Initialize the generated object of {@link FriendsTimeLine}.
   * 
   * @param twitter
   */
  public FriendsTimeLine(Twitter twitter) {
    this.twitter = twitter;
  }

  /**
   * 
   */
  public void func() {
    try {
      ResponseList<Status> resList = this.twitter.getHomeTimeline();
      for (Status status : resList) {
        System.out.println(status.getUser().getName());
        System.out.println(status.getText());
        System.out.println();
      }
    } catch (TwitterException e) {
      throw new RuntimeException(e);
    }
  }
}
