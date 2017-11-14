package draft;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerJourneyQueryService {

//
//    @Autowired
//    private CustomerJourneyRepository journeyRepository;
    public CustomerJourneyQuery getCustomerJourneyById(String id) {
//        journeyRepository.findAllById(id);
        return new CustomerJourneyQuery();
}
//    public List<CustomerJourneyCommand> getAllJourneys(){
//        List<CustomerJourneyCommand> journeys = new ArrayList<>();
//        journeyRepository.findAll()
//        .forEach(journeys::add);
//        return journeys;
//    }
}
