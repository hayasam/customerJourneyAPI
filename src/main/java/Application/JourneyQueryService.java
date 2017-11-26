package Application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JourneyQueryService {


    @Autowired
    private JourneyRepository journeyRepository;

    public JourneyModel getJourneyById(String id) {
        JourneyModel response = journeyRepository.findOne(id);
        return response;
}

    public List<JourneyModel> getAllJourneys(){
        List<JourneyModel> journeys = new ArrayList<>();
        journeyRepository.findAll()
        .forEach(journeys::add);
        return journeys;
    }
}
