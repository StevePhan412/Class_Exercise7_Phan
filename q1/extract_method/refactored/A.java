package q1.extract_method.refactored;

import java.util.List;

public class A {
    Node m1(List<Node> nodes, String p) {
        extractedMethod(nodes, p);
        // other implementation
        return null;
    }

    Edge m2(List<Edge> edgeList, String p) {
        extractedMethod(edgeList, p);
        // other implementation
        return null;
    }

    <T> void extractedMethod(List<T> list, String p) {
        for (T item : list) {
            if (item instanceof Node) {
                Node node = (Node) item;
                if (node.contains(p)) {
                    System.out.println(node);
                }
            } else if (item instanceof Edge) {
                Edge edge = (Edge) item;
                if (edge.contains(p)) {
                    System.out.println(edge);
                }
            }
        }
    }
}

class Node {
    String name;

    public boolean contains(String p) {
        return name.contains(p);
    }

    @Override
    public String toString() {
        return "Node{" + "name='" + name + '\'' + '}';
    }
}

class Edge {
    String name;

    public boolean contains(String p) {
        return name.contains(p);
    }

    @Override
    public String toString() {
        return "Edge{" + "name='" + name + '\'' + '}';
    }
}
