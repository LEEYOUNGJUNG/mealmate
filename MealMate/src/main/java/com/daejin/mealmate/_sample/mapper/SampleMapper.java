package com.daejin.mealmate._sample.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository("sampleMapper")
public interface SampleMapper {
	String selectBySample();
}
