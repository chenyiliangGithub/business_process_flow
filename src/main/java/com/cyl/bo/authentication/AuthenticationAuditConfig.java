package com.cyl.bo.authentication;

import tmp.event.enums.audit.BUSINESS_TYPE;
import tmp.event.enums.audit.CHANNEL;

/**
 * 流程不复杂，可以用数据库存储
 * 流程复杂，涉及条件转移，只能存基本数据。如果是 域映射 这样的条件，那么也可以。例如 (三级企业，经办岗，移动端） -> (xxx)，(三级企业，经办岗，企业端） -> (xxx)
 *
 *
 * 鉴权配置：读权限、写（Event）权限，共用 继承
 * todo:选择默认或企业自定义。
 * 法1：先查询开关，再查询(businessType, channel)或者(businessType, channel, corId)，否，不如下面那个合理
 * 法2：每次先查询(businessType, channel, corId)，无再查(businessType, channel)。由于(businessType, channel)对应记录唯一，可以用缓存优化第二次的查询
 */
public class AuthenticationAuditConfig {
    String id; // 主键

    // (businessType, channel, corporationId) 唯一性约束
    BUSINESS_TYPE businessType;
    CHANNEL channel;
    String corporationId; // 企业个性化配置 (businessType, channel) 审核链路

    // 固定字段的数据库无法支持审核流程个性化
    List(isSpecificied, domainId, corId, perSonId) ~ parseFunc,易扩展，例如加单人多人的字段，再list元素加就行，不影响表
    // json/blob = domainList ，json把 blob麻烦且可读性较差  支持扩展审核流 authChain

    List<> parseAuditChain() {

    }

    // overload default set
    void setAuditChain(List<>)
}
