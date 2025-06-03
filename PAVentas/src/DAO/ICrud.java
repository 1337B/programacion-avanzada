package DAO;

import Model.Response;

public interface ICrud<T>{
    Response<T> create(T entity);
    Response<T> update(T entity);
    Response<T> delete(int id);
    Response<T> read(int id);
    Response<T> readAll();
}
