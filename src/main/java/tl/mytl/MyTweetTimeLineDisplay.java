package tl.mytl;

import personal.PersonalDatas;
import twitter4j.ResponseList;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;


/**
 * @author yamashita
 * @version $Revision$, 2012/05/02
 */
public class MyTweetTimeLineDisplay {

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
  public void showMyTL() {
    ResponseList<Status> userTl;
    try {
      userTl = this.twitter.getUserTimeline(PersonalDatas.userId);
    } catch (TwitterException e) {
      throw new RuntimeException(e);
    }
    System.out.println("KkmYjのツイート履歴(20件)"); //$NON-NLS-1$
    for (Status tl : userTl) {
      System.out.println(tl.getText());
    }

  }

}
