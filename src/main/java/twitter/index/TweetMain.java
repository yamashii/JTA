package twitter.index;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import twitter.access.TwitterAccessor;
import twitter.tl.friends.FriendsTimeLine;
import twitter.tl.own.MyTweetTimeLineDisplay;
import twitter.tweet.TweetInput;
import twitter.usersList.UsersListSearch;
import twitter4j.Twitter;


/**
 * @author yamashita
 * @version $Revision$, 2012/04/26
 */
public class TweetMain {

  TwitterAccessor accessor;

  /**
   * Initialize the generated object of {@link TweetMain}.
   */
  public TweetMain() {
    this.accessor = new TwitterAccessor();
  }

  /**
   * 
   */
  public void run() {
    Twitter twitter = TwitterAccessor.accessTwitter();
    boolean condition = true;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    while (condition) {
      System.out.println("以下の行いたいことの数字を1つ選んでください"); //$NON-NLS-1$
      System.out.println("1:つぶやく"); //$NON-NLS-1$
      System.out.println("2：自分のつぶやき履歴を見る"); //$NON-NLS-1$
      System.out.println("3：他の人のつぶやきを見る"); //$NON-NLS-1$
      System.out.println("4:ユーザの名前全てを見る");
      System.out.println("9:終了"); //$NON-NLS-1$
      String actNum;
      try {
        actNum = br.readLine();
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
      if (actNum.equals("1")) { //$NON-NLS-1$
        TweetInput input = new TweetInput(twitter);
        input.tweet();
      } else if (actNum.equals("2")) { //$NON-NLS-1$
        MyTweetTimeLineDisplay display = new MyTweetTimeLineDisplay(twitter);
        display.showMyTL();
      }else if(actNum.equals("3")){ //$NON-NLS-1$
        FriendsTimeLine tl = new FriendsTimeLine(twitter);
        tl.displayFriendsTL();
      }
      else if (actNum.equals("4")) { //$NON-NLS-1$
        UsersListSearch listSearch = new UsersListSearch(twitter);
        listSearch.searchUsersList();
      } else if (actNum.equals("9")) { //$NON-NLS-1$
        condition = false;
      } else {
        System.out.println("選びなおしてください。"); //$NON-NLS-1$
      }
      System.out.println();
    }
    System.out.println("システムを終了します。"); //$NON-NLS-1$
  }
}
