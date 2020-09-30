package com.hfy.export_cart.service;

import com.alibaba.android.arouter.facade.template.IProvider;

/**
 * 购物车组件对外暴露的服务
 * @author hufeiyang
 */
public interface ICartService extends IProvider {

    /**
     * 获取购物车中商品数量
     * @return
     */
    int getProductCountInCart();
}
