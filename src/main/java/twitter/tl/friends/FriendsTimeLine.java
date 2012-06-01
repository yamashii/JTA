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
  private ResponseList<Status> resList;

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
      this.resList = this.twitter.getHomeTimeline();
      for (Status status : this.resList) {
        showResult(status);
      }
    } catch (TwitterException e) {
      throw new RuntimeException(e);
    }
  }

  private static void showResult(Status status) {
    System.out.println(status.getUser().getName());
    System.out.println(status.getText());
    System.out.println();
  }

  /**
   * @return
   */
  public ResponseList<Status> getResList() {
    return this.resList;
  }

}
