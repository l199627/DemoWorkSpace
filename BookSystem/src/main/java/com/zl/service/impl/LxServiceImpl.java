package com.zl.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zl.Dao.LxDao;
import com.zl.pojo.Lx;
import com.zl.service.LxService;
@Service
public class LxServiceImpl implements LxService {
@Autowired
private LxDao ld;
	@Override
	public List<Lx> findAllLx() {
		return ld.findAllLx();
	}

}
