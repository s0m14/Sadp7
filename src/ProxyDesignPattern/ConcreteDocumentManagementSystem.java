package ProxyDesignPattern;

import java.util.HashMap;

public class ConcreteDocumentManagementSystem implements DocumentManagementSystem{
    private HashMap<String, Document> documentStorage;

    public ConcreteDocumentManagementSystem() {
        documentStorage = new HashMap<>();
    }

    @Override
    public Document downloadDocument(String documentId) {
        return documentStorage.get(documentId);
    }

    @Override
    public void uploadDocument(Document document) {
        documentStorage.put(document.getId(), document);
    }

    @Override
    public void editDocument(String documentId, Document document) {
        if (documentStorage.containsKey(documentId)) {
            documentStorage.put(documentId, document);
        } else {
            System.out.println("Document does not exist for editing.");
        }
    }
}
