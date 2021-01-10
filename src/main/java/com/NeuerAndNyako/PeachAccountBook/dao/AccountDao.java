package com.NeuerAndNyako.PeachAccountBook.dao;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.NeuerAndNyako.PeachAccountBook.entity.AccountItem;
import com.NeuerAndNyako.PeachAccountBook.entity.ItemType;

@Service(value="accountDao")
public class AccountDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	public List<AccountItem> getAccounts(int page, int pageSize) {
		String sql = "SELECT * FROM ALL_ACCOUNT_ITEM LIMIT :pageSize OFFSET :startNum";
		Query query = entityManager.createNativeQuery(sql, AccountItem.class);
		query.setParameter("pageSize", pageSize);
		query.setParameter("startNum", (page - 1) * pageSize);
		@SuppressWarnings("unchecked")
		List<AccountItem> result = (List<AccountItem>) query.getResultList();
		return result;
	}
	
	public int getAccountTotalNum() {
		String sql = "SELECT COUNT(1) FROM ALL_ACCOUNT_ITEM";
		Query query = entityManager.createNativeQuery(sql);
		@SuppressWarnings("unchecked")
		List<BigInteger> result = query.getResultList();
		return ((BigInteger)result.get(0)).intValue();
	}
	
	public Map<Integer,String> getAllItemType(){
		String sql = "SELECT * FROM ITEM_TYPE WHERE I_EXIST = 1";
		Query query = entityManager.createNativeQuery(sql, ItemType.class);
		@SuppressWarnings("unchecked")
		List<ItemType> queryResult = (List<ItemType>)query.getResultList();
		Map<Integer,String> result = new TreeMap<>();
		if(!CollectionUtils.isEmpty(queryResult)) {
			for(ItemType item : queryResult) {
				result.put(item.getTypeId(), item.getTypeName());
			}
		}
		return result;
	}
}
