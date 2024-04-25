package ProxyDesignPattern;

interface DocumentManagementSystem {
    Document downloadDocument(String documentId);
    void uploadDocument(Document document);
    void editDocument(String documentId, Document document);
}
