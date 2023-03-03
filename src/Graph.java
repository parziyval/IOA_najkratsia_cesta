import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Graph {
    private Node[] nodes;

    public Graph() throws FileNotFoundException {
        int numberOfNodes = 0;
        File nodesFile = new File("SietSr/SR nodes.vec");
        Scanner scanner = new Scanner(nodesFile);
        while (scanner.hasNextLine()) {
            numberOfNodes++;
        }
        this.nodes = new Node[numberOfNodes];
    }

    public void loadGraph() throws FileNotFoundException {
        File nodesFile = new File("SietSr/SR_nodes.vec");

        Scanner scanner = new Scanner(nodesFile);
        int i = 0;
        while (scanner.hasNextLine()) {
            int id = scanner.nextInt();
            scanner.nextInt();
            float x = scanner.nextFloat();
            float y = scanner.nextFloat();
            nodes[i].setId(id);
            nodes[i].setX(x);
            nodes[i].setY(y);
        }

    }
}
