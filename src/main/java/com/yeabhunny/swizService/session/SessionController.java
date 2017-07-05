package com.yeabhunny.swizService.session;

import com.yeabhunny.swizService.session.dto.request.LoginRequest;
import com.yeabhunny.swizService.session.dto.response.LoginResponse;
import com.yeabhunny.swizService.session.exception.ForbiddenException;
import com.yeabhunny.swizService.session.model.Session;
import com.yeabhunny.swizService.session.service.SessionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yeabhunny.swizService.session.dto.request.LoginRequest;
import com.yeabhunny.swizService.session.dto.response.LoginResponse;

@Controller
@RequestMapping("/session")
public class SessionController {

    @Autowired
    SessionService sessionService;

    private static final Logger LOG = LoggerFactory.getLogger(SessionController.class);

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public LoginResponse login(@RequestParam LoginRequest loginRequest){
        LOG.info("login as: " + loginRequest.getLogin());
        Session session = sessionService.login(loginRequest.getLogin(), loginRequest.getPassword());

        LoginResponse response = new LoginResponse(session.getToken(), session.getRole());

        return response;
    }

    @RequestMapping(value = "/logout", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<String> logout(){
        return ResponseEntity.ok("");
    }
}
