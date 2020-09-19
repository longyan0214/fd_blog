package store.longyan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import store.longyan.service.OptionService;

import java.util.HashMap;

@RestController
@RequestMapping(value = "/option")
public class OptionController {

    @Autowired
    private OptionService optionService;

    @RequestMapping(value = "/getWebsiteInfo", method = RequestMethod.GET)
    public HashMap<String,Object> getWebsiteInfo(){
        HashMap<String,Object> result = new HashMap<>();
        result.put("status", 200);
        result.put("data", optionService.getWebsiteInfo());
        return result;
    }

    @RequestMapping(value = "/getManagerInfo", method = RequestMethod.GET)
    public HashMap<String, Object> getManagerInfo() {
        HashMap<String,Object> manger = new HashMap<>();
        manger.put("status",200);
        manger.put("managerInfo",optionService.findManagerInfo());
        return manger;
    }

}
