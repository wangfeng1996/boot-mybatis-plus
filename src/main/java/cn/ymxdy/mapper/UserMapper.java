package cn.ymxdy.mapper;

import cn.ymxdy.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author wf
 * @date 2022/6/13 10:22
 * @description
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
    /**
     * 根据id查询用户的信息
     *
     * @param id
     * @return
     */
    User selectById(@Param("id") String id);

    /**
     * ids 获取用户的信息
     *
     * @param ids
     * @return
     */
    List<User> getIds(@Param("ids") List<String> ids);

    /**
     * 批量添加
     *
     * @param map
     */
    void insertBatch(@Param("map") HashMap<String, String> map);

    /**
     * 对象批量添加
     *
     * @param list
     */
    void objectInsert(@Param("list") ArrayList<User> list);
}
