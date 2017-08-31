package com.mvs.dao.impl;

import com.mvs.dao.ClubDAO;
import com.mvs.dao.GenericDAO;
import com.mvs.model.Club;
import com.mvs.model.Player;
import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SQLQuery;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by quangminh on 12/08/2017.
 */
public class ClubDAOImpl extends GenericDAO<Integer, Club> implements ClubDAO {
    private static final Logger logger = Logger.getLogger(ClubDAOImpl.class);

    public ClubDAOImpl() {
        super(Club.class);
    }

    @Override
    public Club findById(Integer id) {
        String hql = "SELECT * FROM Club AS C WHERE C.ID=:club_id";
        SQLQuery query = getSession().createSQLQuery(hql);
        query.addEntity(Club.class);
        query.setParameter("club_id", id);
        List result = query.list();
        for (Iterator iterator =
             result.iterator(); iterator.hasNext(); ) {
            Club club = (Club) iterator.next();
            return club;
        }
        return null;
    }

    @Override
    public Club findByName(String name) {
        List<Club> list = new ArrayList<>();
        String hql = "SELECT * FROM Club AS C WHERE C.NAME LIKE :club_name";
        SQLQuery query = getSession().createSQLQuery(hql);
        query.addEntity(Club.class);
        query.setParameter("club_name", "%" + name + "%");
        List result = query.list();
        for (Iterator iterator =
             result.iterator(); iterator.hasNext(); ) {
            Club club = (Club) iterator.next();
            return club;
        }
        return null;
    }
}
