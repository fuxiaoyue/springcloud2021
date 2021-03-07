package com.guanghui.payment.entity;

import com.guanghui.payment.util.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment extends BaseEntity<Payment> implements Serializable {
    private long id;
    private String serial;//交易序列号
}
