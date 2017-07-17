package com.qk.module.font.biz.web;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.qk.core.framework.BaseController;
import com.qk.core.framework.dto.ResultObj;
import com.qk.module.font.biz.entity.Book;
import com.qk.module.font.biz.service.BookService;
@Controller
@RequestMapping("/font/book") // url:/模块/资源/{id}/细分 /seckill/list

public class BookController extends BaseController{

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private BookService bookService;

	/**
	 * 查询列表
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	@ResponseBody
	private ResultObj list(Model model) {
		List<Book> list = bookService.getList();
		return success(list);
	}
	
	/**
	 * 查询列表
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	@ResponseBody
	private ResultObj insert(@RequestBody Book book) {
		int i = bookService.insert(book);
		return success();
	}
	
	/**
	 * 查询列表
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	@ResponseBody
	private ResultObj update(@RequestBody Book book) {
		return success(bookService.update(book));
	}
	
	
	
	/**
	 * 查询列表
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/page", method = RequestMethod.GET)
	@ResponseBody
	private List<Book> page(Model model) {
		List<Book> list = bookService.getList();
		String jsonStr=JSON.toJSONString(list);
		logger.info(jsonStr);
		return list;
	}

	/**
	 * 查询当个数据
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/getById/{bookId}", method = RequestMethod.GET)
	@ResponseBody
	private ResultObj getById(@PathVariable("bookId") Long bookId) {
		Book book = bookService.getById(bookId);
		return success(book);
	}
	
	/**
	 * 查询当个数据
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/delete/{bookId}", method = RequestMethod.GET)
	@ResponseBody
	private ResultObj deleteById(@PathVariable("bookId") Long bookId) {
		return  success(bookService.deleteById(bookId));
	}


}
