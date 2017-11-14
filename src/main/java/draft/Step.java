package draft;

import javafx.util.Builder;

public class Step {
    private String stepId;
    private String stepName;
    private String channel;
    private String startDate;
    private String link;

    public Step(){}

    private Step(StepBuilder builder){
        super();
        this.stepId= builder.stepId;
        this.stepName = builder.stepName;
        this.channel = builder.channel;
        this.startDate = builder.startDate;
        this.link = builder.link;
    }

    public String getStepName() {
        return stepName;
    }

    public String getChannel() {
        return channel;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getLink() {
        return link;
    }

    public String getStepId() {
        return stepId;
    }

    public static class StepBuilder implements Builder{
        private String stepId;
        private String stepName;
        private String channel;
        private String startDate;
        private String link;

        public StepBuilder stepId(String stepId){
            this.stepId=stepId;
            return this;
        }
        public StepBuilder stepName(String stepName){
            this.stepName = stepName;
            return this;
        }
                public StepBuilder channel(String Channel) {
            this.channel = channel;
            return this;
        }
        public StepBuilder startDate(String startDate){
            this.startDate=startDate;
            return this;
        }
        public StepBuilder link(String link){
            this.link=link;
            return this;
        }
        @Override
        public Step build() {
            return new Step(this);
        }
    }
}
