package com.guanghui.payment.serviceImpl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guanghui.payment.entity.Payment;
import com.guanghui.payment.mapper.PaymentMapper;
import com.guanghui.payment.service.PaymentService;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl extends ServiceImpl<PaymentMapper, Payment> implements IService<Payment> {
}
