package Application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JourneyAPIController {

    @Autowired
    private JourneyCommandService journeyCommandService;

    @Autowired
    private JourneyQueryService journeyQueryService;

    @RequestMapping(value = "/journeys/v1", method = RequestMethod.POST)
    public void createNewJourney(@RequestBody Journey newJourneyRequest) {
        journeyCommandService.createNewJourney(newJourneyRequest);
    }

    @RequestMapping(value = "/journeys/v1", method = RequestMethod.GET)
    public List<Journey> getAllJourneys() {
       return journeyQueryService.getAllJourneys();
    }

    @RequestMapping(value = "/journeys/v1/{id}", method = RequestMethod.GET)
    public Process getJourneyById(@PathVariable String id) {
        return journeyQueryService.getJourneyById(Integer.parseInt(id));
    }
//
//    @RequestMapping(value = "/customerjourneys/v1/{id}/step", method = RequestMethod.POST)
//    public void CreateNewStep(@PathVariable String id, @RequestBody Phase stepRequest) {
//        journeyCommandService.createNewStep(id, stepRequest);
//    }
}
