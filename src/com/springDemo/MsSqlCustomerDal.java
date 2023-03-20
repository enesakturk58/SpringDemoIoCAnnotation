package com.springDemo;

public class MsSqlCustomerDal implements ICustomerDal{

    String connectionString;

    public String getConnectionString() {
        return connectionString;
    }

    public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
    }
    @Override
    public void add(){
        System.out.println("Connection String : " + this.getConnectionString());
        System.out.println("MsSql veritabanına eklendi.");
    }
}
