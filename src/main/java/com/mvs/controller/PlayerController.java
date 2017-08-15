package com.mvs.controller;

import com.mvs.bean.PlayerInfo;
import com.mvs.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by quangminh on 15/08/2017.
 */
@RestController
public class PlayerController {

    @Autowired
    PlayerService playerService;


    @RequestMapping(value = "/players/{id}", method = RequestMethod.GET)
    ResponseEntity<?> getPlayerById(
            @PathVariable(value = "id") int id

    ){
        PlayerInfo playerInfo=playerService.findById(id);
        return ResponseEntity.ok(playerInfo);
    }

}
