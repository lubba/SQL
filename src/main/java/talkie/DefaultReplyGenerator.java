package talkie;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Generates reply based on random selection from the initial list of replies
 *
 * @author Anna Khasanova
 */
public class DefaultReplyGenerator implements ReplyGenerator {
    
    private List<String> answers = new ArrayList<String>();
    
    public DefaultReplyGenerator() {
    	try {
    		DataBaseWorker.init();
            answers = DataBaseWorker.getAnswers();
         //   System.out.println("We in defRepl");
          //  System.out.println(answers);
        } catch (SQLException e) {
            e.printStackTrace();
        }
     }

    
    @Override
    public String generate() {
        Random random = new Random();
        System.out.println(answers);
        int selected = random.nextInt(answers.size());
        return answers.get(selected);
    }
}
