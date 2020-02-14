package com.cognizant.truyum.dao;

import java.text.ParseException;
import java.util.*;

import com.cognizant.truyum.model.MenuItem;
import com.cognizant.truyum.util.DateUtil;
import java.util.Date;

public class MenuItemDaoCollectionImpl implements MenuItemDao {
	private static List<MenuItem> menuItemL;
	public MenuItemDaoCollectionImpl() throws ParseException{
		if(menuItemL==null) {
			menuItemL = new ArrayList<MenuItem>();
			Date d = DateUtil.convertToDate("15/03/2017");
			menuItemL.add(new MenuItem(154782, "Sandwich", "Main Course", 99, true, true, d));
			
			d = DateUtil.convertToDate("23/12/2017");
			menuItemL.add(new MenuItem(875469, "Burger", "Main Course", 129, true, false, d));
			
			d = DateUtil.convertToDate("21/08/2018");
			menuItemL.add(new MenuItem(587654, "Pizza", "Main Course", 149, true, false, d));
			
			d = DateUtil.convertToDate("02/07/2017");
			menuItemL.add(new MenuItem(756325, "French Fries", "Starters", 57, false, true, d));
			
			d = DateUtil.convertToDate("02/11/2022");
			menuItemL.add(new MenuItem(689529, "Burger", "Dessert", 32, true, true, d));
			
		}
	}
	@Override
	public List<MenuItem> getMenuItemListAdmin() {
		// TODO Auto-generated method stub
		return menuItemL;
	}

	@Override
	public List<MenuItem> getMenuItemListCustomer() {
		// TODO Auto-generated method stub
		List<MenuItem> menuItemCustomer = new ArrayList<MenuItem>();
		Date today = new Date();
		for(MenuItem m:menuItemL) {
			if(m.getDateOfLaunch().getTime()<= today.getTime() && m.isActive())
				menuItemCustomer.add(m);
		}
		return menuItemCustomer;
	}

	@Override
	public void modifyMenuItem(MenuItem menuItem) {
		// TODO Auto-generated method stub
		List<MenuItem> menuItemList = new ArrayList<>();
		for(MenuItem m:menuItemL) {
			if(m.equals(menuItem)) {
				menuItemList.add(menuItem);
				break;
			}
		}
	}

	@Override
	public MenuItem getMenuItem(long menuItemId) {
		// TODO Auto-generated method stub
		MenuItem res = null;
		for(MenuItem m:menuItemL) {
			if(m.getId()==menuItemId) {
				res=m;
			}
	}
		return res;
	}
}

