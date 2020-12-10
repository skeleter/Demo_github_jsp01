package com.dt.service.impl;

import java.util.List;

import com.dt.dao.CityDao;
import com.dt.dao.ProvinceDao;
import com.dt.dao.QuxianDao;
import com.dt.dao.impl.CityDaoImpl;
import com.dt.dao.impl.ProvinceDaoImpl;
import com.dt.dao.impl.QuxianDaoImpl;
import com.dt.pojo.City;
import com.dt.service.CityService;

public class CityServiceImpl implements CityService{
	
	CityDao cd=new CityDaoImpl();
	@Override
	public List<City> getCityById(int pid) {
		// TODO Auto-generated method stub
		return cd.getCityById(pid);
	}

	@Override
	public int addCity(City c) {
		// TODO Auto-generated method stub
		return cd.addCity(c);
	}

	@Override
	public int delCity(City c) {
		// TODO Auto-generated method stub
		return cd.delCity(c);
	}

}
