package com.daejin.mealmate._sample.service.impl;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.daejin.mealmate._sample.mapper.SampleMapper;
import com.daejin.mealmate._sample.service.SampleService;

@Service("sampleService")
public class SampleServiceImpl implements SampleService {
	
	@Resource(name = "sampleMapper")
	SampleMapper sampleMapper;
	
	public String selectBySample() {
		
		return sampleMapper.selectBySample();
	}
}
