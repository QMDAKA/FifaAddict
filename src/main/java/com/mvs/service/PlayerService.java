package com.mvs.service;

import com.mvs.bean.PlayerInfo;

/**
 * Created by quangminh on 12/08/2017.
 */
public interface PlayerService {
    PlayerInfo findById(int id);

    boolean addPlayer(PlayerInfo playerInfo);

    boolean removePlayer(int id);

}
