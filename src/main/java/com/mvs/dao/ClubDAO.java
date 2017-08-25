package com.mvs.dao;

import com.mvs.model.Club;

import java.util.List;

/**
 * Created by quangminh on 11/08/2017.
 */
public interface ClubDAO extends IGenericDAO<Integer, Club> {
    Club findById(Integer id);

    Club findByName(String name);
}
