package com.example.demo.service.impl;

import com.example.demo.common.Result;
import com.example.demo.mapper.CoinMapper;
import com.example.demo.module.Coin;
import com.example.demo.service.CoinService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CoinServiceImpl implements CoinService {

    @Autowired
    private CoinMapper coinMapper;
    @Override
    public Result QueryAllCoin(){
        Result result = new Result();
        List<Coin> coins = coinMapper.QueryAllCoin();
//        result.setCode(coins);
       return result;
    }
}
