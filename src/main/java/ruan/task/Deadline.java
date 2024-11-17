package ruan.task;

public class Deadline extends Task {
    private String by;

    public Deadline(String description, String by) {
        super(description);
        this.by = by;
    }

    @Override
    public String toFileFormat() {
        return "D | " + (isDone ? "1" : "0") + " | " + description + " /by " + by;
    }

    @Override
    public String toString() {
        //return formatted task string
        return "[D]" + super.toString() + " (by: " + by + ")";
    }
}