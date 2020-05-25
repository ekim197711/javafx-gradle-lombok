package spaceshipapplication.sidepanel;

import javafx.event.Event;
import javafx.event.EventTarget;
import javafx.event.EventType;

public class SwapToCreateSceneEvent extends Event {
    public SwapToCreateSceneEvent(EventType<? extends Event> eventType) {
        super(eventType);
    }

    public SwapToCreateSceneEvent(Object source, EventTarget target, EventType<? extends Event> eventType) {
        super(source, target, eventType);
    }
}
