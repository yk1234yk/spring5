package com.atguigu.spring6.jdbc;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.List;

@SpringJUnitConfig(locations = "classpath:bean.xml")
public class JdbcTemplateTest {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    //    查询：返回对象
    @Test
    public void testSelectObject() {
        /**String sql = "select * from t_emp where id=?";
         //        方法一
         Emp empResult = jdbcTemplate.queryForObject(sql, (rs, rowNum) -> {
         Emp emp = new Emp();
         emp.setId(rs.getInt("id"));
         emp.setName(rs.getString("name"));
         emp.setAge(rs.getInt("age"));
         emp.setSex(rs.getString("sex"));
         return emp;
         }, 1);
         System.out.println(empResult);
         */
        //方法二
        String sql = "select * from t_emp where id=?";
        Emp emp = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Emp.class), 1);
        System.out.println(emp);
    }
//    查询:返回list对象

    @Test
    public void testSelectList() {
        String sql = "select * from t_emp";
        List<Emp> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Emp.class));
        for (Emp lists : list) {
            System.out.println(lists);
        }
    }
//    查询：返回单个值
    @Test
    public void selectCount(){
        String sql="select name from t_emp where id=?";
        String integer = jdbcTemplate.queryForObject(sql,String.class,1);
        System.out.println(integer);
    }

    //    添加 修改 删除操作
    @Test
    public void testUpdate() {
        /**
         //1.添加操作
         //第一步：编写SQL语句
         String sql = "insert into t_emp values(null,?,?,?)";
         //第二步：调用jdbcTemplate的方法，传入相关参数
         Object[] params={"宵宫",22,"女"};
         int rows = jdbcTemplate.update(sql, params);
         //int rows = jdbcTemplate.update(sql, "心海", 20, "女");
         System.out.println(rows);
         */
        /**
         //        2.修改操作
         String sql = "update t_emp set name=? where id=?";
         int update = jdbcTemplate.update(sql, "心海小舔狗",1);
         System.out.println(update);
         */
        /**
         //        删除操作
         String sql= "delete from t_emp where id = ?";
         int update = jdbcTemplate.update(sql, 3);
         System.out.println(update);
         */
    }
}
