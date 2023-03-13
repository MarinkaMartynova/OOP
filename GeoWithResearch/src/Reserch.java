import java.util.ArrayList;

public class Reserch {

    ArrayList<String> result = new ArrayList<>();
    ArrayList<Node> tree;

    public Reserch(GeoTree geoTree) {
        tree = geoTree.getTree();
    }

    public ArrayList<String> spend(Person person1, Relationship re) {
        for (Node person : tree) {
            if (person.p1.fullName == person1.fullName && person.re == re) {
                result.add(person.p2.getName());
            }
        }
        return result;
    }

}