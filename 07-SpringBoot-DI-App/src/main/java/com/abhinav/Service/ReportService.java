package com.abhinav.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abhinav.Dao.ReportDao;

@Service
public class ReportService {
	
	private ReportDao reportDao;
	
	public ReportService() {
		System.out.println("0 - param constructor.....");
	}
	
	@Autowired
	public ReportService(ReportDao reportDao)
	{
		System.out.println("Param Constructor");
		this.reportDao = reportDao; 
	}
	
//	@Autowired
//	public void setReportDao(ReportDao reportDao)
//	{
//		System.out.println("SetReportDao() is called.....");
//		this.reportDao = reportDao;
//	}
//	
	public void printName(Integer userId)
	{
	  String nameById = reportDao.getNameById(userId);
	  System.out.println(nameById);	
	}
}
