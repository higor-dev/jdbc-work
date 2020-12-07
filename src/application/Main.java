package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Main method.");
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		Department department = new Department(null, 2);
		List<Seller> list = sellerDao.findAll();
		
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
	}

}
