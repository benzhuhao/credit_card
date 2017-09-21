package com.credit_card;


import com.credit_card.user.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/1.0")
public class Services {


    @RequestMapping(value = "/user",
                    method = RequestMethod.POST)
    public ResponseEntity createUser(@RequestParam(name = "id") int id,
                                @RequestParam(name = "userName") String userName,
                                @RequestParam(name = "password") String pw,
                                @RequestParam(name = "isAdmin") boolean isAdmin) {

        User u = new User(id, userName, pw, isAdmin);
        return new ResponseEntity(u, HttpStatus.CREATED);
    }



}
