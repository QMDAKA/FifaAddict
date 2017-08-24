package com.mvs.service;

import com.mvs.bean.ClubInfo;

import java.util.List;

/**
 * Created by quangminh on 12/08/2017.
 */
public interface ClubService {
    ClubInfo findById(int id);

    ClubInfo findByName(String name);
    boolean addClub(ClubInfo clubInfo);

    boolean removeClub(int id);

}
