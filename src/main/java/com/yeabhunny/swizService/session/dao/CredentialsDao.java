package com.yeabhunny.swizService.session.dao;

import com.yeabhunny.swizService.session.AppRole;
import com.yeabhunny.swizService.session.exception.ForbiddenException;
import com.yeabhunny.swizService.session.model.Credentials;

import java.util.HashMap;


public class CredentialsDao {

    private HashMap<String, Credentials> database;

    public CredentialsDao() {

       // Credentials c1 = new Credentials()

    }

    public Credentials getByLogin(String login) {

        return database.get(login);
    }
}
