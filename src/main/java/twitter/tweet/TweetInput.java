package twitter.tweet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;


/**
 * @author yamashita
 * @version $Revision$, 2012/05/02
 */
public class TweetInput {

  Twitter twitter;

  /**
   * Initialize the generated object of {@link TweetInput}.
   * 
   * @param twitter
   */
  public TweetInput(Twitter twitter) {
    this.twitter = twitter;
  }

  public void tweet() {
    System.out.println("ツイートを↓にどうぞ～"); //$NON-NLS-1$
    String tweet = keyInput();
    try {
      Status status = this.twitter.updateStatus(tweet);
      System.out.println("Successfully updated the status to :" + status.getText()); //$NON-NLS-1$
    } catch (TwitterException e) {
      throw new RuntimeException(e);
    }

  }

  /**
   * @return
   */
  public static String keyInput() {
    BufferedReader br;
    try {
      br = new BufferedReader(new InputStreamReader(System.in, "utf-8")); //$NON-NLS-1$
      return br.readLine();
    } catch (IOException e) {
      throw new RuntimeException(e);
    }

  }
}
