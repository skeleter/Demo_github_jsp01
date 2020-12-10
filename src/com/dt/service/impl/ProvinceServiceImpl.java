package com.dt.service.impl;

import java.util.List;

import com.dt.dao.ProvinceDao;
import com.dt.dao.impl.ProvinceDaoImpl;
import com.dt.pojo.Province;
import com.dt.service.ProvinceService;

public class ProvinceServiceImpl implements ProvinceService{

	ProvinceDao pd=new ProvinceDaoImpl();
	@Override
	public List<Province> getAllProvince() {
		// TODO Auto-generated method stub
		
		return pd.getAllProvince();
	}
	@Override
	public int addProvince(Province p) {
		// TODO Auto-generated method stub
		return pd.addProvince(p);
	}
	@Override
	public int delProvince(Province p) {
		// TODO Auto-generated method stub
		return pd.delProvince(p);
	}

}
