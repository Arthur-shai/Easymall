package easymall.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import easymall.po.OrderItem;
import easymall.po.Orders;

@Repository("orderDao")
@Mapper
public interface OrderDao {
	//添加订单
	public void addOrder(Orders myOrder);
	//显示订单
	public List<Orders> findOrderByUserId(Integer user_id);
	//删除订单
	public void delorder(String id);
	//订单支付
	public void payorder(String id);
	
}
