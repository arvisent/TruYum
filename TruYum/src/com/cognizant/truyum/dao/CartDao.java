package com.cognizant.truyum.dao;
import java.util.*;
import com.cognizant.truyum.model.MenuItem;
public interface CartDao {
	public void addCartItem(long userId, long menuItemId);
	public List<MenuItem> getAllCartItems(long userId) throws CartEmptyException;
	public void removeCartItem(long userId, long menuItemId);
}


/*
+addCartItem(userId: long, menuItemId: long): void
+getAllCartItems(userId: long): List<MenuItem> raises CartEmptyException
+removeCartItem(userId: long, menuItemId: long): void
*/