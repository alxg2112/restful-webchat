package entities;

/**
 * Class that represents chat user message.
 */
public class Message {

    /** Id of user who sent the message. */
    private String from;

    /** Message content. */
    private String text;

    public String getFrom() {
        return from;
    }

    public String getText() {
        return text;
    }

    /** Constructor. */
    public Message(String from, String text) {
        this.from = from;
        this.text = text;
    }
}
