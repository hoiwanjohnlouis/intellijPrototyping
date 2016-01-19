package com.hwtechservicesllc.ms.abstractfactories.fields;

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


import com.hwtechservicesllc.ms.abstractfactories.interfaces.IPrice;

public class Price implements IPrice {

    // for logging purposes
    private final String DEBUG_TAG = this.getClass().getSimpleName();

    private EDescription description;
    private double price;

    @Override
    public EDescription getDescription() {
        return this.description;
    }

    @Override
    public void setDescription(EDescription description) {
        this.description = description;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }


}
