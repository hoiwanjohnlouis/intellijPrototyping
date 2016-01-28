package com.hwtechservicesllc.jcg.designpatterns.builder;

/**
 * Copyright 01/14/2016 HW Tech Services, LLC
 * <p>
 * Login   KimSoYeon
 * <p>
 * Package com.hwtechservicesllc.jcg.patterns.builder
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

public class TestForm {

    public static void main(String[] args) {
        Form form = new Form.FormBuilder("Dave", "Carter", "DavCarter", "DAvCaEr123").passwordHint("MyName").city("NY").language("English").build();
        System.out.println(form);
    }

}