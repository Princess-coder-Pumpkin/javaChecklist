
public class Test {
    public static void main(String[] args) {
        Checklist checklist = new Checklist();
        Item item2 = new Item("Walk the dog", false, "Take the dog for a walk in the park");
        Item item3 = new Item("Read a book", false, "Finish reading 'The Great Gatsby'");

        checklist.addItem("Buy groceries", false, "Milk, Bread, Eggs");
        checklist.addItem(item2);
        checklist.addItem(item3);

        System.out.println("Checklist items:");
        for (Item item : checklist.getItems()) {
            System.out.println("- " + item.getName() + ": " + item.getDescription() + " (Completed: " + item.isCompleted() + ")");
        }

        // Mark the first item as completed
        item1.setCompleted(true);
        System.out.println("\nAfter completing an item:");
        for (Item item : checklist.getItems()) {
            System.out.println("- " + item.getName() + ": " + item.getDescription() + " (Completed: " + item.isCompleted() + ")");
        }
    }
}
