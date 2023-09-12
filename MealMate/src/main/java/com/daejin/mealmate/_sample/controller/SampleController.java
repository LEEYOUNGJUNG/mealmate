package com.daejin.mealmate._sample.controller;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.daejin.mealmate._sample.service.SampleService;


@RestController
public class SampleController {

	@Resource(name="sampleService")
	SampleService sampleService;
	
	@RequestMapping("/index.do")
	public String index() {
		return sampleService.selectBySample();
	}

}
