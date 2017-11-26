package Application;

public class Phase {
    private String stepId;
    private String stepName;
    private String channel;
    private String startDate;
    private String link;

    public Phase(){}

    public void setStepId(String stepId) {
        this.stepId = stepId;
    }

    public void setStepName(String stepName) {
        this.stepName = stepName;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setLink(String link) {
        this.link = link;
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

}
