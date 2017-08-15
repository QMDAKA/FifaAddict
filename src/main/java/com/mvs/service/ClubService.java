package com.mvs.service;

import com.mvs.bean.ClubInfo;

/**
 * Created by quangminh on 12/08/2017.
 */
public interface ClubService {
    ClubInfo findById(int id);

    boolean addClub(ClubInfo clubInfo);

    boolean removeClub(int id);

}
