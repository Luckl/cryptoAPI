package com.luc.crypto.entities;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.math.BigInteger;

@Builder
@Data
@Entity
public class Crypto {

    @Id
    private String ticker;
    private String name;
    private BigInteger numberOfCoins;
    private BigDecimal marketCap;
}
