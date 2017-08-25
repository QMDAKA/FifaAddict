package com.mvs.ulti;

import com.mvs.bean.ClubInfo;
import com.mvs.bean.PlayerInfo;
import com.mvs.model.Club;
import com.mvs.model.Player;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by quangminh on 14/08/2017.
 */
public class ConvertBeanAndModel {
    public static PlayerInfo convertPlayerModeltoBean(Player player) {
        if (player != null) {
            PlayerInfo playerInfo = new PlayerInfo(player);
            ///set clubinfo
            if (player.getClub() != null) {
                ClubInfo clubInfo = new ClubInfo();
                clubInfo.setName(player.getClub().getName());
                clubInfo.setId(player.getClub().getId());
                playerInfo.setClubInfo(clubInfo);
            }

            return playerInfo;

        }
        return null;
    }

    public static Player convertPlayerInfoBeanToModel(PlayerInfo playerInfo) {

        if (playerInfo != null) {
            Player player = new Player(playerInfo);

            if (playerInfo.getClubInfo() != null) {
                Club club = new Club();
                club.setId(playerInfo.getId());
                club.setName(playerInfo.getName());
                player.setClub(club);
            }
            return player;
        }
        return null;
    }

    public static ClubInfo convertClubModelToBean(Club club) {
        if (club != null) {
            ClubInfo clubInfo = new ClubInfo(club);
            if (club.getPlayers() != null) {
                List<PlayerInfo> playerInfoList = new ArrayList<>();
                for (Player player : club.getPlayers()) {
                    if (player != null) {
                        PlayerInfo playerInfo = new PlayerInfo(player);
                        playerInfoList.add(playerInfo);
                    }
                }
                clubInfo.setPlayerInfos(playerInfoList);
            }
            return clubInfo;
        }
        return null;
    }

    public static Club convertClubBeanToModel(ClubInfo clubInfo) {
        if (clubInfo != null) {
            Club club = new Club(clubInfo);

            if (clubInfo.getPlayerInfos() != null) {
                List<Player> playerList = new ArrayList<>();
                for (PlayerInfo playerInfo : clubInfo.getPlayerInfos()) {
                    if (playerInfo != null) {
                        Player player = new Player(playerInfo);
                        playerList.add(player);
                    }
                    club.setPlayers(playerList);
                }
            }
            return club;
        }
        return null;
    }

}
