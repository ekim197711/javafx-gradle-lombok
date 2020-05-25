package spaceshipapplication;

import javafx.event.Event;
import javafx.event.EventTarget;
import javafx.event.EventType;

public class CustomEvent extends Event {
    public CustomEvent(EventType<? extends Event> eventType) {
        super(eventType);
    }

    public CustomEvent(Object source, EventTarget target, EventType<? extends Event> eventType) {
        super(source, target, eventType);
    }
    public static final EventType<CustomEvent> SWAP_TO_CREATE = new EventType<CustomEvent>("SWAP_TO_CREATE");
    public static final EventType<CustomEvent> SWAP_TO_OVERVIEW = new EventType<CustomEvent>("SWAP_TO_OVERVIEW");
}
