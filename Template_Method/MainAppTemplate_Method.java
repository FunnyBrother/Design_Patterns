package Template_Method;

import java.util.Date;

public class MainAppTemplate_Method {
    public static void main(String[] args) {
        MessagesSearcher searcher = new UselessMessagesSearcher(new Date().toString(), "Sally");
        searcher.Search();

        searcher = new ImportantMessagesSearcher(new Date().toString(), "Killer");
        searcher.Search();
    }
}
