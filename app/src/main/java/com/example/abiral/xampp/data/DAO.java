package com.example.abiral.xampp.data;

import java.util.List;

public interface DAO {

    public void insert();
    public void update();
    public void delete();
    public List<String> getUsers();

}
