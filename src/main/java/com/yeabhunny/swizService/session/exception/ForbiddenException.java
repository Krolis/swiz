package com.yeabhunny.swizService.session.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.FORBIDDEN, reason="Bad credentials")
public class ForbiddenException extends RuntimeException {
}
