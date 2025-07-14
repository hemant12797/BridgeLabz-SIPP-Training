class BrowserHistory {
    private static class Node {
        String url;
        Node prev, next;

        Node(String url) {
            this.url = url;
        }
    }

    private Node current;

    public void visit(String url) {
        Node node = new Node(url);
        if (current != null) {
            current.next = null;
            node.prev = current;
        }
        current = node;
    }

    public boolean back() {
        if (current != null && current.prev != null) {
            current = current.prev;
            return true;
        }
        return false;
    }

    public boolean forward() {
        if (current != null && current.next != null) {
            current = current.next;
            return true;
        }
        return false;
    }

    public String getCurrentPage() {
        return current != null ? current.url : null;
    }
}

class MusicPlayerHistory extends BrowserHistory {
}

public class Main {
    public static void main(String[] args) {
        BrowserHistory history = new BrowserHistory();
        history.visit("google.com");
        history.visit("openai.com");
        history.visit("github.com");
        System.out.println(history.getCurrentPage());
        history.back();
        System.out.println(history.getCurrentPage());
        history.forward();
        System.out.println(history.getCurrentPage());
    }
}
