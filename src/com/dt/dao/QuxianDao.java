package com.dt.dao;

import java.util.List;
import com.dt.pojo.Quxian;

public interface QuxianDao {
	List<Quxian> getQuxianByid(int id);
	int addQuxian(Quxian q);
	int delQuxian(Quxian q);
}
