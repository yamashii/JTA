package twitter.tl.own;

import twitter.TwitterFunction;
import twitter.personal.PersonalDatas;
import twitter4j.ResponseList;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;


/**
 * @author yamashita
 * @version $Revision$, 2012/05/02
 */
public class MyTweetTimeLineDisplay implements TwitterFunction {

  Twitter twitter;

  /**
   * Initialize the generated object of {@link MyTweetTimeLineDisplay}.
   * 
   * @param twitter
   */
  public MyTweetTimeLineDisplay(Twitter twitter) {
    this.twitter = twitter;
  }

  /**
 * 
 */
  public void func() {
    try {
      ResponseList<Status> userTl = this.twitter.getUserTimeline(PersonalDatas.userId);

      System.out.println("KkmYjのツイート履歴(20件)"); //$NON-NLS-1$
      for (Status tl : userTl) {
        System.out.println(tl.getText());
      }
    } catch (TwitterException e) {
      throw new RuntimeException(e);
    }
  }

}
