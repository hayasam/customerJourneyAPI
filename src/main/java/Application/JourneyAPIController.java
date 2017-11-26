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

    @RequestMapping(value = "/customerjourneys/v1", method = RequestMethod.POST)
    public void createNewJourney(@RequestBody JourneyModel newJourneyRequest) {
        journeyCommandService.createNewJourney(newJourneyRequest);
    }

    @RequestMapping(value = "/customerjourneys/v1", method = RequestMethod.GET)
    public List<JourneyModel> getAllJourneys() {
       return journeyQueryService.getAllJourneys();
    }

    @RequestMapping(value = "/customerjourneys/v1/{id}", method = RequestMethod.GET)
    public JourneyModel getJourneyById(@PathVariable String id) {
        return journeyQueryService.getJourneyById(id);
    }
//
//    @RequestMapping(value = "/customerjourneys/v1/{id}/step", method = RequestMethod.POST)
//    public void CreateNewStep(@PathVariable String id, @RequestBody Step stepRequest) {
//        journeyCommandService.createNewStep(id, stepRequest);
//    }
}
