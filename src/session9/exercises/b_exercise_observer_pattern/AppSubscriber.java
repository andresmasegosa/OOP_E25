package session9.exercises.b_exercise_observer_pattern;

import session9.exercises.b_exercise_observer_pattern.subscribers_api.PhoneNotificationsService;

public class AppSubscriber implements Subscriber {
    private final int phoneId;
    private final PhoneNotificationsService phoneNotificationsService;

    public AppSubscriber(int phoneId) {
        this.phoneId = phoneId;
        this.phoneNotificationsService = new PhoneNotificationsService();
    }

    @Override
    public void update(String news) {
        phoneNotificationsService.notifyPhone(phoneId, news);
    }
}
