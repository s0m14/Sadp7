package ChainOfResponsibilty;

public class NetworkHandler implements Handler{
    private Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(SupportTicket ticket) {
        if (ticket.getType() == SupportTicket.Type.NETWORK) {
            System.out.println("Network support team is handling ticket #" + ticket.getId());
        } else if (nextHandler != null) {
            nextHandler.handleRequest(ticket);
        } else {
            System.out.println("No handler available for ticket #" + ticket.getId());
        }
    }
}
