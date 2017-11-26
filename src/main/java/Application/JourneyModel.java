package Application;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class JourneyModel {
    @Id
    private String journeyId;
    private String journeyType;
    private String partyId;
    private String startDate;
//    private Step step;
    private String productId;
    private String contractNumber;
    private String status;

    public JourneyModel(){}

    public String getJourneyId() {
        return journeyId;
    }

    public void setJourneyId(String journeyId) {
        this.journeyId = journeyId;
    }

    public String getJourneyType() {
        return journeyType;
    }

    public void setJourneyType(String journeyType) {
        this.journeyType = journeyType;
    }

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
//
//    public Step getStep() {
//        return step;
//    }

//    public void setStep(Step step) {
//        this.step = step;
//    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

}
