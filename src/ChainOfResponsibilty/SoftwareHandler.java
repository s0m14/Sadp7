package ChainOfResponsibilty;

public class SoftwareHandler implements Handler {
    private Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(SupportTicket ticket) {
        if (ticket.getType() == SupportTicket.Type.SOFTWARE) {
            System.out.println("Software support team is handling ticket #" + ticket.getId());
        } else if (nextHandler != null) {
            nextHandler.handleRequest(ticket);
        } else {
            System.out.println("No handler available for ticket #" + ticket.getId());
        }
    }
}
