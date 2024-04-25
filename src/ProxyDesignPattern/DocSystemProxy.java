package ProxyDesignPattern;

import java.util.HashMap;

public class DocSystemProxy implements DocumentManagementSystem{
    private ConcreteDocumentManagementSystem realSystem;
    HashMap<String, UserSession> sessions;

    public DocSystemProxy() {
        realSystem = new ConcreteDocumentManagementSystem();
        sessions = new HashMap<>();
    }

    @Override
    public Document downloadDocument(String documentId) {
        UserSession session = sessions.get("ars");
        if (session != null) {
            return realSystem.downloadDocument(documentId);
        } else {
            System.out.println("User not authenticated.");
            return null;
        }
    }

    @Override
    public void uploadDocument(Document document) {
        UserSession session = sessions.get("ars");
        if (session != null) {
            realSystem.uploadDocument(document);
        } else {
            System.out.println("User not authenticated.");
        }
    }

    @Override
    public void editDocument(String documentId, Document document) {
        UserSession session = sessions.get("ars");
        if (session != null) {
            realSystem.editDocument(documentId, document);
        } else {
            System.out.println("User not authenticated.");
        }
    }
}
