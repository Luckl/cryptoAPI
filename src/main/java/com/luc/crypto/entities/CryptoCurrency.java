package com.luc.crypto.entities;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.math.BigInteger;


/**
 * Our entity. Will be persistable thanks to the @Entity and @Id
 * Uses lombok to generate a builder method and getters/setters/equals/etc...
 */
@Builder
@Data
@Entity
public class CryptoCurrency {

    @Id
    private String ticker;
    private String name;
    private BigInteger numberOfCoins;
    private BigDecimal marketCap;
}
