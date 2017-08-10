package Template_Method;

import java.util.Date;

class ImportantMessagesSearcher extends MessagesSearcher {
    public ImportantMessagesSearcher(String dateSent, String personName) {
        super(dateSent, personName, 3);
    }

    @Override
    protected void CreateImportanceCriteria() {
        System.out.println("Special importance criteria has been formed : IMPORTANT!");
    }
}
