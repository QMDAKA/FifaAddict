package com.mvs.dao.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.SQLQuery;

import com.mvs.dao.GenericDAO;
import com.mvs.dao.PlayerDAO;
import com.mvs.model.Player;

/**
 * Created by quangminh on 14/08/2017.
 */
@SuppressWarnings("serial")
public class PlayerDAOImpl extends GenericDAO<Integer, Player> implements PlayerDAO {
    @Override
    public Player getPlayerById(int id) {
        String hql = "SELECT * FROM Player AS P WHERE P.ID =:player_id ";
        SQLQuery query = getSession().createSQLQuery(hql);
        query.addEntity(Player.class);
        query.setParameter("player_id", id);
        List result = query.list();
        for (Iterator iterator =
             result.iterator(); iterator.hasNext(); ) {
            Player player = (Player) iterator.next();
            return player;
        }
        return null;
    }

    @Override
    public List<Player> getAll() {
        List<Player> players = new ArrayList<>();
        String hql = "SELECT * FROM Player ";
        SQLQuery query = getSession().createSQLQuery(hql);
        query.addEntity(Player.class);
        List result = query.list();
        for (Iterator iterator =
             result.iterator(); iterator.hasNext(); ) {
            Player player = (Player) iterator.next();
            players.add(player);
        }
        return players;
    }
}
