package Seller.Seller;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerRepository extends JpaRepository<Seller, Integer> {
    public Seller findSellerBySellerEmail(String sellerEmail);
    //public void deleteBuyerById(int buyer_id);
    public Seller findSellerById(int seller_id);
}
