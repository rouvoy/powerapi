/*
 * This software is licensed under the GNU Affero General Public License, quoted below.
 *
 * This file is a part of PowerAPI.
 *
 * Copyright (C) 2011-2014 Inria, University of Lille 1.
 *
 * PowerAPI is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of
 * the License, or (at your option) any later version.
 *
 * PowerAPI is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with PowerAPI.
 *
 * If not, please consult http://www.gnu.org/licenses/agpl-3.0.html.
 */
package org.powerapi.module.rapl

import org.powerapi.PowerModule
import org.powerapi.core.LinuxHelper

class RAPLModule extends PowerModule {
  lazy val underlyingSensorsClasses  = Seq((classOf[RAPLSensor], Seq(new LinuxHelper, new RAPLHelper)))
  lazy val underlyingFormulaeClasses = Seq((classOf[RAPLFormula], Seq()))
}

object RAPLModule {
  def apply(): RAPLModule = {
    new RAPLModule()
  }
}
