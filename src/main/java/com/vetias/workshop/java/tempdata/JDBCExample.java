package com.vetias.workshop.java.tempdata;

import com.vetias.workshop.java.tempdata.dao.OrganizationDao;

public class JDBCExample {
    public static void main(String[] args) {
        OrganizationDao organizationDao = new OrganizationDao();
        organizationDao.creattable();
    }

}
