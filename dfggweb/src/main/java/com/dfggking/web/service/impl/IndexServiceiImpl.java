package com.dfggking.web.service.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.dfggking.web.common.base.BaseServiceImpl;
import com.dfggking.web.po.Dic;
import com.dfggking.web.service.IIndexService;

@Service
@Scope(value = "singleton")
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Throwable.class, isolation = Isolation.READ_COMMITTED)
public class IndexServiceiImpl extends BaseServiceImpl implements IIndexService {

	@Override
	public void testService() {
		Dic dic = new Dic();
		dic.setId("1322314");
		dic.setDicName("字典1");
		dic.setRemark("1231324");
		dic.setDicCode("001");
		dic.setDicValue("AbstractApplicationContext");
		dic.setSort("123");
		dic.setParentId("1");
		hdao.save(dic);
		
	}

}