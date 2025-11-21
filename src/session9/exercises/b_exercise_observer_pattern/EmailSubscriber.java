package session9.exercises.b_exercise_observer_pattern;

import session9.exercises.b_exercise_observer_pattern.subscribers_api.EmailService;

public class EmailSubscriber implements Subscriber {
    private final String emailAddress;
    private final EmailService emailService;

    public EmailSubscriber(String emailAddress) {
        this.emailAddress = emailAddress;
        this.emailService = new EmailService();
    }

    @Override
    public void update(String news) {
        emailService.sendEmail(emailAddress, news);
    }
}
