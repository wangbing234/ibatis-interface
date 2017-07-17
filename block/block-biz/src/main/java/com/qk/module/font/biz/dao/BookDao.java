package com.qk.module.font.biz.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.qk.module.font.biz.entity.Book;

public interface BookDao {

	/**
	 * 通过id获取
	 * @param id
	 * @return
	 */
	Book getById(long id);
	
	/**
	 * 插入数据
	 * @param id
	 * @return
	 */
	int insert(Book book);
	
	/**
	 * 更新数据
	 * @param id
	 * @return
	 */
	int update(Book book);

	/**
	 * 删除数据
	 * @param id
	 * @return
	 */
	int deleteById(long id);
	
	/**
	 * 分页查询
	 * @param id
	 * @return
	 */
	int page(Book book);
	
	/**
	 * 分页查询
	 * @param id
	 * @return
	 */
	List<Book> getList(@Param("offset") int offset, @Param("limit") int limit);

}
