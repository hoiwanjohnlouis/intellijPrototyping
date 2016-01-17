package com.hwtechservicesllc.stocks.fields;

import com.hwtechservicesllc.stocks.enums.FieldType;

/**
 * Copyright 01/07/2016 HW Tech Services, LLC
 * <p>
 * Login   Hoi Wan Louis
 * <p>
 * Package com.hwtechservicesllc.stocks.fields
 * Project intellijPrototyping
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 **/

public class Price {

    // for logging purposes
    private final String DEBUG_TAG = this.getClass().getSimpleName();
    private FieldType fieldType;
    private double price;

    // no one can call default constructor
    private Price() {}

    public Price(final FieldType fieldType, final double price) {
        this.fieldType = fieldType;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(final double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(fieldType.name());
        sb.append(":[");
        sb.append(getPrice());
        sb.append("]");

        return sb.toString();
    }
}
