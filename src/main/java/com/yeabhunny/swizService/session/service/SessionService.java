package com.yeabhunny.swizService.session.service;

import com.yeabhunny.swizService.session.repository.CredentialsRepository;
import com.yeabhunny.swizService.session.exception.ForbiddenException;
import com.yeabhunny.swizService.session.entity.Credentials;
import com.yeabhunny.swizService.session.entity.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SessionService {

    @Autowired
    private CredentialsRepository credentialsRepository;

    public Session login(String login, String password) {

        Credentials credentials = credentialsRepository.getByLogin(login);

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
