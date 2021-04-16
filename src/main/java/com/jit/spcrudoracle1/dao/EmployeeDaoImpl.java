package com.jit.spcrudoracle1.dao;

import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import com.jit.spcrudoracle1.model.Employee;
public class EmployeeDaoImpl implements EmployeeDao{
	
private	SimpleJdbcCall simpleJdbcCall;
public void setDataSource(DataSource dataSource) {
	this.simpleJdbcCall=new SimpleJdbcCall(dataSource)
			.withProcedureName("getAllEmployee");
}
@Override
public Employee getEmployee(int id) {
SqlParameterSource in=	new MapSqlParameterSource();
Map<String,Object> out=simpleJdbcCall.execute(in);
Employee employee=new Employee();
employee.setId(id);
employee.setEmpname((String)out.get("out_name"));
employee.setEmpsal((int)out.get("out_sal"));
employee.setDesig((String)out.get("out_desig"));
	return employee;
}
}
