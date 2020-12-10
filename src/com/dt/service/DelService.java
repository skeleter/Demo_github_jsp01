package com.dt.service;

import com.dt.pojo.City;
import com.dt.pojo.Province;
import com.dt.pojo.Quxian;

public interface DelService {
	int[] delDatas(Province p,City c,Quxian q);
}
