package com.hwtechservicesllc.staging2016.factories;

import com.hwtechservicesllc.staging2016.enums.MsgType;
import com.hwtechservicesllc.staging2016.fields.*;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Copyright 01/07/2016 HW Tech Services, LLC
 * Licensed under the Apache License, Version 2.0 (the "License");
 * http://www.apache.org/licenses/LICENSE-2.0
 **/

public class Record implements Comparable {

    // for logging purposes
    private final String DEBUG_TAG = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    private final MsgType msgType;
    private final CompanyName companyName;
    private final TickerSymbol tickerSymbol;
    private final Price openingPrice;
    private final Price previousDaysClosingPrice;
    private final Price lastTradePrice;
    private final Quantity lastTradeQuantity;
    private final DateStamp lastTradeDateStamp;
    private final TimeStamp lastTradeTimeStamp;

    //
    private Record(RecordBuilder recordBuilder) {
        this.msgType = recordBuilder.msgType;
        this.companyName = recordBuilder.companyName;
        this.tickerSymbol = recordBuilder.tickerSymbol;
        this.openingPrice = recordBuilder.openingPrice;
        this.previousDaysClosingPrice = recordBuilder.previousDaysClosingPrice;
        this.lastTradePrice = recordBuilder.lastTradePrice;
        this.lastTradeQuantity = recordBuilder.lastTradeQuantity;
        this.lastTradeDateStamp = recordBuilder.lastTradeDateStamp;
        this.lastTradeTimeStamp = recordBuilder.lastTradeTimeStamp;
    }


    public MsgType getMsgType() {
        return msgType;
    }

    public CompanyName getCompanyName() {
        return companyName;
    }

    public TickerSymbol getTickerSymbol() {
        return tickerSymbol;
    }

    public Price getOpeningPrice() {
        return openingPrice;
    }

    public Price getPreviousDaysClosingPrice() {
        return previousDaysClosingPrice;
    }

    public Price getLastTradePrice() {
        return lastTradePrice;
    }

    public Quantity getLastTradeQuantity() {
        return lastTradeQuantity;
    }

    public DateStamp getLastTradeDateStamp() {
        return lastTradeDateStamp;
    }

    public TimeStamp getLastTradeTimeStamp() {
        return lastTradeTimeStamp;
    }


    // If any EnemyShip object is printed to screen this shows up
    @Override
    public String toString(){

        StringBuilder stringBuilder = new StringBuilder();

        // clean up the buffer before using.
        stringBuilder.append(msgType);
        stringBuilder.append("\n");
        stringBuilder.append(companyName);
        stringBuilder.append("\n");
        stringBuilder.append(tickerSymbol);
        stringBuilder.append("\n");
        stringBuilder.append(openingPrice);
        stringBuilder.append("\n");
        stringBuilder.append(previousDaysClosingPrice);
        stringBuilder.append("\n");
        stringBuilder.append(lastTradePrice);
        stringBuilder.append("\n");
        stringBuilder.append(lastTradeQuantity);
        stringBuilder.append("\n");
        stringBuilder.append(lastTradeDateStamp);
        stringBuilder.append("\n");
        stringBuilder.append(lastTradeTimeStamp);

        return stringBuilder.toString();

    }

    public int compareTo(Object o) {
        return 0;
    }

    // static builder helper class 
    public static class RecordBuilder {

        private final String DEBUG_TAG = this.getClass().getSimpleName();
        private final Logger logger = LogManager.getLogger(DEBUG_TAG);

        private StringBuilder stringBuilder = new StringBuilder();

        private MsgType msgType;
        private CompanyName companyName;         // 1
        private TickerSymbol tickerSymbol;       // 2
        private Price openingPrice;              // 3
        private Price previousDaysClosingPrice;  // 4
        private Price lastTradePrice;            // 5
        private Quantity lastTradeQuantity;      // 6
        private DateStamp lastTradeDateStamp;    // 7
        private TimeStamp lastTradeTimeStamp;    // 8
        
        
        // static helper class to build object
        public RecordBuilder(MsgType msgType, CompanyName companyName, TickerSymbol tickerSymbol) {
            this.msgType = msgType;
            this.companyName = companyName;
            this.tickerSymbol = tickerSymbol;
            this.openingPrice = new Price();
            this.previousDaysClosingPrice = new Price();
            this.lastTradePrice = new Price();
            this.lastTradeQuantity = new Quantity();
            this.lastTradeDateStamp = new DateStamp();
            this.lastTradeTimeStamp = new TimeStamp();
        }

        public RecordBuilder buildOpeningPrice(Price openingPrice) {
            this.openingPrice = openingPrice;
            return this;
        }

        public RecordBuilder buildPreviousDaysClosingPrice(Price previousDaysClosingPrice) {
            this.previousDaysClosingPrice = previousDaysClosingPrice;
            return this;
        }

        public RecordBuilder buildTradePrice(Price lastTradePrice) {
            this.lastTradePrice = lastTradePrice;
            return this;
        }

        public RecordBuilder buildTradeQuantity(Quantity lastTradeQuantity) {
            this.lastTradeQuantity = lastTradeQuantity;
            return this;
        }

        public RecordBuilder buildTradeDateStamp(DateStamp lastTradeDateStamp) {
            this.lastTradeDateStamp = lastTradeDateStamp;
            return this;
        }

        public RecordBuilder buildTradeTimeStamp(TimeStamp lastTradeTimeStamp) {
            this.lastTradeTimeStamp = lastTradeTimeStamp;
            return this;
        }

        public Record build() {
            return new Record(this);
        }

    }

}
