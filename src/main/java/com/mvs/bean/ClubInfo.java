package com.mvs.bean;

import java.util.ArrayList;
import java.util.List;

import com.mvs.model.Club;
import com.mvs.model.Player;

/**
 * Created by quangminh on 08/08/2017.
 */
public class ClubInfo {
    private int id;
    private String name;
    private String image;

    private List<PlayerInfo> playerInfos;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public ClubInfo() {
        this.playerInfos = new ArrayList<>();
    }

    public ClubInfo(Club club) {
        this.playerInfos = new ArrayList<>();

        this.setId(club.getId());
        this.setImage(club.getImage());
        this.setName(club.getName());
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

    public List<PlayerInfo> getPlayerInfos() {
        return playerInfos;
    }

    public void setPlayerInfos(List<PlayerInfo> playerInfos) {
        this.playerInfos = playerInfos;
    }


}
