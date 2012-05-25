package twitter.friends;

import twitter.TwitterFunction;
import twitter4j.IDs;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.User;


/**
 * @author yamashita
 * @version $Revision$, 2012/05/25
 */
public class FollowedFriendsStatus implements TwitterFunction {

  private Twitter twitter;

  /**
   * Initialize the generated object of {@link FollowedFriendsStatus}.
   * 
   * @param twitter
   */
  public FollowedFriendsStatus(Twitter twitter) {
    this.twitter = twitter;
  }

  /**
   * 
   */
  public void func() {
    try {
      IDs follower = this.twitter.getFollowersIDs(this.twitter.getScreenName(), -1);
      long[] id = follower.getIDs();
      System.out.println("処理中です。しばらくお待ちください。"); //$NON-NLS-1$
      for (int i = 0; i < id.length; i++) {
        User user = this.twitter.showUser(id[i]);
        showResult(user);
      }
    } catch (IllegalStateException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (TwitterException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  private static void showResult(User user) {
    System.out.println(user.getName());
  }
}
