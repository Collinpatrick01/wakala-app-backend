package com.abl.wakala.model;

import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@Entity
@Table(name = "serviceProvider", uniqueConstraints = @UniqueConstraint(columnNames = "SP_NAME"))
public class ServiceProvider {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SP_ID")
    private Long spId;
    @Column(name = "SP_NAME")
    private String spName;
    @Column(name = "SHORT_NAME")
    private String shortName;
    @Column(name = "ACCOUNT_NO")
    private Integer accountNo;
    @Column(name = "CURRENCY")
    private  String currency;
    @Column(name = "SP_URL")
    private String spUrl;
    @Column(name = "SP_TYPE")
    private String spType;
    @Column(name = "EMAIL")
    private  String email;
    @Column(name = "MSISDN")
    private Integer msisdn;

    @Column(name = "DATE")
    private LocalDate date;

    public ServiceProvider(){

    }

    public ServiceProvider(String spName, String shortName, Integer accountNo, String currency, String spUrl, String spType, String email, Integer msisdn, LocalDate date) {
        this.spName = spName;
        this.shortName = shortName;
        this.accountNo = accountNo;
        this.currency = currency;
        this.spUrl = spUrl;
        this.spType = spType;
        this.email = email;
        this.msisdn = msisdn;
        this.date = date;
    }

    public void setSpId(Long spId) {
        this.spId = spId;
    }

    public void setSpName(String spName) {
        this.spName = spName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public void setAccountNo(Integer accountNo) {
        this.accountNo = accountNo;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setSpUrl(String spUrl) {
        this.spUrl = spUrl;
    }

    public void setSpType(String spType) {
        this.spType = spType;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMsisdn(Integer msisdn) {
        this.msisdn = msisdn;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
