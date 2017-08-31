package com.mvs.service;

import com.mvs.bean.PlayerInfo;
import com.mvs.model.Player;

/**
 * Created by quangminh on 12/08/2017.
 */
public interface PlayerService {
    PlayerInfo findById(int id);

    boolean addPlayer(PlayerInfo playerInfo);
    boolean addPlayer(Player player);
    boolean removePlayer(int id);

}
