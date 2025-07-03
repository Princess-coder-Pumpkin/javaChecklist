public class Item {
    private String name;
    private boolean completed;
    private String description;

    public Item(String name, boolean completed, String description) {
        this.name = name;
        this.completed = completed;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public boolean isCompleted() {
        return completed;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
