package Application;

import com.fasterxml.jackson.databind.ObjectMapper;
import javafx.util.Builder;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Process {

    public Process(){};
    @Id
    private int TT_PROCESS_ID; //journeyId

    private String FK_PROC_NM_TYPE_ID; //journeyType
    private String PROCESS_SOURCE_ID;
    private String PROCESS_ID;
    private int LEVEL_INDICATOR;
    private int FOR_WHOM_BCID; // partyId
    private int INITIATOR_BCID;
    private String CONTRACT_NUMBER; //ContractId
    private String PRODUCT_ID; //productId
    private String START_DATETIME; //Start date
    private String END_DATETIME;
    private String CREATION_DATETIME;
    private String PROCESS_RESULT_MSG; //state
    // need baseResumeURL

    public int getTT_PROCESS_ID() {
        return TT_PROCESS_ID;
    }

    public String getFK_PROC_NM_TYPE_ID() {
        return FK_PROC_NM_TYPE_ID;
    }

    public String getPROCESS_SOURCE_ID() {
        return PROCESS_SOURCE_ID;
    }

    public String getPROCESS_ID() {
        return PROCESS_ID;
    }

    public int getLEVEL_INDICATOR() {
        return LEVEL_INDICATOR;
    }

    public int getFOR_WHOM_BCID() {
        return FOR_WHOM_BCID;
    }

    public int getINITIATOR_BCID() {
        return INITIATOR_BCID;
    }

    public String getCONTRACT_NUMBER() {
        return CONTRACT_NUMBER;
    }

    public String getPRODUCT_ID() {
        return PRODUCT_ID;
    }

    public String getSTART_DATETIME() {
        return START_DATETIME;
    }

    public String getEND_DATETIME() {
        return END_DATETIME;
    }

    public String getCREATION_DATETIME() {
        return CREATION_DATETIME;
    }

    public String getPROCESS_RESULT_MSG() {
        return PROCESS_RESULT_MSG;
    }

    public Process(ProcessBuilder builder) {
        this.TT_PROCESS_ID = builder.TT_PROCESS_ID;
        this.FK_PROC_NM_TYPE_ID = builder.FK_PROC_NM_TYPE_ID;
        this.PROCESS_ID = builder.PROCESS_ID;
        this.PROCESS_SOURCE_ID = builder.PROCESS_SOURCE_ID;
        this.LEVEL_INDICATOR = builder.LEVEL_INDICATOR;
        this.FOR_WHOM_BCID = builder.FOR_WHOM_BCID;
        this.INITIATOR_BCID = builder.INITIATOR_BCID;
        this.CONTRACT_NUMBER = builder.CONTRACT_NUMBER;
        this.PRODUCT_ID = builder.PRODUCT_ID;
        this.START_DATETIME = builder.START_DATETIME;
        this.END_DATETIME = builder.END_DATETIME;
        this.CREATION_DATETIME = builder.CREATION_DATETIME;
        this.PROCESS_RESULT_MSG = builder.PROCESS_RESULT_MSG;

        System.out.println(this);
    }


    public String toString(){ // for debugging
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


    public static class ProcessBuilder implements Builder {
        private int TT_PROCESS_ID;

        private String FK_PROC_NM_TYPE_ID; //journeyType
        private String PROCESS_SOURCE_ID;
        private String PROCESS_ID;
        private int LEVEL_INDICATOR;
        private int FOR_WHOM_BCID; // partyId
        private int INITIATOR_BCID;
        private String CONTRACT_NUMBER; //ContractId
        private String PRODUCT_ID; //productId
        private String START_DATETIME; //Start date
        private String END_DATETIME;
        private String CREATION_DATETIME;
        private String PROCESS_RESULT_MSG; //state

        public ProcessBuilder id(int id){
            this.TT_PROCESS_ID = id;
            return this;
        }

        public ProcessBuilder processType(String processType) {
            this.FK_PROC_NM_TYPE_ID = processType;
            return this;
        }

        public ProcessBuilder source(String source) {
            this.PROCESS_SOURCE_ID = source;
            return this;
        }

        public ProcessBuilder processId(String processId) {
            this.PROCESS_ID = processId;
            return this;
        }

        public ProcessBuilder level() {
            this.LEVEL_INDICATOR = 1;
            return this;
        }

        public ProcessBuilder forWhom(int forWhom) {
            this.FOR_WHOM_BCID = forWhom;
            return this;
        }

        public ProcessBuilder who(int who) {
            this.INITIATOR_BCID = who;
            return this;
        }

        public ProcessBuilder contract(String contract) {
            this.CONTRACT_NUMBER = contract;
            return this;
        }

        public ProcessBuilder product(String product) {
            this.PRODUCT_ID = product;
            return this;
        }

        public ProcessBuilder startDate(String startDate) {
            this.START_DATETIME = startDate;
            return this;
        }

        public ProcessBuilder endDate(String endDate) {
            this.END_DATETIME = endDate;
            return this;
        }

        public ProcessBuilder creationDate() {
            this.CREATION_DATETIME = "1234";
            return this;
        }

        public ProcessBuilder state(String state) {
            this.PROCESS_RESULT_MSG = state;
            return this;
        }

        @Override
        public Process build() {
            return new Process(this);
        }
    }
}
