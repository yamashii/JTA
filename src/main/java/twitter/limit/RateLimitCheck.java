package twitter.limit;

import twitter4j.RateLimitStatus;
import twitter4j.ResponseList;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;


/**
 * @author yamashita
 * @version $Revision$, 2012/05/25
 */
public class RateLimitCheck {

  private Twitter twitter;

  /**
   * Initialize the generated object of {@link RateLimitCheck}.
   * 
   * @param twitter
   */
  public RateLimitCheck(Twitter twitter) {
    this.twitter = twitter;
  }

  /**
   * 
   */
  public void checkAccessLimit() {
    ResponseList<Status> twitterStatuses = null;
    try {
      twitterStatuses = this.twitter.getPublicTimeline();
    } catch (TwitterException e) {
      throw new RuntimeException(e);
    }
    RateLimitStatus limitStatus = twitterStatuses.getRateLimitStatus();
    int hourlyLimit = limitStatus.getHourlyLimit();
    int rateLimit = limitStatus.getRemainingHits();
    int resetTimeInSec = limitStatus.getResetTimeInSeconds();
    int secUntilReset = limitStatus.getSecondsUntilReset();
    System.out.println("現在のアクセス最大回数:" + hourlyLimit + "回"); //$NON-NLS-1$//$NON-NLS-2$
    System.out.println("残りアクセス回数：" + rateLimit + "回"); //$NON-NLS-1$ //$NON-NLS-2$
    System.out.println("リセットされる時間：" + resetTimeInSec + ""); //$NON-NLS-1$ //$NON-NLS-2$
    System.out.println("リセットされるまでの時間：：" + secUntilReset + "秒"); //$NON-NLS-1$ //$NON-NLS-2$
  }
}
