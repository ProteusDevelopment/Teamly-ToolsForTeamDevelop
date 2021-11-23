package com.cherdev.teamly;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.*;

@SpringBootApplication
public class TeamlyApplication
{
	public static void main(String[] args)
	{
		String url = "jdbc:mysql://localhost:3306/teamlydb";
		String username = "root";
		String password = "superpass321!";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url, username, password);
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM tasks");

			while (resultSet.next())
			{
				System.out.println(resultSet.getString(2));
			}

			resultSet.close();
			statement.close();
			connection.close();

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		SpringApplication.run(TeamlyApplication.class, args);
	}
}
