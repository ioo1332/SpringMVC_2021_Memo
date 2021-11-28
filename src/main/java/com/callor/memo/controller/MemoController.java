package com.callor.memo.controller;

import com.callor.memo.service.MemoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import java.util.List;

@Controller
public class MemoController {

    protected MemoService memoServiceV1;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String home(){

        return "memo/list";
    }

    @RequestMapping(value="/write", method=RequestMethod.GET)
    public String write(){

        return "memo/write";
    }

    @RequestMapping(value="/list", method=RequestMethod.GET)
    public String list(Model model) {

        List MemoVO = memoServiceV1.selectAll();

        model.addAttribute("M_LIST", MemoVO);

        return "memo/list";
    }


}
