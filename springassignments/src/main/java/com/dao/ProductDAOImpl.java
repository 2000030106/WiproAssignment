package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.pojo.Product;

@Repository
public class ProductDAOImpl  implements ProductDAO{

	private JdbcTemplate jdbcTemplate;

    public  ProductDAOImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
	
	@SuppressWarnings("deprecation")
	//@Override
	public Product getProductDetails(int product_code) {
	    try {
	        String query = "SELECT * FROM product WHERE product_code = ?";
	        return jdbcTemplate.queryForObject(query, new Object[]{product_code}, new RowMapper<Product>() {
	            public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
	                Product p = new Product();
	                p.setProduct_code(rs.getInt("product_code"));
	                p.setProduct_name(rs.getString("product_name"));
	                p.setProduct_category(rs.getString("product_category"));
	                p.setProduct_description(rs.getString("product_desc"));
	                p.setProduct_price(rs.getDouble("product_price"));
	                return p;
	            }
	        });
	    } catch (Exception e) {
	        System.out.println("DAO Error: " + e.getMessage());  
	        return null;
	    }
	}


}
