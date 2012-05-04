package twitter.usersList;

import javax.management.RuntimeErrorException;

import twitter.personal.PersonalDatas;
import twitter4j.ResponseList;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.UserList;


/**
 * @author yamashita
 * @version $Revision$, 2012/05/02
 */
public class UsersListSearch {

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
  public void searchUsersList() {
    try {
      ResponseList<UserList> resList = this.twitter.getAllUserLists(PersonalDatas.userId);
      System.out.println(resList.size());
      //for (UserList list : resList) {
//        System.out.println(list.getFullName());
  //    }
    } catch (TwitterException e) {
      throw new RuntimeException(e);
    }
  }
}
