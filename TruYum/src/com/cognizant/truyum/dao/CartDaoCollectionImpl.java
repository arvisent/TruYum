package com.cognizant.truyum.dao;
import java.util.HashMap;
import java.util.List;
import com.cognizant.truyum.model.Cart;
import com.cognizant.truyum.model.MenuItem;


public class CartDaoCollectionImpl implements CartDao {
	HashMap<Long,Cart> userCarts = new HashMap<>();
	public CartDaoCollectionImpl() {
		
	}
	@Override
	public void addCartItem(long userId, long menuItemId) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<MenuItem> getAllCartItems(long userId) throws CartEmptyException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeCartItem(long userId, long menuItemId) {
		// TODO Auto-generated method stub

	}

}


/*
-userCarts: HashMap<Long, Cart>
+CartDaoCollectionImpl()
+addCartItem(userId: long, menuItemId: long): void
+getAllCartItems(userId: long): List<MenuItem> raises CartEmptyException
+removeCartItem(userId: long, menuItemId: long): void

*/