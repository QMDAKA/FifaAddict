package com.mvs.service;

import com.mvs.bean.ClubInfo;
import com.mvs.model.Club;

import java.util.List;

import java.util.List;

/**
 * Created by quangminh on 12/08/2017.
 */
public interface ClubService {
    ClubInfo findById(int id);

    ClubInfo findByName(String name);
    boolean addClub(ClubInfo clubInfo);
    boolean addClub(Club club);
    boolean removeClub(int id);

}
