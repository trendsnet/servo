/**
 * Copyright 2013 Netflix, Inc.
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
package com.netflix.servo.monitor;

/** Provides a way to sample a value tied to a particular configuration. */
public interface Monitor<T> {

    /** Returns the current value for the monitor for the default polling interval. */
    T getValue();

    /** Returns the current value for the monitor for the nth poller. */
    T getValue(int pollerIndex);


    /** Configuration used to identify a monitor and provide metadata used in aggregations. */
    MonitorConfig getConfig();
}
