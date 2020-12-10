package com.dt.dao.impl;

import java.util.List;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.junit.Test;
import com.dt.dao.ProvinceDao;
import com.dt.pojo.Province;
import com.dt.util.C3P0Utils;

public class ProvinceDaoImpl implements ProvinceDao{

	@Override
	public List<Province> getAllProvince() {
		// TODO Auto-generated method stub
		List<Province> list=null;
		QueryRunner qr=new QueryRunner(C3P0Utils.getDataSource());
		try {
			String sql="SELECT * FROM province";
			list=qr.query(sql, new BeanListHandler<Province>(Province.class));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return list;
	}
	
	/**   
	 * @title: addProvince
	 * @description: TODO
	 * @param p
	 * @return   
	 * @see com.dt.dao.ProvinceDao#addProvince(com.dt.pojo.Province)     
	 */ 
	@Override
	public int addProvince(Province p) {
		// TODO Auto-generated method stub
		int flag=0;
		QueryRunner qr=new QueryRunner(C3P0Utils.getDataSource());
		try {
			String sql="INSERT INTO province(pid,pname) VALUE(?,?)";
			flag=qr.update(sql, p.getPid(),p.getPname());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return flag;
	}
	
	/**   
	 * @title: delProvince
	 * @description: TODO
	 * @param p
	 * @return   
	 * @see com.dt.dao.ProvinceDao#delProvince(com.dt.pojo.Province)     
	 */ 
	@Override
	public int delProvince(Province p) {
		// TODO Auto-generated method stub
		int flag=0;
		QueryRunner qr=new QueryRunner(C3P0Utils.getDataSource());
		try {
			String sql="DELETE FROM province WHERE pid=?";
			flag=qr.update(sql, p.getPid());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return flag;
	}
	@Test
	public void show(){
		Province p=new Province(4,"456");
		addProvince(p);
		List<Province> list=getAllProvince();
		for(Province a:list){
			System.out.println(a.toString());
		}
		delProvince(p);
		list=getAllProvince();
		for(Province a:list){
			System.out.println(a.toString());
		}
	}
}
