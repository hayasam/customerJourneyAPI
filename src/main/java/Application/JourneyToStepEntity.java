package Application;


import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * Created by C37056 on 26-11-2017.
 */
@Component
public class JourneyToStepEntity implements Converter<Journey, Step> {
    @Override
    public Step convert(Journey model) {
        Step step = new Step.StepBuilder()
                .stepId(12345)
                .actor("default")
                .actorType("BC")
                .channel(Integer.parseInt(model.getPhase().getChannel())) // int conversion creates exeption
                .creationDate("default")
                .startDate(model.getPhase().getStartDate())
                .journeyId(Integer.parseInt(model.getJourneyId()))
                .roleId("addLater")
                .stepName(model.getPhase().getStepName())
                .build();
        return step;
    }
}
