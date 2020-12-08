package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Main method.");
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		Department dep = new Department(null, 2);
		List<Seller> list = sellerDao.findAll();
		
		
		Seller newSeller = new Seller(null, "Grego", "greg@gmail", new Date(), 4000.0, dep);

		sellerDao.insert(newSeller);
		
		Seller seller = sellerDao.findById(1);
		
		seller.setName("Martha");
		sellerDao.update(seller);
		
		
		System.out.println(seller);
		
		
	}

}
