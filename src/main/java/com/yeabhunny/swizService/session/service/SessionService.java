package com.yeabhunny.swizService.session.service;

import com.yeabhunny.swizService.session.AppRole;
import com.yeabhunny.swizService.session.dao.CredentialsDao;
import com.yeabhunny.swizService.session.exception.ForbiddenException;
import com.yeabhunny.swizService.session.model.Credentials;
import com.yeabhunny.swizService.session.model.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SessionService {

    @Autowired
    private CredentialsDao credentialsDao;

    public Session login(String login, String password) {

        Credentials credentials = credentialsDao.getByLogin(login);

        if(credentials != null && credentials.getPassword().equals(password)){
            Session response = new Session();
            response.setToken(credentials.getUserId() + "");
            response.setRole(credentials.getRole());

            return response;
        }else{
            throw new ForbiddenException();
        }
    }
}
