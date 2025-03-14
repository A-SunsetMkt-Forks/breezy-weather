/**
 * This file is part of Breezy Weather.
 *
 * Breezy Weather is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by the
 * Free Software Foundation, version 3 of the License.
 *
 * Breezy Weather is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public
 * License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Breezy Weather. If not, see <https://www.gnu.org/licenses/>.
 */

package org.breezyweather.sources.lvgmc.json

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class LvgmcCurrentResult(
    @SerialName("laiks") val time: String?,
    @SerialName("stacijas_kods") val stationCode: String?,
    @SerialName("temperatura") val temperature: String?,
    @SerialName("veja_virziens") val windDirection: String?,
    @SerialName("videja_veja_atrums") val windSpeed: String?,
    @SerialName("veja_brazmas") val windGusts: String?,
    @SerialName("relativais_mitrums") val relativeHumidity: String?,
    @SerialName("atmosferas_spiediens") val pressure: String?,
    @SerialName("redzamiba") val visibility: String?,
    @SerialName("uvi") val uvIndex: String?,
)
