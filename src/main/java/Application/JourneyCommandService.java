package Application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JourneyCommandService {

    @Autowired
    private ProcessRepository processRepository;

    @Autowired
    private StepRepository stepRepository;

    @Autowired
    private JourneyToProcessEntity toProcessConverter;

    @Autowired
    private JourneyToStepEntity toStepConverter;

    public void createNewJourney(Journey request){
        Process newProcess = toProcessConverter.convert(request);
        Step newStep = toStepConverter.convert(request);
        processRepository.save(newProcess);
        stepRepository.save(newStep);
    }

    public void createNewStep(String id, Phase phaseRequest) {
    }
}
