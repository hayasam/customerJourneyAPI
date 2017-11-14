package draft;

import javafx.util.Builder;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CustomerJourneyCommand {

    private String customerJourneyId;
    private String processType;
    private String partyId;
    private String startDate;
    private Step step;
    private String productId;
    private String contractNumber;
    private String status;

    public CustomerJourneyCommand(){}
    private CustomerJourneyCommand(JourneyCommandBuilder builder){
        super();
        this.customerJourneyId = builder.customerJourneyId;
        this.processType = builder.processType;
        this.partyId = builder.partyId;
        this.startDate = builder.startDate;
        this.productId = builder.productId;
        this.contractNumber = builder.productId;
        this.step = builder.step;
    }

    public String getCustomerJourneyId() {
        return customerJourneyId;
    }

    public String getProcessType() {
        return processType;
    }

    public String getStartDate() {
        return startDate;
    }

    public Step getStep() {
        return step;
    }

    public String getProductId() {
        return productId;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public String getPartyId() {
        return partyId;
    }

    public String getStatus() {
        return status;
    }

    public String toString(){
        ObjectMapper mapper = new ObjectMapper();
        String jsonInString="default";
        try{
            jsonInString = mapper.writeValueAsString(this);

        }
        catch (Exception e){
            System.out.println(e);
        }
        return jsonInString;
    }

    public static class JourneyCommandBuilder implements Builder {
        private String customerJourneyId;
        private String processType;
        private String partyId;
        private String startDate;
        private String productId;
        private String contractNumber;
        private Step step;
        private String status;

        public JourneyCommandBuilder processType (String processType){
            this.processType = processType;
            return this;
        }
        public JourneyCommandBuilder customerJourneyId (String customerJourneyId){
            this.customerJourneyId = customerJourneyId;
            return this;
        }
        public JourneyCommandBuilder partyId (String partyId){
            this.partyId = partyId;
            return this;
        }
        public JourneyCommandBuilder startDate (String startDate){
            this.startDate = startDate;
            return this;
        }

        public JourneyCommandBuilder productId (String productId){
            this.productId = productId;
            return this;
        }
        public JourneyCommandBuilder contractNumber(String contractNumber){
            this.contractNumber = contractNumber;
            return this;
        }
        public JourneyCommandBuilder status(String status){
            this.status = status;
            return this;
        }
        public JourneyCommandBuilder step(Step step){
            this.step = new Step.StepBuilder()
                    .stepName(step.getStepName())
                    .channel(step.getChannel())
                    .link(step.getLink())
                    .startDate(step.getStartDate())
                    .build();
            return this;
        }
        @Override
        public CustomerJourneyCommand build() {
            return new CustomerJourneyCommand(this);
        }
    }
}
