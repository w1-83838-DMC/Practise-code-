package com.sunbeam.blogrestv3;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sunbeam.blogrestv3.dtos.BlogResult;

@ControllerAdvice
public class BlogAppContollerExceptionHandling {

    @ExceptionHandler
    public @ResponseBody BlogResult<?>handleException(Throwable e)
    {
        e.printStackTrace();
        return BlogResult.error(e.getMessage());

    }

}
