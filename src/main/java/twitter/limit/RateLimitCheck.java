package twitter.limit;

import twitter.TwitterFunction;
import twitter4j.RateLimitStatus;
import twitter4j.ResponseList;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;


/**
 * @author yamashita
 * @version $Revision$, 2012/05/25
 */
public class RateLimitCheck implements TwitterFunction {

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
   * @see twitter.TwitterFunction#func()
   */
  public void func() {
    int hourlyLimit = 0;
    int rateLimit = 0;
    int resetTimeInSec = 0;
    int secUntilReset = 0;

    try {
      ResponseList<Status> twitterStatuses = this.twitter.getPublicTimeline();
      RateLimitStatus limitStatus = twitterStatuses.getRateLimitStatus();
      hourlyLimit = limitStatus.getHourlyLimit();
      rateLimit = limitStatus.getRemainingHits();
      resetTimeInSec = limitStatus.getResetTimeInSeconds();
      secUntilReset = limitStatus.getSecondsUntilReset();
    } catch (TwitterException e) {
      throw new RuntimeException(e);
    }

    System.out.println("現在のアクセス最大回数:" + hourlyLimit + "回"); //$NON-NLS-1$//$NON-NLS-2$
    System.out.println("残りアクセス回数：" + rateLimit + "回"); //$NON-NLS-1$ //$NON-NLS-2$
    System.out.println("リセットされる時間：" + resetTimeInSec + ""); //$NON-NLS-1$ //$NON-NLS-2$
    System.out.println("リセットされるまでの時間：：" + secUntilReset + "秒"); //$NON-NLS-1$ //$NON-NLS-2$
  }
}
