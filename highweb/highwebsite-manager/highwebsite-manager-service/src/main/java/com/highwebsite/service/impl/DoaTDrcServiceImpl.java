package com.highwebsite.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.highwebsite.mapper.DoaTDrcMapper;
import com.highwebsite.pojo.DoaTDrc;
import com.highwebsite.pojo.DoaTDrcExample;
import com.highwebsite.pojo.DoaTDrcExample.Criteria;
import com.highwebsite.service.DoaTDrcService;
@Service
public class DoaTDrcServiceImpl implements DoaTDrcService {

	@Autowired
	private DoaTDrcMapper doaTDrcMapper;
	
	
	@Override
	public DoaTDrc getDoaTDrcBymd5(String md5) {
		DoaTDrcExample example = new DoaTDrcExample();
		Criteria criteria = example.createCriteria();
		criteria.andMd5EqualTo(md5);
		List<DoaTDrc> list = doaTDrcMapper.selectByExample(example);
		if(list!=null&&list.size()>0){
			DoaTDrc doaTDrc = list.get(0);
			return doaTDrc;
		}
		return null;
	}

}
