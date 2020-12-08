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
		
		sellerDao.deleteById(9);
		
	
	}

}
