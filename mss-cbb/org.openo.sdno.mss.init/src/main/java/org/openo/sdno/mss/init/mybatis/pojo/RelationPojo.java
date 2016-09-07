/*
 * Copyright (c) 2016, Huawei Technologies Co., Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.openo.sdno.mss.init.mybatis.pojo;

/**
 * ralation pojo class.<br/>
 * 
 * @author
 * @version SDNO 0.5 2016-5-24
 */
public class RelationPojo {

    private String bktName;

    private String rmspec;

    /**
     * @return Returns the bktName.
     */
    public String getBktName() {
        return bktName;
    }

    /**
     * @param bktName The bktName to set.
     */
    public void setBktName(String bktName) {
        this.bktName = bktName;
    }

    /**
     * @return Returns the rmspec.
     */
    public String getRmspec() {
        return rmspec;
    }

    /**
     * @param rmspec the rmspec to set.
     * @since SDNO 0.5
     */
    public void setRmspec(String rmspec) {
        this.rmspec = rmspec == null ? null : rmspec.trim();
    }
}
