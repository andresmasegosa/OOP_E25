package feedback;

import io.github.stepio.jgforms.question.MetaData;

public enum FeedbackForm implements MetaData {

    EXERCISE_ID(23864389),
    FINISHED(2086556437),
    UNDERSTOOD(1612603630),
    COMMENT(767020216);

    private long id;

    FeedbackForm(long id) {
        this.id = id;
    }

    @Override
    public long getId() {
        return this.id;
    }
}