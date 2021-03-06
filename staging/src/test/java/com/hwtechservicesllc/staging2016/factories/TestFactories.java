package com.hwtechservicesllc.staging2016.factories;

/**
 * Copyright 01/07/2016 HW Tech Services, LLC
 * Licensed under the Apache License, Version 2.0 (the "License");
 * http://www.apache.org/licenses/LICENSE-2.0
 **/

import com.hwtechservicesllc.staging2016.enums.MsgType;
import com.hwtechservicesllc.staging2016.fields.CompanyName;
import com.hwtechservicesllc.staging2016.fields.TickerSymbol;
import com.hwtechservicesllc.staging2016.views.TradeView;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestFactories {

    // for logging purposes
    private final String DEBUG_TAG = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    public static void main (String[] args) {

        //  testing ticker record construction
        CompanyName companyName = new CompanyName();
        TickerSymbol tickerSymbol = new TickerSymbol();
        TradeView testView =
                new TradeView.TradeViewBuilder(MsgType.EXECUTION_REPORT).
                        buildCompanyName(companyName).
                        buildTickerSymbol(tickerSymbol).
                        build();
        System.out.println(testView);

    }

}
