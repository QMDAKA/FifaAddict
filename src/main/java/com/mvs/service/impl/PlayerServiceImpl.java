package com.mvs.service.impl;

import com.mvs.bean.PlayerInfo;
import com.mvs.model.Player;
import com.mvs.service.PlayerService;
import com.mvs.ulti.ConvertBeanAndModel;
import org.apache.log4j.Logger;

/**
 * Created by quangminh on 12/08/2017.
 */
public class PlayerServiceImpl extends BaseServiceImpl implements PlayerService {
    private static final Logger logger = Logger.getLogger(PlayerServiceImpl.class);

    @Override
    public PlayerInfo findById(int id) {
        Player player = getPlayerDAO().getPlayerById(id);
        return ConvertBeanAndModel.convertPlayerModeltoBean(player);
    }

    @Override
    public boolean addPlayer(PlayerInfo playerInfo) {
        try {
            Player player = ConvertBeanAndModel.convertPlayerInfoBeanToModel(playerInfo);
            getPlayerDAO().saveOrUpdate(player);
            return true;
        } catch (Exception e) {
        return false;
        }
    }

    @Override
    public boolean addPlayer(Player player) {
        try {
            getPlayerDAO().saveOrUpdate(player);
            return true;
        } catch (Exception e) {
            return false;
        }
    }


    @Override
    public boolean removePlayer(int id) {
        return false;
    }
}
