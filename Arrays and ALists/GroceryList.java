import java.util.ArrayList;

public class GroceryList {
    
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addItem(String s) {
        groceryList.add(s);
        System.out.println(s+ " added to the grocery list");
    }

    public void removeItem(int position) {
        String s = groceryList.get(position);
        groceryList.remove(position);
        System.out.println(s + " removed from list");
    }

    public void printList() {
        System.out.println("Items : ");
        for(int i=0; i<groceryList.size(); i++) {
            System.out.println((i+1) + ". "+ groceryList.get(i));
        }
    }

    public static void main(String[] args) {
        GroceryList ob = new GroceryList();
        ob.addItem("Banana");
        ob.addItem("Milk");
        ob.addItem("Juice");
        ob.printList();
        ob.removeItem(1);
        ob.printList();
    }
}
