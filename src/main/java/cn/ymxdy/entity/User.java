package cn.ymxdy.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author wf
 * @date 2022/6/13 10:20
 * @description
 */
@Data
@TableName("tb_user")
public class User {
    @TableId(value = "id", type = IdType.AUTO)
    private String id;
    private String userName;
    private String address;


    public User(String userName, String address) {
        this.userName = userName;
        this.address = address;
    }
}
