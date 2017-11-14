package draft;

import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerJourneyCommandService {

//    @Autowired
//    private CustomerJourneyRepository journeyRepository;

    public CustomerJourneyCommand createNewJourney(CustomerJourneyCommand customerJourneyCommandRequest){
        CustomerJourneyCommand customerJourneyCommandInstance = new CustomerJourneyCommand.JourneyCommandBuilder()
                .customerJourneyId(UUID.randomUUID().toString())
                .processType(customerJourneyCommandRequest.getProcessType())
                .contractNumber(customerJourneyCommandRequest.getContractNumber())
                .partyId(customerJourneyCommandRequest.getCustomerJourneyId())
                .productId(customerJourneyCommandRequest.getProductId())
                .startDate(customerJourneyCommandRequest.getStartDate())
                .step(customerJourneyCommandRequest.getStep())
                .build();
//        journeyRepository.save(customerJourneyCommandInstance);
        return customerJourneyCommandInstance;
    }

    public void createNewStep(String id, Step stepRequest) {
        CustomerJourneyCommand stepInstance = new CustomerJourneyCommand.JourneyCommandBuilder()
                .customerJourneyId(id)
                .step(stepRequest)
                .build();
        System.out.println(stepInstance);
    }
}
