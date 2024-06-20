package com.finalization.project.web;

import com.lemonwind.common.ResultObj;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {

    @GetMapping("/provider/data")
    public ResultObj<String> data() {
        return ResultObj.success();
    }

}
