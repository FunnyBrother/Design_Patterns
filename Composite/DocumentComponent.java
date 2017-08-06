package Composite;

import java.util.*;

class DocumentComponent implements IDocumentComponent {
    public String name;
    public List<IDocumentComponent> documentComponents;
    public DocumentComponent(String name) {
        this.name = name;
        documentComponents = new ArrayList<>();
    }

    public String GatherData() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<" + name + ">");

        for(IDocumentComponent mDocumentComponents : documentComponents) {
            mDocumentComponents.GatherData();
            stringBuilder.append(mDocumentComponents.GatherData());
        }

        stringBuilder.append("<" + name + ">");
        return stringBuilder.toString();
    }

    public void AddComponent(IDocumentComponent iDocumentComponent) {
        documentComponents.add(iDocumentComponent);
    }
}
