package com.cognizant.truyum.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import com.cognizant.truyum.model.MenuItem;

public class MenuItemDaoCollectionImplTest {
	public static void main(String [] args) throws ParseException {
		testGetMenuItemListCustomer();
	}
	public void testGetMenuItemListAdmin() throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		MenuItemDaoCollectionImpl menuItemDao = new MenuItemDaoCollectionImpl();
		List<MenuItem> menuItem = menuItemDao.getMenuItemListAdmin();
		for(MenuItem m:menuItem) {
			System.out.println(m.getId() + "\t" + m.getName() + "\t" + m.getPrice() + "\t" + m.isActive() + "\t" + sdf.format(m.getDateOfLaunch()) + "\t"+m.getCategory() + "\t" + m.isFreeDelivery());
		}
		
	}
	public static void testGetMenuItemListCustomer() throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		MenuItemDaoCollectionImpl MenuItemDao = new MenuItemDaoCollectionImpl();
		List<MenuItem> menuItemList = MenuItemDao.getMenuItemListCustomer();
		for(MenuItem m:menuItemList) {
			System.out.println(m.getId() + "\t" + m.getName() + "\t" + m.getPrice() + "\t" + m.isActive() + "\t" + sdf.format(m.getDateOfLaunch()) + "\t"+m.getCategory() + "\t" + m.isFreeDelivery());
		}
	}
	public static void testModifyMenuItem() throws ParseException {
		MenuItemDaoCollectionImpl MenuItemDao = new MenuItemDaoCollectionImpl();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ID");
		long id = Long.parseLong(sc.nextLine());
		MenuItem m = MenuItemDao.getMenuItem(id);
		if(m==null) {
			System.out.println("Invalid id");
		}
		else {
SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			
			System.out.println("Enter name, price, active, date of launch, category, free delivery");
			String name = sc.nextLine();
			m.setName(name);
			float price = Float.parseFloat(sc.nextLine());
			m.setPrice(price);
			boolean active = Boolean.parseBoolean(sc.nextLine());
			m.setActive(active);
			Date dt = sdf.parse(sc.nextLine());
			m.setDateOfLaunch(dt);
			String cate = sc.nextLine();
			m.setCategory(cate);
			boolean frDe = Boolean.parseBoolean(sc.nextLine());
			m.setFreeDelivery(frDe);
			
			MenuItemDao.modifyMenuItem(m);
			
			m = MenuItemDao.getMenuItem(id);
			System.out.println("\nAfter modifying : \n");
			System.out.println(m.getId() + "\t" + m.getName() + "\t" + m.getPrice() + "\t" + m.isActive() + "\t" + sdf.format(m.getDateOfLaunch()) + "\t"+m.getCategory() + "\t" + m.isFreeDelivery());

		}
		sc.close();
	}
	public void testGetMenuItem() {
		
	}

}
