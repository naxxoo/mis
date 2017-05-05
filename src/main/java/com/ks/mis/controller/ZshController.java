package com.ks.mis.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Properties;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ks.mis.model.ResultObject;

@Controller
@RequestMapping("/zsh")
public class ZshController {
        public static final  Logger logger= Logger.getLogger(ZshController.class);
        
        @RequestMapping("/index")
        public String test(){
        	logger.info("xxxxxx");
        	return "index";
        }
}
