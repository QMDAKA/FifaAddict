package com.mvs.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by quangminh on 08/08/2017.
 */
public class Club {
    private long id;
    private String name;
    private List<Player> players;

    public Club() {
        players=new ArrayList<Player>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }
}
