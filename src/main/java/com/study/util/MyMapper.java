package com.study.util;

/**
* @Author: My.PanYang
* @Date: 17:29 2018/10/26
* @Description: 
*/
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
    //TODO
    //FIXME 特别注意，该接口不能被扫描到，否则会出错
}

