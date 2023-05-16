package com.atguigu.spring6.tx.service;

import com.atguigu.spring6.tx.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.concurrent.TimeUnit;

@Service
@Transactional(propagation = Propagation.REQUIRES_NEW)
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;

    //买书方法
    @Override
    public void buyBook(Integer bookId, Integer userId) {
        //TODO 模拟超时(timeout)
//        try {
//            TimeUnit.SECONDS.sleep(5);
//        }catch (Exception e){
//            e.printStackTrace();
//        }

        //根据图书id查询图书价格
        Integer price = bookDao.getBookPriceByBookId(bookId);
        //更新图书表库存量 -1
        bookDao.updateStock(bookId);
        //更新用户表用户余额 -图书价格
        bookDao.updateUserBalance(userId, price);
//        System.out.println(1/0);/*noRollbackFor = ArithmeticException.class*/
    }
}
