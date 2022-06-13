package cn.ymxdy;

import cn.ymxdy.entity.User;
import cn.ymxdy.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@SpringBootTest
class BootMyabtisPlusApplicationTests {
    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {
        //User user = userMapper.selectById("1517882657060974593");
        //System.out.println(user);
        ArrayList<String> list = new ArrayList<>();
        list.add("1517882657060974593");
        list.add("1517390049717104642");

        List<User> ids = userMapper.getIds(list);
        System.out.println(ids);
    }

    @Test
    public void mapTest(){
        HashMap<String, String> map = new HashMap<>();
        map.put("张三","北京");
        map.put("李四","南京");
        map.put("王五","东京");
        userMapper.insertBatch(map);
    }
    @Test
    public void objectTest(){
        User user = new User("周七","江苏");
        User user1 = new User("赵六", "湖北");
        ArrayList<User> list = new ArrayList<>();
        list.add(user);
        list.add(user1);
        userMapper.objectInsert(list);

    }

}
