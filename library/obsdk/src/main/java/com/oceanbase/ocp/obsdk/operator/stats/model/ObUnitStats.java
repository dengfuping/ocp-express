/*
 * Copyright (c) 2023 OceanBase
 * OCP Express is licensed under Mulan PSL v2.
 * You can use this software according to the terms and conditions of the Mulan PSL v2.
 * You may obtain a copy of Mulan PSL v2 at:
 *          http://license.coscl.org.cn/MulanPSL2
 * THIS SOFTWARE IS PROVIDED ON AN "AS IS" BASIS, WITHOUT WARRANTIES OF ANY KIND,
 * EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO NON-INFRINGEMENT,
 * MERCHANTABILITY OR FIT FOR A PARTICULAR PURPOSE.
 * See the Mulan PSL v2 for more details.
 */

package com.oceanbase.ocp.obsdk.operator.stats.model;

import com.oceanbase.ocp.obsdk.util.UnitUtils;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class ObUnitStats extends UnitStats {

    private Long unitId;

    private String svrIp;

    private Integer svrPort;

    private String zone;

    private Long tenantId;

    public String getUnitConfigAliasName() {
        return UnitUtils.formatUnitConfig(getMinCpu(), getMaxCpu(), getMinMemory(), getMaxMemory());
    }
}
