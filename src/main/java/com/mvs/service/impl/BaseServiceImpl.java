package com.mvs.service.impl;

import com.mvs.dao.ClubDAO;
import com.mvs.dao.PlayerDAO;
import com.mvs.service.BaseService;

/**
 * Created by quangminh on 15/08/2017.
 */
public class BaseServiceImpl implements BaseService {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    protected PlayerDAO playerDAO;
    protected ClubDAO clubDAO;

    @Override
    public PlayerDAO getPlayerDAO() {
        return playerDAO;
    }

    @Override
    public ClubDAO getClubDAO() {
        return clubDAO;
    }

    public void setPlayerDAO(PlayerDAO playerDAO) {
        this.playerDAO = playerDAO;
    }

    public void setClubDAO(ClubDAO clubDAO) {
        this.clubDAO = clubDAO;
    }
}
