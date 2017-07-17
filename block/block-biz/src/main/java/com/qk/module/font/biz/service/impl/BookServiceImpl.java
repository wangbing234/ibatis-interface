package com.qk.module.font.biz.service.impl;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qk.module.font.biz.dao.BookDao;
import com.qk.module.font.biz.entity.Book;
import com.qk.module.font.biz.service.BookService;

@Service
@Transactional
public class BookServiceImpl implements BookService {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	// 注入Service依赖
	@Autowired
	private BookDao bookDao;


	public Book getById(long bookId) {
		return bookDao.getById(bookId);
	}

	public List<Book> getList() {
		return bookDao.getList(0, 1000);
	}

	@Override
	public int deleteById(long id) {
		return bookDao.deleteById(id);
	}

	@Override
	public int insert(Book book) {
		// TODO Auto-generated method stub
		return bookDao.insert(book);
	}

	@Override
	public int update(Book book) {
		return bookDao.update(book);
	}


}
