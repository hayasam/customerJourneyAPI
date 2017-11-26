package Application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JourneyCommandService {

    @Autowired
    private JourneyRepository journeyRepository;

    public void createNewJourney(JourneyModel request){
        journeyRepository.save(request);
    }

    public void createNewStep(String id, Step stepRequest) {
    }
}
