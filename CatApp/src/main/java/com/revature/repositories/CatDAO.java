package com.revature.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.revature.models.Breed;
import com.revature.models.Cat;
import com.revature.utils.JDBCConnection;

public class CatDAO implements GenericRepository<Cat> {
	
	private Connection conn = JDBCConnection.getConnection();

	@Override
	public Breed add(Cat t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cat getById(Integer id) {
		String sql = "select c.id, c.name, c.age, b.id as breed_id, b.breed from cats c left join breeds b on c.breed = b.id where c.id = ?;";
		
		try {
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			
			ResultSet rs = ps.executeQuery();
			
			if (rs.next()) {
				
				Cat c = new Cat();
				
				c.setId(rs.getInt("id"));
				c.setName(rs.getString("name"));
				c.setAge(rs.getInt("age"));
				
				Breed b = new Breed();
				b.setId(rs.getInt("breed_id"));
				b.setBreed(rs.getString("breed"));
				
				c.setBreed(b);
				
				return c;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Cat> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(Cat t) {
		// TODO Auto-generated method stub
		return false;
		
	}

	@Override
	public boolean delete(Cat t) {
		// TODO Auto-generated method stub
		return false;
	}

}
