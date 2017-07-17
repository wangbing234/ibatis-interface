package com.qk.module.font.biz.service;

import java.util.List;

import com.qk.module.font.biz.entity.Book;

/**
 * 业务接口：站在"使用者"角度设计接口 三个方面：方法定义粒度，参数，返回类型（return 类型/异常）
 */
public interface BookService {

	/**
	 * 查询一本图书
	 * 
	 * @param bookId
	 * @return
	 */
	Book getById(long bookId);

	/**
	 * 查询所有图书
	 * 
	 * @return
	 */
	List<Book> getList();
	
	/**
	 * 删除数据
	 * 
	 * @return
	 */
	int deleteById(long id);
	
	/**
	 * 增加数据
	 * 
	 * @return
	 */
	int insert(Book book);
	
	/**
	 * 修改数据
	 * 
	 * @return
	 */
	int update(Book book);
	


}
