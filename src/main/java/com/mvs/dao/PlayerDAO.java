package com.mvs.dao;

import com.mvs.model.Player;

import java.util.List;

/**
 * Created by quangminh on 11/08/2017.
 */
public interface PlayerDAO extends IGenericDAO<Integer, Player> {
    Player getPlayerById(int id);

    List<Player> getAll();


}
