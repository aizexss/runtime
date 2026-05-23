package fourteen_collections.tasks.task5;

import java.util.LinkedList;

public class Client {
    String name;
    boolean vip;

    LinkedList<Client> queueForClients;

    public void addToQueue(Client client) {
        if (!client.vip) {
            queueForClients.addLast(client);
        } else {
            queueForClients.addFirst(client);
        }
    }

    public void updateQueue() {
        if (queueForClients.size() > 10) {
            Client client = queueForClients.remove(10);
            queueForClients.add(5, client);
        }
    }

    public Client serveQueueFirst() {
        return queueForClients.removeFirst();
    }
}
