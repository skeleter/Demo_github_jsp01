package com.dt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.dt.pojo.City;
import com.dt.pojo.Province;
import com.dt.pojo.Quxian;
import com.dt.service.DelService;
import com.dt.service.impl.DelServiceImpl;

/**
 * Servlet implementation class DelServlet
 */
public class DelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String spid=request.getParameter("pid");
		int pid=Integer.parseInt(spid);
		String pname=" ";
		String scid=request.getParameter("cid");
		int cid=Integer.parseInt(scid);
		String cname=" ";
		String sqid=request.getParameter("qid");
		int qid=Integer.parseInt(sqid);
		String qname=" ";
		//System.out.println(pid+pname+cid+cname+qid+qname);
		DelService add=new DelServiceImpl();
		int[] f=add.delDatas(new Province(pid,pname),new City(cid,cname,pid),new Quxian(qid,qname,cid));
		//System.out.println(f);
		response.setContentType("application/json;charset=utf-8");
		PrintWriter out= response.getWriter();
		out.write(JSON.toJSONString(f));
		out.flush();
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
