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
import com.dt.service.Addservice;
import com.dt.service.impl.AddserviceImpl;

/**
 * Servlet implementation class AddServlet
 */
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String spid=request.getParameter("pid");
		int pid=Integer.parseInt(spid);
		String pname=request.getParameter("pname");
		String scid=request.getParameter("cid");
		int cid=Integer.parseInt(scid);
		String cname=request.getParameter("cname");
		String sqid=request.getParameter("qid");
		int qid=Integer.parseInt(sqid);
		String qname=request.getParameter("qname");
		//System.out.println(pid+pname+cid+cname+qid+qname);
		Addservice add=new AddserviceImpl();
		int[] f=add.addDates(new Province(pid,pname),new City(cid,cname,pid),new Quxian(qid,qname,cid));
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
