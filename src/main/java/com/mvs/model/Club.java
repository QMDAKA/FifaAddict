package com.mvs.model;

import com.mvs.bean.ClubInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by quangminh on 08/08/2017.
 */
public class Club {
    private int id;
    private String name;
    private String image;
    private List<Player> players;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }


    public Club() {
        players = new ArrayList<Player>();
    }


    public Club(ClubInfo clubInfo) {
        players = new ArrayList<>();
        this.setId(clubInfo.getId());
        this.setName(clubInfo.getName());
        this.setImage(clubInfo.getImage());


    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
