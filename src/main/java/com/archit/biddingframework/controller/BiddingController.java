package com.archit.biddingframework.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(
    path = "/v1/auctions")
public class BiddingController {

  /**
   * Retrieve auctions
   *
   *
   * @return latest view of the auctions.
   */
  @GetMapping
  public ResponseEntity<List<String>> retrieveAuctions() {
    List<String> auctions = new ArrayList<>();
    auctions.addAll(Arrays.asList("honda civic", "honda city"));
    return new ResponseEntity<>(auctions, HttpStatus.OK);
  }

}
