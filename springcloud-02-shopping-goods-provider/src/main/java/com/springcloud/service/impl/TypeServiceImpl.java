package com.springcloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springcloud.dao.Class1Mapper;
import com.springcloud.dao.Class2Mapper;
import com.springcloud.entity.Class1;
import com.springcloud.entity.Class2;
import com.springcloud.service.TypeService;

/**
 * 	用于实现一级类别与二级类别模块的方法
 * 
 * @author GanMingRan
 *
 */
@Service
public class TypeServiceImpl implements TypeService {

	@Autowired
	private Class1Mapper class1Mapper;
	
	@Autowired
	private Class2Mapper class2Mapper;
	
	@Override
	public List<Class1> selectAllClass1() {
		return this.class1Mapper.selectAll();
	}

	@Override
	public List<Class2> selectClass2ByClass1Id(Integer class1Id) {
		return this.class2Mapper.selectByClass1Id(class1Id);
	}

}
