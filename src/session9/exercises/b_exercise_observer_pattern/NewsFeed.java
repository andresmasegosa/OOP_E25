package session9.exercises.b_exercise_observer_pattern;

import java.util.ArrayList;
import java.util.List;

public class NewsFeed {

    private final List<Subscriber> subscribers;

    public NewsFeed() {
        subscribers = new ArrayList<>();
    }

    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void notifySubscribers(String news) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(news);
        }
    }
}
