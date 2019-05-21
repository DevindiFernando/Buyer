package com.buyernew.util.buyer;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BuyerRepository extends JpaRepository<Buyer, Integer> {

    public Buyer findBuyerByBuyerEmail(String buyerEmail);
    //public void deleteBuyerById(int buyer_id);
    public Buyer findBuyerById(int buyer_id);
}
