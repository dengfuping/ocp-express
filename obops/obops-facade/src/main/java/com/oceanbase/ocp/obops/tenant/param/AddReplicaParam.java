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

package com.oceanbase.ocp.obops.tenant.param;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.oceanbase.ocp.obops.tenant.model.ReplicaType;

import lombok.Data;

@Data
public class AddReplicaParam {

    @NotNull(message = "{error.common.field.value.not.null}")
    private String zoneName;

    @NotNull(message = "{error.common.field.value.not.null}")
    private ReplicaType replicaType;

    @NotNull(message = "{error.common.field.value.not.null}")
    @Valid
    private PoolParam resourcePool;

    @Data
    public static class PoolParam {

        @NotNull(message = "{error.common.field.value.not.null}")
        @Valid
        private UnitSpecParam unitSpec;

        @NotNull(message = "{error.common.field.value.not.null}")
        private Long unitCount;
    }
}
