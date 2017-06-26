/*
 * Copyright 2017 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package br.com.pos.unicamp.vrep.charts;

import br.com.pos.unicamp.vrep.common.Coordinate;
import br.com.pos.unicamp.vrep.common.Pose;
import br.com.pos.unicamp.vrep.robots.Pioneer;

public class OdometerChart extends BaseChart {

    public OdometerChart(final Pioneer pioneer) {
        super(pioneer);
    }

    @Override
    protected Coordinate updatedCoordinate() {
        final Pose pose = getPioneer().getCurrentPose();

        return pose.getCoordinate();
    }

    @Override
    protected String chartName() {
        return "Odometer";
    }

    @Override
    protected String dataName() {
        return "Pioneer";
    }
}