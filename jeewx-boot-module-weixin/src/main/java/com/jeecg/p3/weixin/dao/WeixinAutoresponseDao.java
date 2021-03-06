package com.jeecg.p3.weixin.dao;

import com.jeecg.p3.weixin.entity.WeixinAutoresponse;
import org.apache.ibatis.annotations.Param;
import org.jeecgframework.p3.core.utils.common.PageQuery;
import org.jeecgframework.p3.core.utils.common.PageQueryWrapper;
import org.jeecgframework.p3.core.utils.persistence.GenericDao;

import java.util.List;

/**
 * 描述：</b>关键字表<br>
 * @author：LeeShaoQing
 * @since：2018年07月20日 10时11分12秒 星期五 
 * @version:1.0
 */
public interface WeixinAutoresponseDao extends GenericDao<WeixinAutoresponse>{
	
	public Integer count(PageQuery<WeixinAutoresponse> pageQuery);
	
	public List<WeixinAutoresponse> queryPageList(PageQueryWrapper<WeixinAutoresponse> wrapper);
	
	public List<WeixinAutoresponse> queryByJwid(@Param("jwid") String jwid);
	
}

