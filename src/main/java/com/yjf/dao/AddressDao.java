package com.yjf.dao;

import com.yjf.entity.Address;
import org.apache.ibatis.annotations.Select;

/**
 * @author 余俊锋
 * @date 2020/10/10 18:01
 * @Description
 */
public interface AddressDao {

    /*@Select("select * from address where address_id=#{id}")*/
    Address getAddressById(Integer id);
}
