/**
 *   Copyright (c) 2014-2017 墨博云舟 All Rights Reserved. 
 */
package com.mobcb.jeffery.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * TestApiController :
 *
 * @author xue.zewen
 * @version 1.00
 * @since 2017-09-18 15:04
 */
@RestController
@RequestMapping(value = "api/v3")
public class TestApiController {

    private static Log logger = LogFactory.getLog(TestApiController.class);

    @RequestMapping(value = "", method = RequestMethod.GET)
    public Object Test(HttpServletRequest request, HttpServletResponse response) {
        String ss = request.getParameter("ss");
        logger.info("1111");
        return ss;
    }
}
