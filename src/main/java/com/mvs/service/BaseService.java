package com.mvs.service;

import java.io.Serializable;

import com.mvs.dao.ClubDAO;
import com.mvs.dao.PlayerDAO;

/**
 * Created by quangminh on 15/08/2017.
 */
public interface BaseService {
    PlayerDAO getPlayerDAO();

    ClubDAO getClubDAO();

}
