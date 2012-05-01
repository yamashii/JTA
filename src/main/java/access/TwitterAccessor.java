package access;

import personal.PersonalDatas;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;


/**
 * @author yamashita
 * @version $Revision$, 2012/05/02
 */
public class TwitterAccessor {

  String consumerKey;
  String consumerSecret;
  String tokenSecretString;
  String accessTokenString;

  /**
   * Initialize the generated object of {@link TwitterAccessor}.
   */
  public TwitterAccessor() {
    this.consumerKey = "BiNYNeyg8wQIbRRF9Vvfw"; //$NON-NLS-1$
    this.consumerSecret = "IdZNlp1tyQcXm2ROd8cBIKUJji0f6tiwswogM4BYQ"; //$NON-NLS-1$
    this.tokenSecretString = "dZnr1GH7VDOXvOaXUIXpt6gvQcziIc3EqnXwS4uBlc"; //$NON-NLS-1$
    this.accessTokenString = "169100124-HwUFjn4gZMJ5kLft6w07V01hzCCCRu2o1LlYmveK"; //$NON-NLS-1$
  }

  /**
   * @return アクセスしたあとのtwitterインスタンス
   * 
   */
  public static Twitter accessTwitter() {
    Twitter twitter = new TwitterFactory().getInstance();
    twitter.setOAuthConsumer(PersonalDatas.consumerKey, PersonalDatas.consumerSecret);
    AccessToken accessToken = new AccessToken(PersonalDatas.accessTokenString, PersonalDatas.tokenSecretString);
    twitter.setOAuthAccessToken(accessToken);
    return twitter;
  }
}
