package com.mvs.service.impl;

import com.mvs.bean.ClubInfo;
import com.mvs.model.Club;
import com.mvs.service.ClubService;
import com.mvs.ulti.ConvertBeanAndModel;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by quangminh on 12/08/2017.
 */
public class ClubServiceImpl extends BaseServiceImpl implements ClubService {
    private static final Logger logger = Logger.getLogger(ClubServiceImpl.class);


    @Override
    public ClubInfo findById(int id) {
        Club club = getClubDAO().findById(id);
        return ConvertBeanAndModel.convertClubModelToBean(club);
    }

    @Override
    public ClubInfo findByName(String name) {
        Club club = getClubDAO().findByName(name);
        if (club != null) {
            ClubInfo clubInfo = new ClubInfo(club);
            return clubInfo;
        } else {
            return null;
        }

    }

    @Override
    public boolean addClub(ClubInfo clubInfo) {

        try {
            Club club = ConvertBeanAndModel.convertClubBeanToModel(clubInfo);
            getClubDAO().saveOrUpdate(club);
            return true;
        } catch (Exception e) {
            return false;

        }

    }
    @Override
    public boolean addClub(Club club) {

        try {
            getClubDAO().saveOrUpdate(club);
            return true;
        } catch (Exception e) {
            return false;

        }

    }
    @Override
    public boolean removeClub(int id) {
        return false;
    }
}
