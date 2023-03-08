import java.util.ArrayList;

public class GeoTree {
    private ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getTree() {
        return tree;
    }

    public void append(Person parent, Person children) {
        tree.add(new Node(parent, Relationship.parent, children));
        tree.add(new Node(children, Relationship.children, parent));
    }
    public  void appendPartner(Person partner1, Person partner2){
        tree.add(new Node(partner1, Relationship.partner, partner2));
    }

    public  void appendSibling(Person brother, Person sister){
        tree.add(new Node(brother, Relationship.sibling, sister));
        tree.add(new Node(sister, Relationship.sibling, brother));
    }

}
