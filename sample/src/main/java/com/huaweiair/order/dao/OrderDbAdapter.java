
package com.huaweiair.order.dao;

import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.huaweiair.order.model.Order;

public interface OrderDbAdapter {
  boolean insertOrder(Order order);

  Order[] queryOrders(String userId);

  boolean updateOrder(String orderId, int action);

  boolean deleteOrder(String orderId);


  default List<Object> populate(ResultSet rs, Class<?> clazz)
      throws SQLException, InstantiationException, IllegalAccessException {
    ResultSetMetaData rsmd = rs.getMetaData();
    int colCount = rsmd.getColumnCount();
    List<Object> list = new ArrayList<Object>();
    Field[] fields = clazz.getDeclaredFields();
    while (rs.next()) {
      Object obj = clazz.newInstance();
      for (int i = 1; i <= colCount; i++) {
        Object value = rs.getObject(i);
        for (int j = 0; j < fields.length; j++) {
          Field f = fields[j];
          if (f.getName().equalsIgnoreCase(rsmd.getColumnName(i))) {
            boolean flag = f.isAccessible();
            f.setAccessible(true);
            f.set(obj, value);
            f.setAccessible(flag);
          }
        }
      }
      list.add(obj);
    }
    return list;
  }
}
