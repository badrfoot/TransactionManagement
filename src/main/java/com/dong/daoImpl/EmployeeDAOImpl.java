package com.dong.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.dong.bean.Employee;
import com.dong.dao.EmployeeDAO;
import com.dong.util.DBConnection;

public class EmployeeDAOImpl implements EmployeeDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	 
    public EmployeeDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

	@Override
	public Employee findEmployeeById(int employeeID) {
		
		Session session = sessionFactory.getCurrentSession();
		
		Employee employee = (Employee) session.load(Employee.class, employeeID);
//		
//
//		
//		Connection conn = DBConnection.getConnection();		
//		String findByIDSQL = "select * from " +
//						"tb_employee where employeeID = ?";	
//		PreparedStatement pstmt = null;
//		ResultSet rs = null;
//		Employee employee = null;
//		
//		try {
//			pstmt = conn.prepareStatement(findByIDSQL);		
//			pstmt.setInt(1, employeeID);					
//			rs = pstmt.executeQuery();
//			
//			if(rs.next()) {
//				employee = new Employee();
//				employee.setEmployeeID(rs.getInt(1));		
//				employee.setEmployeeName(rs.getString(2));	
//				employee.setEmployeeSex(rs.getBoolean(3));	
//				employee.setEmployeeBirth(rs.getDate(4));	
//				employee.setEmployeePhone(rs.getString(5));	
//				employee.setEmployeePlace(rs.getString(6));	
//				employee.setJoinTime(rs.getDate(7));		
//				employee.setPassword(rs.getString(8));		
//				employee.setLead(rs.getBoolean(9));			
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally{
//			DBConnection.close(rs);								
//			DBConnection.close(pstmt);							
//			DBConnection.close(conn);							
//		}
		return employee;
	}

}
