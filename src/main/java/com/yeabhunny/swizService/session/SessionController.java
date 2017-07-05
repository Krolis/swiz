package com.yeabhunny.swizService.session;

import com.yeabhunny.swizService.session.dto.request.LoginRequest;
import com.yeabhunny.swizService.session.dto.response.LoginResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SessionController {

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public LoginResponse login(@RequestParam LoginRequest loginRequest){
        LoginResponse response = new LoginResponse();
        response.token = "XDDD";
        if("promotor".equals(loginRequest.login)){
            response.role=AppRole.PROMOTOR;
        }else{
            response.role=AppRole.STUDENT;
        }

        return response;
    }

    @RequestMapping(value = "/logout", method = RequestMethod.POST)
    public ResponseEntity<String> logout(){
        return ResponseEntity.ok("");
    }
}
