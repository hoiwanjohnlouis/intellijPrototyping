package com.hwtechservicesllc.staging2016.enums;

/*
    Copyright (c) 2015  HW Tech Services, Inc., LLC
 
    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at
 
        http://www.apache.org/licenses/LICENSE-2.0
 
    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
*/

// from FixProtocol.org website www.fixprotocol.org

public enum FieldType {

    DEFAULT_COMPANY_NAME,
    DEFAULT_TICKER_SYMBOL,
    DEFAULT_PRICE,
    DEFAULT_QUANTITY,
    DEFAULT_DATE_STAMP,
    DEFAULT_TIME_STAMP,
    COMPANY_NAME,
    TICKER_SYMBOL,
    OPENING_PRICE,
    PREVIOUS_DAYS_CLOSING_PRICE,
    TRADE_PRICE,
    TRADE_QUANTITY,
    TRADE_DATE_STAMP,
    TRADE_TIME_STAMP;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name());

        return sb.toString();
    }
}
