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
package com.oceanbase.ocp.task.engine.coordinator.worker;

public interface Worker {

    /**
     * Specified name of worker.
     *
     * @return name of worker
     */
    String name();

    /**
     * Specified metric name of worker, default is worker name.
     *
     * @return metric name of worker
     */
    default String metricName() {
        return name();
    }

    /**
     * Work assigned to workers.
     */
    void work();

}