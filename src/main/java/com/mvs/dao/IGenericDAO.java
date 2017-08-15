package com.mvs.dao;

import java.io.Serializable;

public interface IGenericDAO<PK extends Serializable, T> extends Serializable {
    void delete(T entity);

    void saveOrUpdate(T entity);
}
