package Application;

import javafx.util.Builder;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by C37056 on 26-11-2017.
 */
@Entity
public class Step {
    @Id
    private int STEP_ID;

    private String FK_STEP_NM_TYPE_ID; //Step Name
    private int FK_TT_PROCESS_ID; // journeyID
    private String START_DATETIME;
    private String END_DATETIME;
    private String CREATION_DATETIME;
    private String ROLE_ID; //role of user to perform task, use for resume enabled?
    private String ACTOR;
    private String ACTOR_TYPE;
    private int CHANNEL; // channel
    // Need link...

    public Step(){};

    public int getSTEP_ID() {
        return STEP_ID;
    }

    public void setSTEP_ID(int STEP_ID) {
        this.STEP_ID = STEP_ID;
    }

    public String getFK_STEP_NM_TYPE_ID() {
        return FK_STEP_NM_TYPE_ID;
    }

    public void setFK_STEP_NM_TYPE_ID(String FK_STEP_NM_TYPE_ID) {
        this.FK_STEP_NM_TYPE_ID = FK_STEP_NM_TYPE_ID;
    }

    public int getFK_TT_PROCESS_ID() {
        return FK_TT_PROCESS_ID;
    }

    public void setFK_TT_PROCESS_ID(int FK_TT_PROCESS_ID) {
        this.FK_TT_PROCESS_ID = FK_TT_PROCESS_ID;
    }

    public String getSTART_DATETIME() {
        return START_DATETIME;
    }

    public void setSTART_DATETIME(String START_DATETIME) {
        this.START_DATETIME = START_DATETIME;
    }

    public String getEND_DATETIME() {
        return END_DATETIME;
    }

    public void setEND_DATETIME(String END_DATETIME) {
        this.END_DATETIME = END_DATETIME;
    }

    public String getCREATION_DATETIME() {
        return CREATION_DATETIME;
    }

    public void setCREATION_DATETIME(String CREATION_DATETIME) {
        this.CREATION_DATETIME = CREATION_DATETIME;
    }

    public String getROLE_ID() {
        return ROLE_ID;
    }

    public void setROLE_ID(String ROLE_ID) {
        this.ROLE_ID = ROLE_ID;
    }

    public String getACTOR() {
        return ACTOR;
    }

    public void setACTOR(String ACTOR) {
        this.ACTOR = ACTOR;
    }

    public String getACTOR_TYPE() {
        return ACTOR_TYPE;
    }

    public void setACTOR_TYPE(String ACTOR_TYPE) {
        this.ACTOR_TYPE = ACTOR_TYPE;
    }

    public int getCHANNEL() {
        return CHANNEL;
    }

    public void setCHANNEL(int CHANNEL) {
        this.CHANNEL = CHANNEL;
    }

    private Step(StepBuilder builder){
        this.STEP_ID = builder.STEP_ID;
        this.ACTOR = builder.ACTOR;
        this.ACTOR_TYPE = builder.ACTOR_TYPE;
        this.CHANNEL = builder.CHANNEL;
        this.CREATION_DATETIME = builder.CREATION_DATETIME;
        this.END_DATETIME = builder.END_DATETIME;
        this.FK_STEP_NM_TYPE_ID = builder.FK_STEP_NM_TYPE_ID;
        this.FK_TT_PROCESS_ID = builder.FK_TT_PROCESS_ID;
        this.ROLE_ID = builder.ROLE_ID;
        this.START_DATETIME = builder.START_DATETIME;
    }
    public static final class StepBuilder implements Builder {
        private int STEP_ID;
        private String FK_STEP_NM_TYPE_ID; //Step Name
        private int FK_TT_PROCESS_ID; // journeyID
        private String START_DATETIME;
        private String END_DATETIME;
        private String CREATION_DATETIME;
        private String ROLE_ID; //role of user to perform task, idea to use for resume?
        private String ACTOR;
        private String ACTOR_TYPE;
        private int CHANNEL; // channel

        public static StepBuilder aStep() {
            return new StepBuilder();
        }

        public StepBuilder stepId(int STEP_ID) {
            this.STEP_ID = STEP_ID;
            return this;
        }

        public StepBuilder stepName(String FK_STEP_NM_TYPE_ID) {
            this.FK_STEP_NM_TYPE_ID = FK_STEP_NM_TYPE_ID;
            return this;
        }

        public StepBuilder journeyId(int FK_TT_PROCESS_ID) {
            this.FK_TT_PROCESS_ID = FK_TT_PROCESS_ID;
            return this;
        }

        public StepBuilder startDate(String START_DATETIME) {
            this.START_DATETIME = START_DATETIME;
            return this;
        }

        public StepBuilder endDate(String END_DATETIME) {
            this.END_DATETIME = END_DATETIME;
            return this;
        }

        public StepBuilder creationDate(String CREATION_DATETIME) {
            this.CREATION_DATETIME = CREATION_DATETIME;
            return this;
        }

        public StepBuilder roleId(String ROLE_ID) {
            this.ROLE_ID = ROLE_ID;
            return this;
        }

        public StepBuilder actor(String ACTOR) {
            this.ACTOR = ACTOR;
            return this;
        }

        public StepBuilder actorType(String ACTOR_TYPE) {
            this.ACTOR_TYPE = ACTOR_TYPE;
            return this;
        }

        public StepBuilder channel(int CHANNEL) {
            this.CHANNEL = CHANNEL;
            return this;
        }
        @Override
        public Step build() {
            return new Step(this);

        }
    }
}
