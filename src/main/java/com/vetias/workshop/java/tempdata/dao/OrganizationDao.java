package com.vetias.workshop.java.tempdata.dao;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;

import org.h2.jdbcx.JdbcDataSource;

public class OrganizationDao {
    public void creattable(){
        JdbcDataSource h2DataSource = new JdbcDataSource();
        h2DataSource.setURL("jdbc:h2:mem:temperaturedataDB");
        h2DataSource.setUser("sa");
        try(Connection dbconnection = h2DataSource.getConnection();
          Statement statement= dbconnection.createStatement()){
            statement.execute("""
                    create table organization(
                    id int Auto_Increment Primary key,
                    name varchar(100),
                    website varchar(100),
                    emailaddress varchar(100),
                    contact_number varchar(100))
                    """);
        }catch(SQLException e){
   System.out.println("Error creating table: " + e.getMessage());
        }

        }
    }



