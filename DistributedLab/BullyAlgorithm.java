import java.util.ArrayList;
import java.util.List;

class Node {
    private int id;
    private boolean isCoordinator;
    private boolean isAlive;
    private List<Node> network;

    public Node(int id, List<Node> network) {
        this.id = id;
        this.network = network;
        this.isCoordinator = false;
        this.isAlive = true;
    }

    public int getId() {
        return id;
    }

    public boolean isCoordinator() {
        return isCoordinator;
    }

    public void setCoordinator(boolean isCoordinator) {
        this.isCoordinator = isCoordinator;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    public void startElection() {
        System.out.println("Node " + id + " started an election.");
        boolean electionWon = true;

        for (Node node : network) {
            if (node.getId() > this.id && node.isAlive()) {
                System.out.println("Node " + id + " sends election message to Node " + node.getId());
                node.startElection();
                electionWon = false;
            }
        }

        if (electionWon) {
            declareAsCoordinator();
        }
    }

    public void declareAsCoordinator() {
        this.isCoordinator = true;
        System.out.println("Node " + id + " is the new coordinator.");
        for (Node node : network) {
            if (node.getId() < this.id && node.isAlive()) {
                System.out.println("Node " + id + " informs Node " + node.getId() + " of new coordinator.");
                node.setCoordinator(false);
            }
        }
    }
}

public class BullyAlgorithm {
    public static void main(String[] args) {
        List<Node> network = new ArrayList<>();
        Node node1 = new Node(1, network);
        Node node2 = new Node(2, network);
        Node node3 = new Node(3, network);
        Node node4 = new Node(4, network);
        Node node5 = new Node(5, network);

        network.add(node1);
        network.add(node2);
        network.add(node3);
        network.add(node4);
        network.add(node5);

        // Initially, let's assume all nodes are alive and node 3 is the coordinator
        node3.setCoordinator(true);

        // Simulate a coordinator failure
        node3.setAlive(false);
        System.out.println("Node 3 (current coordinator) failed.");

        // Start election from a non-coordinator node
        node2.startElection();
    }
}
