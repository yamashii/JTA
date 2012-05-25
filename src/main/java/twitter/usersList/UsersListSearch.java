package twitter.usersList;

import twitter.TwitterFunction;
import twitter.personal.PersonalDatas;
import twitter4j.ResponseList;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.UserList;


/**
 * @author yamashita
 * @version $Revision$, 2012/05/02
 */
public class UsersListSearch  implements TwitterFunction{

  Twitter twitter;

  /**
   * Initialize the generated object of {@link UsersListSearch}.
   * 
   * @param twitter
   */
  public UsersListSearch(Twitter twitter) {
    this.twitter = twitter;
  }

  /**
   * 
   */
  public void func() {
    try {
      ResponseList<UserList> resList = this.twitter.getAllUserLists(PersonalDatas.userId);
      showResult(resList);
    } catch (TwitterException e) {
      throw new RuntimeException(e);
    }
  }

  private static void showResult(ResponseList<UserList> resList) {
    System.out.println(resList.size());
  }
}
