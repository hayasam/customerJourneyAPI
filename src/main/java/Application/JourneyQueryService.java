package Application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JourneyQueryService {


    @Autowired
    private ProcessRepository processRepository;
    private StepRepository stepRepository;

    public Process getJourneyById(int id) {
        Process response = processRepository.findOne(id);
        return response;
}

    public List<Journey> getAllJourneys(){
        List<Journey> journeys = new ArrayList<>();
//        journeyRepository.findAll()
//        .forEach(journeys::add);
        return journeys;
    }
}
