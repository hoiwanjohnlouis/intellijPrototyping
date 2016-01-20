package com.hwtechservicesllc.ms.abstractfactories.factories;

/*
    Copyright (c) 2014  Hoi Wan Louis
 
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

import com.hwtechservicesllc.ms.abstractfactories.fields.*;
import com.hwtechservicesllc.ms.abstractfactories.interfaces.*;

public abstract class Record {

    // for logging purposes
    private final String DEBUG_TAG = this.getClass().getSimpleName();


    private RecordType recordType;
    private StringBuilder stringBuilder = new StringBuilder();


    protected Company company;                 // 1
    protected TickerSymbol tickerSymbol;                   // 2
    protected Price openingPrice;              // 3
    protected Price previousDaysClosingPrice;  // 4
    protected Price lastTradePrice;            // 5
    protected Quantity lastTradeQuantity;      // 6
    protected DateStamp lastTradeDateStamp;    // 7
    protected TimeStamp lastTradeTimeStamp;    // 8


    // concrete definition is by whom inherits this class
    abstract void prepare();


    //
    public ERecordType getRecordType() {
        return recordType;
    }

    //
    public void setRecordType(ERecordType recordType) {
        this.recordType = recordType;
    }


    // If any EnemyShip object is printed to screen this shows up
    public String toString(){

        // clean up the buffer before using.
        stringBuilder.delete(0,stringBuilder.length());

        stringBuilder.append(this.getRecordType());
        stringBuilder.append("\n");
        stringBuilder.append(company.getDescription());
        stringBuilder.append(":");
        stringBuilder.append(company.getLongName());
        stringBuilder.append(",\n");
        stringBuilder.append(symbol.getDescription());
        stringBuilder.append(":");
        stringBuilder.append(symbol.getSymbol());
        stringBuilder.append(",\n");
        stringBuilder.append(openingPrice.getDescription());
        stringBuilder.append(":");
        stringBuilder.append(openingPrice.getPrice());
        stringBuilder.append(",\n");
        stringBuilder.append(previousDaysClosingPrice.getDescription());
        stringBuilder.append(":");
        stringBuilder.append(previousDaysClosingPrice.getPrice());
        stringBuilder.append(",\n");
        stringBuilder.append(lastTradePrice.getDescription());
        stringBuilder.append(":");
        stringBuilder.append(lastTradePrice.getPrice());
        stringBuilder.append(",\n");
        stringBuilder.append(lastTradeQuantity.getDescription());
        stringBuilder.append(":");
        stringBuilder.append(lastTradeQuantity.getQuantity());
        stringBuilder.append(",\n");
        stringBuilder.append(lastTradeDateStamp.getDescription());
        stringBuilder.append(":");
        stringBuilder.append(lastTradeDateStamp.getDateStamp());
        stringBuilder.append(",\n");
        stringBuilder.append(lastTradeTimeStamp.getDescription());
        stringBuilder.append(":");
        stringBuilder.append(lastTradeTimeStamp.getTimeStamp());

        return stringBuilder.toString();

    }


}