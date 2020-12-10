package com.dt.dao.impl;

import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.junit.Test;
import com.dt.dao.CityDao;
import com.dt.pojo.City;
import com.dt.util.C3P0Utils;

public class CityDaoImpl implements CityDao{

	@Override
	public List<City> getCityById(int pid) {
		// TODO Auto-generated method stub
			List<City> list=null;
			QueryRunner qr=new QueryRunner(C3P0Utils.getDataSource());
			try {
				String sql="SELECT * FROM city WHERE pid=?";
				list=qr.query(sql, new BeanListHandler<City>(City.class),pid);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			return list;
	}
	
	/**   
	 * @title: addCity
	 * @description: TODO
	 * @param c
	 * @return   
	 * @see com.dt.dao.CityDao#addCity(com.dt.pojo.City)     
	 */ 
	@Override
	public int addCity(City c) {
		// TODO Auto-generated method stub
		int flag=0;
		QueryRunner qr=new QueryRunner(C3P0Utils.getDataSource());
		try {
			String sql="INSERT INTO city(cid,cname,pid) VALUE(?,?,?)";
			flag=qr.update(sql,c.getCid(),c.getCname(),c.getPid());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return flag;
	}
	
	/**   
	 * @title: delCity
	 * @description: TODO
	 * @param c
	 * @return   
	 * @see com.dt.dao.CityDao#delCity(com.dt.pojo.City)     
	 */ 
	@Override
	public int delCity(City c) {
		// TODO Auto-generated method stub
		int flag=0;
		QueryRunner qr=new QueryRunner(C3P0Utils.getDataSource());
		try {
			String sql="DELETE FROM city WHERE cid=?";
			flag=qr.update(sql,c.getCid());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return flag;
	}
	@Test
	public void show(){
		List<City> list=getCityById(1);
		for(City a:list){
			System.out.println(a.toString());
		}
	}
}
