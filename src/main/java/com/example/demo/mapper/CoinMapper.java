package com.example.demo.mapper;

import com.example.demo.module.Coin;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface CoinMapper {
    List<Coin> QueryAllCoin();
}


