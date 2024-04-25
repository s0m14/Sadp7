package ChainOfResponsibilty;

public class Main {
    public static void main(String[] args) {
        HardwareHandler hardwareHandler = new HardwareHandler();
        SoftwareHandler softwareHandler = new SoftwareHandler();
        NetworkHandler networkHandler = new NetworkHandler();

        hardwareHandler.setNextHandler(softwareHandler);
        softwareHandler.setNextHandler(networkHandler);

        SupportTicket ticket1 = new SupportTicket(1, "Hardware issue", SupportTicket.Type.HARDWARE);
        SupportTicket ticket2 = new SupportTicket(2, "Software issue", SupportTicket.Type.SOFTWARE);
        SupportTicket ticket3 = new SupportTicket(3, "Network issue", SupportTicket.Type.NETWORK);

        hardwareHandler.handleRequest(ticket1);
        softwareHandler.handleRequest(ticket2);
        networkHandler.handleRequest(ticket3);

        testHardware(hardwareHandler, ticket1);
        testSoftware(softwareHandler, ticket2);
        testNetwork(networkHandler, ticket3);
    }

    private static void testHardware(HardwareHandler handler, SupportTicket ticket) {
        System.out.println("Running test case for hardware issue:");
        handler.handleRequest(ticket);
        System.out.println();
    }

    private static void testSoftware(SoftwareHandler handler, SupportTicket ticket) {
        System.out.println("Running test case for software issue:");
        handler.handleRequest(ticket);
        System.out.println();
    }

    private static void testNetwork(NetworkHandler handler, SupportTicket ticket) {
        System.out.println("Running test case for network issue:");
        handler.handleRequest(ticket);
        System.out.println();
    }
}