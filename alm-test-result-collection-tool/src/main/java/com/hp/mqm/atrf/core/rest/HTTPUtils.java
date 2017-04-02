/*
 *     Copyright 2017 Hewlett-Packard Development Company, L.P.
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 *
 */

package com.hp.mqm.atrf.core.rest;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 */
public class HTTPUtils {
    public static String HEADER_ACCEPT = "Accept";
    public static String HEADER_APPLICATION_JSON = "application/json";
    public static String HEADER_APPLICATION_XML = "application/xml";
    public static String HEADER_CONTENT_TYPE = "Content-Type";

    public static String UTF8 = "UTF-8";


    public static String encodeParam(String param) {
        String ret;

        try {
            ret = URLEncoder.encode(param, HTTPUtils.UTF8);
        } catch (UnsupportedEncodingException e) {
            ret = "";
        }

        return ret;
    }
}
