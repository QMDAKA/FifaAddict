package com.mvs.dao.impl;

import com.mvs.dao.ClubDAO;
import com.mvs.dao.GenericDAO;
import com.mvs.model.Club;
import org.apache.log4j.Logger;
import org.hibernate.Query;

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
        String hql = "SELECT * FROM Club AS C WHERE C.ID=" + id + "";
        Query query = getSession().createQuery(hql);


        return null;
    }
}
