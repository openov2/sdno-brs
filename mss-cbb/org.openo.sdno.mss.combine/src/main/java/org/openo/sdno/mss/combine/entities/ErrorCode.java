/*
 * Copyright 2016 Huawei Technologies Co., Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.openo.sdno.mss.combine.entities;

/**
 * Error code class.<br>
 * 
 * @author
 * @version SDNO 0.5 2016-5-19
 */
public class ErrorCode {

    public static final int CUSTOM_SERVICE_ERROR = 599;

    public static final String INTERNAL_ERROR = "5000000";

    private ErrorCode() {
        // Private constructor to prohibit instantiation.
    }

}
