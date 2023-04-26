package com.lmsdemo1.LearnMS.service;

import com.lmsdemo1.LearnMS.model.RegisterSt;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class RegStService {

//    private static Logger log= LoggerFactory.getLogger(RegStService.class);
    public boolean saveMessageDetails(RegisterSt registerSt) {
        boolean isSaved=true;
        //todo need to persist the data into the database table
        log.info(registerSt.toString());
        return isSaved;
    }
}
