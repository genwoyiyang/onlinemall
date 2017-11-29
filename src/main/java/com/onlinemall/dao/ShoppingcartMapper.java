package com.onlinemall.dao;

import com.onlinemall.pojo.Shoppingcart;

public interface ShoppingcartMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Shoppingcart record);

    int insertSelective(Shoppingcart record);

    Shoppingcart selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Shoppingcart record);

    int updateByPrimaryKey(Shoppingcart record);
}