package com.yeabhunny.swizService.session;

import com.yeabhunny.swizService.session.dto.request.LoginRequest;
import com.yeabhunny.swizService.session.dto.response.LoginResponse;
import com.yeabhunny.swizService.session.exception.ForbiddenException;
import com.yeabhunny.swizService.session.model.Session;
import com.yeabhunny.swizService.session.service.SessionService;
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

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public LoginResponse login(@RequestParam LoginRequest loginRequest){

        Session session = sessionService.login(loginRequest.getLogin(), loginRequest.getPassword());

        LoginResponse response = new LoginResponse(session.getToken(), session.getRole());

        // TODO - obsłuż sobie też to
        if (!loginRequest.getPassword().equals("test"))
        	throw new RuntimeException();

        switch (loginRequest.getLogin()){
            case "promotor":
                response.setRole(AppRole.PROMOTOR);
                response.setUserId(1L);
                break;
            case "student1":
            	response.setUserId(11L);
                response.setRole(AppRole.STUDENT);
                break;
            case "student2":
            	response.setUserId(12L);
                response.setRole(AppRole.STUDENT);
                break;
            case "student3":
            	response.setUserId(13L);
                response.setRole(AppRole.STUDENT);
                break;
            case "student4":
            	response.setUserId(14L);
                response.setRole(AppRole.STUDENT);
                break;
            default:
                throw new RuntimeException();
        }
        return response;
    }

    @RequestMapping(value = "/logout", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<String> logout(){
        return ResponseEntity.ok("");
    }
}
