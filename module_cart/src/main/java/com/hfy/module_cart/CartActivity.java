package com.hfy.module_cart;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.hfy.export_cart.router.CartRouterTable;

@Route(path = CartRouterTable.PATH_PAGE_CART)
public class CartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);


//        FragmentManager manager = getSupportFragmentManager();
//        FragmentTransaction  transaction= manager.beginTransaction();
//        Fragment userFragment = CartFragment.newInstance("param1","param2");
//        transaction.add(R.id.fl_test_fragment, userFragment, "tag");
//        transaction.commit();
    }
}
