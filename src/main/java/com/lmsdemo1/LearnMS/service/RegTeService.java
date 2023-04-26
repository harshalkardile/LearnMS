package com.lmsdemo1.LearnMS.service;

import com.lmsdemo1.LearnMS.model.RegisterTe;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;


@Slf4j
@Service
//@RequestScope
@SessionScope
public class RegTeService {
    private int counter=0;

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public RegTeService(){
        System.out.println("Registration service has been initalized");
    }
    public boolean saveMessageDetails(RegisterTe registerTe) {
        boolean isSaved=true;
        //todo need to persist the data into the database table
        log.info(registerTe.toString());
        return isSaved;
    }
}
