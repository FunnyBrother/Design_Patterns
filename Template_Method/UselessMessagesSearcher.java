package Template_Method;

import java.util.Date;

public class UselessMessagesSearcher extends MessagesSearcher {
    public UselessMessagesSearcher(String dateSent, String personName) {
        super(dateSent, personName, 1);
    }

    @Override
    protected void CreateImportanceCriteria() {
        System.out.println("Special importance criteria has been formed : USELESS");
    }
}
