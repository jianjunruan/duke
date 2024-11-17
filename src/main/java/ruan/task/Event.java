package ruan.task;

public class Event extends Task {
    private String from;
    private String to;

    public Event(String description, String from, String to) {
        super(description);
        this.from = from;
        this.to = to;
    }

    @Override
    public String toFileFormat() {
        return "E | " + (isDone ? "1" : "0") + " | " + description + " /from " + from + " /to " + to;
    }

    @Override
    public String toString() {
        //return formatted task string
        return "[E]" + super.toString() + " (from: " + from + " to: " + to + ")";
    }
}