package com.raj.SpringJDBC;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class StudentMapper implements RowMapper {
   public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
      Student student = new Student();
      int k=rs.getInt("id");
      student.setId(k);
      student.setName(rs.getString("name"));
      student.setAge(rs.getInt("age"));
      return student;
   }
}