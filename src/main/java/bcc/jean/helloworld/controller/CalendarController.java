package bcc.jean.helloworld.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

@RestController
@RequestMapping("/calendar")
public class CalendarController {
    @GetMapping("/today")
    public String today(){
        Date today = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDate = sdf.format(today.getTime());
        return "Hoje é " + formattedDate;
    }

    @GetMapping("/tomorrow")
    public String tomorrow(){
        //Pega a Data Corrente
        GregorianCalendar tomorrow = new GregorianCalendar();

        //soma 1 dia a data original
        tomorrow.roll(Calendar.DAY_OF_MONTH, 1);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDate = sdf.format(tomorrow.getTime());
        return "Amanhã será " + formattedDate;
    }

    @GetMapping("/yesterday")
    public String yesterday(){
        //Pega a Data Corrente
        GregorianCalendar yesterday = new GregorianCalendar();

        //soma 1 dia a data original
        yesterday.roll(Calendar.DAY_OF_MONTH, -1);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDate = sdf.format(yesterday.getTime());
        return "Ontem foi " + formattedDate;
    }
}
