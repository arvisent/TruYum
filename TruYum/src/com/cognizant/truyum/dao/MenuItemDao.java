package com.cognizant.truyum.dao;
import java.util.*;
import com.cognizant.truyum.model.MenuItem;
public interface MenuItemDao {
	public List<MenuItem> getMenuItemListAdmin();
	public List<MenuItem> getMenuItemListCustomer();
	public void modifyMenuItem(MenuItem menuItem);
	public MenuItem getMenuItem(long menuItemId);

}


/*
+getMenuItemListAdmin(): List<MenuItem>
+getMenuItemListCustomer(): List<MenuItem>
+modifyMenuItem(menuItem: MenuItem): void
+getMenuItem(menuItemId: long): MenuItem
*/