package draft;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class RestAPIController {

    @Autowired
    private CustomerJourneyCommandService journeyCommandService;

    @RequestMapping(value = "/customerjourneys/v1", method = RequestMethod.POST)
    public CustomerJourney createNewCustomerJourney(@RequestBody CustomerJourney newJourneyRequest) {
        System.out.println(newJourneyRequest);
        return journeyCommandService.createNewJourney(newJourneyRequest);
    }
//
    @RequestMapping(value = "/customerjourneys/v1", method = RequestMethod.GET)
    public CustomerJourney process2() {
        return new CustomerJourney.JourneyBuilder()
                .processType("something")
                .build();
    }
//
//    @RequestMapping(value = "/customerjourneys/v1/{id}", method = RequestMethod.GET)
//    public CustomerJourney process3(@PathVariable String id) {
//        return new CustomerJourney();
//    }
//
//    @RequestMapping(value = "/customerjourneys.v1/{id}/phase", method = RequestMethod.POST)
//    public CustomerJourney process4(@RequestParam(value="name", defaultValue="World") String name) {
//        return new CustomerJourney();
//    }
}
