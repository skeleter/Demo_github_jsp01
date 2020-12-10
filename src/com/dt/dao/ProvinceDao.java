package com.dt.dao;

import java.util.List;

import com.dt.pojo.Province;

public interface ProvinceDao {
	List<Province> getAllProvince();
	int addProvince(Province p);
	int delProvince(Province p);
}
