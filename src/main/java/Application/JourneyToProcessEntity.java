package Application;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by C37056 on 26-11-2017.
 */
@Component
public class JourneyToProcessEntity implements Converter<Journey, Process> {
    @Override
    public Process convert(Journey model) {

        Process processInstance = new Process.ProcessBuilder()
                .id(Integer.parseInt(model.getJourneyId()))// conversion
                .processType(model.getJourneyType())
                .forWhom(Integer.parseInt(model.getPartyId())) // conversion error
                .contract(model.getContractNumber())
                .product(model.getProductId())
                .creationDate()
                .startDate(model.getStartDate()) //review Date Formats
                .level()
                .who(1)
                .source("Default")
                .state(model.getStatus())
                .build();

        return processInstance;
    }

    private java.sql.Date formatDate(String input) {
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        java.sql.Date sqlDate = null;
        try {
            java.util.Date date = format.parse(input);
            sqlDate = (java.sql.Date) new Date(date.getTime());

        } catch (Exception e) {
            System.out.println(e);
        }
        return sqlDate;
    }

}
