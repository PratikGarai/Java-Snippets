import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TravelPlan {

    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        placesToVisit.add("Delhi");
        placesToVisit.add("Mumbai");
        placesToVisit.add("Kolkata");
        placesToVisit.add("Pune");
        placesToVisit.add("Hyderabad");
        placesToVisit.add("Chennai");
        placesToVisit.add("Dehradun");

        printList(placesToVisit);

        placesToVisit.add(1, "Ahmedabad");
        printList(placesToVisit);

        placesToVisit.remove(6);
        printList(placesToVisit);

        addInOrder(placesToVisit, "Faridabad");
        printList(placesToVisit);

        addInOrder(placesToVisit, "Delhi");
        printList(placesToVisit);
    }

    public static void printList(LinkedList<String> list) {
        Iterator<String> iter = list.iterator();
        System.out.println();
        while(iter.hasNext()) {
            System.out.println("Now viting - " + iter.next());
        }

        System.out.println("====================================\n");
    }

    public static boolean addInOrder(LinkedList<String> list, String name) {

        ListIterator<String> iter = list.listIterator();
        while(iter.hasNext()) {
            int comparison = iter.next().compareTo(name);
            if(comparison==0) {
                System.out.println("The city already exists");
                return false;
            } else if(comparison>0) {
                iter.previous();
                iter.add(name);
                return true;
            } else {
                continue;
            }
        }

        iter.add(name);
        return true;
    }
}
