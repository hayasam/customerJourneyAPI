package draft;

import javafx.util.Builder;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CustomerJourney {

    private String customerJourneyId;
    private String processType;
    private String partyId;
    private String startDate;
    private Step step;
    private String productId;
    private String contractNumber;

    public CustomerJourney(){}
    private CustomerJourney(JourneyBuilder builder){
        super();
        this.customerJourneyId = builder.customerJourneyId;
        this.processType = builder.processType;
        this.partyId = builder.partyId;
        this.startDate = builder.startDate;
        this.productId = builder.productId;
        this.contractNumber = builder.productId;
        this.step = new Step.StepBuilder().build(); //todo
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

    public static class JourneyBuilder implements Builder {
        private String customerJourneyId;
        private String processType;
        private String partyId;
        private String startDate;
        private String productId;
        private String contractNumber;

        public JourneyBuilder processType (String processType){
            this.processType = processType;
            return this;
        }
        public JourneyBuilder customerJourneyId (String customerJourneyId){
            this.customerJourneyId = customerJourneyId;
            return this;
        }
        public JourneyBuilder partyId (String partyId){
            this.partyId = partyId;
            return this;
        }
        public JourneyBuilder startDate (String startDate){
            this.startDate = startDate;
            return this;
        }

        public JourneyBuilder productId (String productId){
            this.productId = productId;
            return this;
        }
        public JourneyBuilder contractNumber(String contractNumber){
            this.contractNumber = contractNumber;
            return this;
        }
        @Override
        public CustomerJourney build() {
            return new CustomerJourney(this);
        }
    }
}
