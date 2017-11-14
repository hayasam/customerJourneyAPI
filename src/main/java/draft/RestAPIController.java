package draft;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class RestAPIController {

    @Autowired
    private CustomerJourneyCommandService journeyCommandService;
    private CustomerJourneyQueryService journeyQueryService;

    @RequestMapping(value = "/customerjourneys/v1", method = RequestMethod.POST)
    public CustomerJourneyCommand createNewCustomerJourney(@RequestBody CustomerJourneyCommand newJourneyRequest) {
        System.out.println(newJourneyRequest);
        return journeyCommandService.createNewJourney(newJourneyRequest);
    }
//
    @RequestMapping(value = "/customerjourneys/v1", method = RequestMethod.GET)
    public CustomerJourneyCommand getAllCustomerJourneys() {
        return new CustomerJourneyCommand.JourneyCommandBuilder()
                .processType("something")
                .build();
    }

    @RequestMapping(value = "/customerjourneys/v1/{id}", method = RequestMethod.GET)
    public CustomerJourneyQuery process3(@PathVariable String id) {
        return journeyQueryService.getCustomerJourneyById(id);
    }

    @RequestMapping(value = "/customerjourneys/v1/{id}/step", method = RequestMethod.POST)
    public void CreateNewStep(@PathVariable String id, @RequestBody Step stepRequest) {
        journeyCommandService.createNewStep(id, stepRequest);
    }
}
