package com.dt.service.impl;

import com.dt.dao.CityDao;
import com.dt.dao.ProvinceDao;
import com.dt.dao.QuxianDao;
import com.dt.dao.impl.CityDaoImpl;
import com.dt.dao.impl.ProvinceDaoImpl;
import com.dt.dao.impl.QuxianDaoImpl;
import com.dt.pojo.City;
import com.dt.pojo.Province;
import com.dt.pojo.Quxian;
import com.dt.service.DelService;

public class DelServiceImpl implements DelService {
	CityDao cd=new CityDaoImpl();
	ProvinceDao pd=new ProvinceDaoImpl();
	QuxianDao qd=new QuxianDaoImpl();
	@Override
	public int[] delDatas(Province p, City c, Quxian q) {
		// TODO Auto-generated method stub
		int[] a={pd.delProvince(p),cd.delCity(c),qd.delQuxian(q)};
		return a;
	}

}
