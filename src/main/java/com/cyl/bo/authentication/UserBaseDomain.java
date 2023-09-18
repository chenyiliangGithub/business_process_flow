package com.cyl.bo.authentication;

import tmp.event.enums.audit.CHANNEL;
import tmp.event.enums.audit.CORPORATION_LEVEL;
import tmp.event.enums.audit.OPERATOR_IDENTITY;

/**
 * 鉴权域
 * 域之间的关系，例如当前角色处于域A，能看见域B、C...的数据
 * 一个可以穷举的表，可以用缓存避免频繁查表
 *  看查询要求，也可能这个表不用缓存，另外的表要
 */
public class UserBaseDomain {
    String id;

    // 复合索引，或者在内存中维护 id,四元组 的映射
    // 落库的话可以提供接口实时更新，硬编码到代码里的话做不到
    // 但是这个数据好像不需要更新，直观上应该更新的是审核配置
    String corporationIdTopLevelId; // 集团主键
    CORPORATION_LEVEL operatorCorporationLevel;
    OPERATOR_IDENTITY operatorIdentity;
    CHANNEL channel;

    // 指定公司、个人的话需要创建一个新的记录。这个移到与business相关？避免污染表定义
    String
}
