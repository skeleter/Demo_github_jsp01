package com.dt.dao.impl;
import java.util.List;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.junit.Test;
import com.dt.dao.QuxianDao;
import com.dt.pojo.Quxian;
import com.dt.util.C3P0Utils;

public class QuxianDaoImpl  implements QuxianDao {

	@Override
	public List<Quxian> getQuxianByid(int id) {
		// TODO Auto-generated method stub
			List<Quxian> list=null;
			QueryRunner qr=new QueryRunner(C3P0Utils.getDataSource());
			try {
				String sql="SELECT * FROM quxian WHERE cid=?";
				list=qr.query(sql, new BeanListHandler<Quxian>(Quxian.class),id);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			return list;
	}
	
	/**   
	 * @title: addQuxian
	 * @description: TODO
	 * @param q
	 * @return  int 
	 * @see com.dt.dao.QuxianDao#addQuxian(com.dt.pojo.Quxian)     
	 */ 
	@Override
	public int addQuxian(Quxian q) {
		// TODO Auto-generated method stub
		int flag=0;
		QueryRunner qr=new QueryRunner(C3P0Utils.getDataSource());
		try {
			String sql="INSERT INTO quxian(qid,qname,cid) VALUE(?,?,?)";
			flag=qr.update(sql,q.getQid(),q.getQname(),q.getCid());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return flag;
	}
	
	/**   
	 * @title: delQuxian
	 * @description: TODO
	 * @param q
	 * @return   
	 * @see com.dt.dao.QuxianDao#delQuxian(com.dt.pojo.Quxian)     
	 */ 
	@Override
	public int delQuxian(Quxian q) {
		// TODO Auto-generated method stub
		int flag=0;
		QueryRunner qr=new QueryRunner(C3P0Utils.getDataSource());
		try {
			String sql="DELETE FROM quxian WHERE qid=?";
			flag=qr.update(sql,q.getQid());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return flag;
	}
	@Test
	public void show(){
		List<Quxian> list=getQuxianByid(1);
		for(Quxian a:list){
			System.out.println(a.toString());
		}
	}
}
