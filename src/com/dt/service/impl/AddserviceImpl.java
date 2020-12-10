package com.dt.service.impl;

import org.junit.Test;

import com.dt.dao.CityDao;
import com.dt.dao.ProvinceDao;
import com.dt.dao.QuxianDao;
import com.dt.dao.impl.CityDaoImpl;
import com.dt.dao.impl.ProvinceDaoImpl;
import com.dt.dao.impl.QuxianDaoImpl;
import com.dt.pojo.City;
import com.dt.pojo.Province;
import com.dt.pojo.Quxian;
import com.dt.service.Addservice;

public class AddserviceImpl implements Addservice {
	CityDao cd=new CityDaoImpl();
	ProvinceDao pd=new ProvinceDaoImpl();
	QuxianDao qd=new QuxianDaoImpl();
	@Override
	public int[] addDates(Province p, City c, Quxian q) {
		// TODO Auto-generated method stub
		int[] a={pd.addProvince(p),cd.addCity(c),qd.addQuxian(q)};
		return a;
	}
	@Test
	public void show(){
		int[] f=addDates(new Province(10,"123"),new City(10,"123",10),new Quxian(100,"10",10));
		System.out.println(f[0]+f[1]+f[2]);
	}
}
