import java.util.ArrayList;

public class GeoTree {
    private ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getTree() {
        return tree;
    }

     public void append(Person p1, Relationship relationship, Person p2){
        //tree.add(new Node(p1,relationship,p2));

        if (relationship == Relationship.parent){
            tree.add(new Node(p2, Relationship.children, p1));
            tree.add(new Node(p1, Relationship.parent, p2));
        }
        else if (relationship == Relationship.children){
            tree.add(new Node(p2, Relationship.parent, p1));
            tree.add(new Node(p1, Relationship.children, p2));
        }
        else if (relationship == Relationship.partner) {
            tree.add(new Node(p1, Relationship.partner, p2));
            tree.add(new Node(p2, Relationship.partner, p1));
        }
        else if (relationship == Relationship.sibling) {
            tree.add(new Node(p1, Relationship.sibling, p2));
            tree.add(new Node(p2, Relationship.sibling, p1));
        }

         //public void append(Person parent, Person children) {
   //    tree.add(new Node(parent, Relationship.parent, children));
   //    tree.add(new Node(children, Relationship.children, parent));
   //}
   //public  void appendPartner(Person partner1, Person partner2){
   //    tree.add(new Node(partner1, Relationship.partner, partner2));
   //}

   //public  void appendSibling(Person brother, Person sister){
   //    tree.add(new Node(brother, Relationship.sibling, sister));
   //    tree.add(new Node(sister, Relationship.sibling, brother));
    }

}