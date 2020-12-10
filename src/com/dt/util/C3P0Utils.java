package com.dt.util;

import java.sql.Connection;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;
public class C3P0Utils {
	private static DataSource ds = new ComboPooledDataSource();
	
	//返回数据源
	public static DataSource getDataSource(){
		return ds;
	}
	//只用管理连接即可，关闭不用管
	public static Connection getCon(){
		try {
			return ds.getConnection();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}
}
