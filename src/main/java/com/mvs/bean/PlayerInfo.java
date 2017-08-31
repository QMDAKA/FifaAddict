package com.mvs.bean;

import com.mvs.model.Player;

/**
 * Created by quangminh on 08/08/2017.
 */
public class PlayerInfo {
    private int id;
    private String name;
    private String avatar;
    private String situation;
    private String nation;
    private int speed;
    private int agility;
    private int ballControl;
    private int finishing;
    private int positioning;
    private int longShot;
    private int reaction;
    private String height;
    private String weight;
    private int shootPower;
    private int volley;
    private int tackle;
    private int marking;
    private int stamina;
    private int balance;
    private int gk;

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public int getBallControl() {
        return ballControl;
    }

    public void setBallControl(int ballControl) {
        this.ballControl = ballControl;
    }

    public int getFinishing() {
        return finishing;
    }

    public void setFinishing(int finishing) {
        this.finishing = finishing;
    }

    public int getPositioning() {
        return positioning;
    }

    public void setPositioning(int positioning) {
        this.positioning = positioning;
    }

    public int getLongShot() {
        return longShot;
    }

    public void setLongShot(int longShot) {
        this.longShot = longShot;
    }

    public int getReaction() {
        return reaction;
    }

    public void setReaction(int reaction) {
        this.reaction = reaction;
    }

    public int getShootPower() {
        return shootPower;
    }

    public void setShootPower(int shootPower) {
        this.shootPower = shootPower;
    }

    public int getVolley() {
        return volley;
    }

    public void setVolley(int volley) {
        this.volley = volley;
    }

    public int getTackle() {
        return tackle;
    }

    public void setTackle(int tackle) {
        this.tackle = tackle;
    }

    public int getMarking() {
        return marking;
    }

    public void setMarking(int marking) {
        this.marking = marking;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getGk() {
        return gk;
    }

    public void setGk(int gk) {
        this.gk = gk;
    }


    public ClubInfo getClubInfo() {
        return clubInfo;
    }

    public void setClubInfo(ClubInfo clubInfo) {
        this.clubInfo = clubInfo;
    }

    private ClubInfo clubInfo;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getSituation() {
        return situation;
    }

    public void setSituation(String situation) {
        this.situation = situation;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }



    public PlayerInfo() {
    }

    public PlayerInfo(Player player) {
        this.name = player.getName();
        this.agility = player.getAgility();
        this.avatar = player.getAvatar();
        this.id = player.getId();
        this.nation = player.getNation();
        this.situation = player.getSituation();
        this.speed = player.getSpeed();
        this.ballControl = player.getBallControl();
        this.finishing = player.getFinishing();
        this.positioning = player.getPositioning();
        this.longShot = player.getLongShot();
        this.reaction = player.getReaction();
        this.shootPower = player.getShootPower();
        this.volley = player.getVolley();
        this.tackle = player.getTackle();
        this.marking = player.getMarking();
        this.stamina = player.getStamina();
        this.balance = player.getBalance();
        this.gk = player.getGk();
        this.height = player.getHeight();
        this.weight = player.getWeight();
    }
}
