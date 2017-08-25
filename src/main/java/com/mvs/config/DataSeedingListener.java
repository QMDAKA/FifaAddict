package com.mvs.config;


import com.mvs.bean.ClubInfo;
import com.mvs.bean.PlayerInfo;
import com.mvs.model.Club;
import com.mvs.model.Player;
import com.mvs.service.ClubService;
import com.mvs.service.PlayerService;
import com.mvs.ulti.ConvertBeanAndModel;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@Component
public class DataSeedingListener implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    PlayerService playerService;

    @Autowired
    ClubService clubService;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent arg0) {
        try {
            for (int i = 1; i <= 10; i++) {
                Document doc = Jsoup.connect("https://www.fifaindex.com/players/" + i + "/").timeout(7000).get();
                Elements elements = doc.select("#no-more-tables > table > tbody > tr > td:nth-child(1) > a");
                //add  new player and new club
                for (Element e : elements) {
                    String ptr = e.attr("abs:href");
                    AddNewClubAndPlayer(ptr);


                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    void AddNewClubAndPlayer(String url) {
        try {
            /// add new club if club not exist
            Element element = Jsoup.connect(url).timeout(7000).get();
            String nameClub = new String();
            try {
                nameClub = element.select("body > div.container.main > div:nth-child(3) > div.col-md-8 > div:nth-child(3) > div:nth-child(2) > div > div.panel-heading > h3 > a:nth-child(2)").html();
            } catch (Exception e) {
                nameClub = element.select("body > div.container.main > div:nth-child(3) > div.col-md-8 > div:nth-child(3) > div > div > div.panel-heading > h3 > a:nth-child(2)").html();
            }


            Club club = ConvertBeanAndModel.convertClubBeanToModel(clubService.findByName(nameClub));
            if (club == null) {
                club=new Club();
                club.setImage(element.select("body > div.container.main > div:nth-child(3) > div.col-md-8 > div:nth-child(3) > div:nth-child(2) > div > div.panel-heading > h3 > a:nth-child(1) > img").attr("abs:src"));
                club.setName(nameClub);
                //error with saveorUpdate
                clubService.addClub(club);
            }


            // add new player if player not exist
            Player player = new Player();
            player.setName(element.select("h2.media-heading").html());
            player.setAvatar(element.select("div.media-left.photo img").attr("abs:src"));
            player.setNation(element.select("h2.subtitle a").html());
            player.setAgility(Integer.parseInt(element.select("body > div.container.main > div:nth-child(3) > div.col-md-8 > div.row.grid > div:nth-child(6) > div > div.panel-body > p:nth-child(6) > span > span").html()));
            player.setSpeed(Integer.parseInt(element.select("body > div.container.main > div:nth-child(3) > div.col-md-8 > div.row.grid > div:nth-child(6) > div > div.panel-body > p:nth-child(5) > span > span").html()));
            player.setBallControl(Integer.parseInt(element.select("body > div.container.main > div:nth-child(3) > div.col-md-8 > div.row.grid > div:nth-child(1) > div > div.panel-body > p:nth-child(1) > span > span").html()));
            player.setFinishing(Integer.parseInt(element.select("body > div.container.main > div:nth-child(3) > div.col-md-8 > div.row.grid > div:nth-child(7) > div > div.panel-body > p:nth-child(3) > span > span").html()));
            player.setPositioning(Integer.parseInt(element.select("body > div.container.main > div:nth-child(3) > div.col-md-8 > div.row.grid > div:nth-child(3) > div > div.panel-body > p:nth-child(3) > span > span").html()));
            player.setLongShot(Integer.parseInt(element.select("body > div.container.main > div:nth-child(3) > div.col-md-8 > div.row.grid > div:nth-child(7) > div > div.panel-body > p:nth-child(4) > span > span").html()));
            player.setReaction(Integer.parseInt(element.select("body > div.container.main > div:nth-child(3) > div.col-md-8 > div.row.grid > div:nth-child(3) > div > div.panel-body > p:nth-child(2) > span > span").html()));
            player.setShootPower(Integer.parseInt(element.select("body > div.container.main > div:nth-child(3) > div.col-md-8 > div.row.grid > div:nth-child(7) > div > div.panel-body > p:nth-child(2) > span > span").html()));
            player.setVolley(Integer.parseInt(element.select("body > div.container.main > div:nth-child(3) > div.col-md-8 > div.row.grid > div:nth-child(7) > div > div.panel-body > p:nth-child(8) > span > span").html()));
            player.setTackle(Integer.parseInt(element.select("body > div.container.main > div:nth-child(3) > div.col-md-8 > div.row.grid > div:nth-child(2) > div > div.panel-body > p:nth-child(3) > span > span").html()));
            player.setMarking(Integer.parseInt(element.select("body > div.container.main > div:nth-child(3) > div.col-md-8 > div.row.grid > div:nth-child(2) > div > div.panel-body > p:nth-child(1) > span > span").html()));
            player.setStamina(Integer.parseInt(element.select("body > div.container.main > div:nth-child(3) > div.col-md-8 > div.row.grid > div:nth-child(6) > div > div.panel-body > p:nth-child(2) > span > span").html()));
            player.setBalance(Integer.parseInt(element.select("body > div.container.main > div:nth-child(3) > div.col-md-8 > div.row.grid > div:nth-child(6) > div > div.panel-body > p:nth-child(4) > span > span").html()));
            player.setGk(Integer.parseInt(element.select("body > div.container.main > div:nth-child(3) > div.col-md-8 > div.row.grid > div:nth-child(8) > div > div.panel-body > p:nth-child(1) > span > span").html()));
            player.setHeight(element.select("body > div.container.main > div:nth-child(3) > div.col-md-8 > div:nth-child(2) > div.col-lg-5.col-sm-6 > div > div.panel-body > p:nth-child(1) > span").html());
            player.setWeight(element.select("body > div.container.main > div:nth-child(3) > div.col-md-8 > div:nth-child(2) > div.col-lg-5.col-sm-6 > div > div.panel-body > p:nth-child(2) > span").html());
            player.setSituation(element.select("body > div.container.main > div:nth-child(3) > div.col-md-8 > div:nth-child(2) > div.col-lg-5.col-sm-6 > div > div.panel-body > p:nth-child(6) > span > a:nth-child(1) > span").html());

            club.getPlayers().add(player);

            player.setClub(club);

            playerService.addPlayer(player);
        } catch (IOException e) {
            System.out.println("error");
        }


    }

}
