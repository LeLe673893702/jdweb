package com.newler.jdweb.controller;

import com.newler.jdweb.dto.Result;
import com.newler.jdweb.DO.GoodsInfoDO;
import com.newler.jdweb.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/goods")
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    @GetMapping(path = "/add")
    public String addGoods() {
        System.out.println(getClass().getClassLoader().getResource("resources/static/css/order.css"));
        return "goodsform";
    }

    @PostMapping(path = "/summit")
    @ResponseBody
    public Result<String> summitGoods(GoodsInfoDO goodsInfoDO) {
        Result<String> result = new Result<>("提交成功");
        result.setSuccess(true);
        return result;
    }
}
