package com.mvs.ulti;

import com.mvs.bean.ClubInfo;
import com.mvs.bean.PlayerInfo;
import com.mvs.model.Player;

/**
 * Created by quangminh on 14/08/2017.
 */
public class ConvertBeanAndModel {
    public static PlayerInfo convertPlayerInfoBeanToModel(Player player) {
        if (player != null) {
            PlayerInfo playerInfo = new PlayerInfo();
            playerInfo.setId(player.getId());
            playerInfo.setAvatar(player.getAvatar());
            playerInfo.setAgility(player.getAgility());
            playerInfo.setName(player.getName());
            playerInfo.setNation(player.getNation());
            playerInfo.setSituation(player.getSituation());
            playerInfo.setSpeed(player.getSpeed());

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
}
