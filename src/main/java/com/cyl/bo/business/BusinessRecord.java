package com.cyl.bo.business;

import tmp.event.enums.audit.BUSINESS_TYPE;
import tmp.event.enums.audit.CHANNEL;
import tmp.state.StateType;

public class BusinessRecord {
    String Id; // 主键

    // 关联审核配置
    // 关联 AuthenticationAuditConfig 表，在不涉及审核时不需要相关数据
    // 不用主键关联，用主键的话，如果后面auditConfig换了，需要找到受影响的记录进行操作，很烦
    String corporationId; // 最开始产生该数据的企业 ？ 还是上一个处理企业？
    BUSINESS_TYPE businessType;
    CHANNEL channel;

    // 主键关联当前审核进度
    // 审核进度数据与 AuthenticationAuditConfig AuditChain 元素类型一致，表示一个节点
    // 处于节点 a，即表示 a 已经审核完毕
    // todo:后面可能会指定审核人员？
    String auditNodeInfoId;

    StateType state;
}
