package com.jdonado.business.reservation;

import com.jdonado.business.reservation.domain.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class RoomReservationController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping
    public List<Room> getAllRooms(){

    }

}
