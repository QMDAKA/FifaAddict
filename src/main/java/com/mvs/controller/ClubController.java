package com.mvs.controller;

import com.mvs.bean.ClubInfo;
import com.mvs.bean.PlayerInfo;
import com.mvs.model.Club;
import com.mvs.service.ClubService;
import com.mvs.ulti.ConvertBeanAndModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by quangminh on 17/08/2017.
 */
@RestController
public class ClubController {

    @Autowired
    ClubService clubService;


    @RequestMapping(value = "/clubs/{id}", method = RequestMethod.GET)
    ResponseEntity<?> getClubById(@PathVariable(value = "id") int id

    ) {
        ClubInfo clubInfo = clubService.findById(id);
        return ResponseEntity.ok(clubInfo);
    }

    @RequestMapping(value = "/clubs", method = RequestMethod.POST)
    ResponseEntity<?> addNewClub(
            @RequestBody ClubInfo clubInfo

    ) {
        boolean check = clubService.addClub(clubInfo);
        return ResponseEntity.ok(check);
    }


    @RequestMapping(value = "/clubs", method = RequestMethod.GET)
    ResponseEntity<?> getClubByName(
            @RequestParam(value = "name", required = false, defaultValue = "0") String name

    ) {
        ClubInfo clubInfoList = clubService.findByName(name);
        return ResponseEntity.ok(clubInfoList);
    }

}
