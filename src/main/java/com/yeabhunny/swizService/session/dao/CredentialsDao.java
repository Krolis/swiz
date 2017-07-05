package com.yeabhunny.swizService.session.dao;

import com.yeabhunny.swizService.session.AppRole;
import com.yeabhunny.swizService.session.model.Credentials;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class CredentialsDao {

    private List<Credentials> db;

    public CredentialsDao() {

        Credentials c1 = new Credentials(1L,"promotor","test", AppRole.PROMOTOR);
        Credentials c2 = new Credentials(11L,"student1","test", AppRole.STUDENT);
        Credentials c3 = new Credentials(12L,"student2","test", AppRole.STUDENT);
        Credentials c4 = new Credentials(13L,"student3","test", AppRole.STUDENT);
        Credentials c5 = new Credentials(14L,"student4","test", AppRole.STUDENT);

        db = Arrays.asList(c1,c2,c3,c4,c5);
    }

    public Credentials getByLogin(String login) {
        return db.stream().filter(item->item.getLogin().equals(login)).findAny().orElse(null);
    }

}
