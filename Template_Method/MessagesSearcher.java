package Template_Method;

import java.util.Date;

class MessagesSearcher {
    protected String dataSent;
    protected String personName;
    protected int importanceLevel;

    public MessagesSearcher(String dataSent, String personName, int importanceLevel) {
        this.dataSent = dataSent;
        this.importanceLevel = importanceLevel;
        this.personName = personName;
    }

    protected void CreateDataCriteria() {
        System.out.println("Standard data criteria has been applied");
    }

    protected void CreateSentPersonCriteria() {
        System.out.println("Standard person criteria has been applied");
    }

    protected void CreateImportanceCriteria() {
        System.out.println("Standard importance criteria has been applied");
    }

    // template method
    public String Search() {
        CreateDataCriteria();
        CreateSentPersonCriteria();

        System.out.println("Template method does some verification accordingly to search algo.");
        CreateImportanceCriteria();

        System.out.println("Template method verifies if message could be so important or useless from person " +
                "provided in criteria.");

        return "Some list of messages...";
    }
}
