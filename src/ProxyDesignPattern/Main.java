package ProxyDesignPattern;

public class Main {
    public static void main(String[] args) {
        DocSystemProxy proxy = new DocSystemProxy();

        UserSession session = new UserSession();
        session.userId = "ars";
        proxy.sessions.put(session.getUserId(), session);

        Document document = new Document("doc1", "This is the content of document 1.");
        proxy.uploadDocument(document);

        Document downloadedDocument = proxy.downloadDocument("doc1");
        if (downloadedDocument != null) {
            System.out.println("Downloaded document content: " + downloadedDocument.getContent());
        }

        Document updatedDocument = new Document("doc1", "This is the updated content of document 1.");
        proxy.editDocument("doc1", updatedDocument);
    }
}
