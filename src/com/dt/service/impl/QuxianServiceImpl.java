package com.dt.service.impl;

import java.util.List;

import com.dt.dao.QuxianDao;
import com.dt.dao.impl.QuxianDaoImpl;
import com.dt.pojo.Quxian;
import com.dt.service.QuxianService;

public class QuxianServiceImpl implements QuxianService {

	QuxianDao qd=new QuxianDaoImpl();
	@Override
	public List<Quxian> getQuxianByid(int id) {
		// TODO Auto-generated method stub
		return qd.getQuxianByid(id);
	}
	@Override
	public int addQuxian(Quxian q) {
		// TODO Auto-generated method stub
		return qd.addQuxian(q);
	}
	@Override
	public int delQuxian(Quxian q) {
		// TODO Auto-generated method stub
		return qd.delQuxian(q);
	}

}
