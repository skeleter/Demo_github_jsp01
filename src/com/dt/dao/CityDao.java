package com.dt.dao;

import java.util.List;

import com.dt.pojo.City;

public interface CityDao {
	List<City> getCityById(int pid);
	int addCity(City c);
	int delCity(City c);
}
