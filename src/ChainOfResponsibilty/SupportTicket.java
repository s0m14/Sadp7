package ChainOfResponsibilty;

public class SupportTicket {
    enum Type {
        HARDWARE, SOFTWARE, NETWORK
    }

    private int id;
    private String description;
    private Type type;

    public SupportTicket(int id, String description, Type type) {
        this.id = id;
        this.description = description;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public Type getType() {
        return type;
    }
}
