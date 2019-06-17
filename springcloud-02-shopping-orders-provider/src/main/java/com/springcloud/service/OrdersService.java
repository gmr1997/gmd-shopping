package com.springcloud.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.springcloud.entity.Orders;

/**
 * 订单模块模型层接口，用于定义订单模块的方法
 * 
 * @author GanMingRan
 *
 */
public interface OrdersService {

	/**
	 * 查询满足条件的订单信息（分页功能）
	 * 
	 * @param order 查询条件
	 * @param pageNumber 页数
	 * @return 返回com.github.pagehelper.PageInfo<Orders>类型的实例
	 */
	public abstract PageInfo<Orders> selectOrders(Orders order, Integer pageNumber);
	
	/**
	 * 修改制定编号的订单信息
	 * 
	 * @param orders 修改的订单的信息
	 * @return 成功返回大于0的数，否则返回小于0的数
	 */
	public abstract Integer updateOrdersStatus(Orders orders);

	/**
	 * 查询指定时间范围内的销售额
	 * 
	 * @param orders
	 * @return
	 */
	public abstract List<Orders> selectGroup(Orders orders);
}
