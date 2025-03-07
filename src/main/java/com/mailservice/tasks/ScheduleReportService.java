package com.mailservice.tasks;

import com.mailservice.services.EmailService;
import com.mailservice.services.FileOSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ScheduleReportService {

    @Autowired
    private FileOSService fileOSService;

    @Autowired
    private EmailService emailService;

    private List<String> emailList = Arrays.asList("joaovitorlacerda120421@gmail.com");

    private final Integer SEVEN_DAY_IN_MILISECONDS = 604800000;

    @Scheduled(fixedRate = 30000)
    public void sendReport() {
        try {
            String report = fileOSService.getReportFileContent("report.html");

            for(String email: emailList) {
                emailService.sendReport(report, email);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
