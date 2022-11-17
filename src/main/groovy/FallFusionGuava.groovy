/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import com.google.common.collect.Streams

var fall1 = ['🎃', '🍎', '🍁', '🌽']
var fall2 = ['🥧', '🥧', '🍂', '🍞']
var zipped = Streams.zip(fall1.stream(), fall2.stream()) {one, two -> "$one$two" }
var fusion = "[${zipped.toList().join(' + ')}] = Fall Fusion"
assert fusion == '[🎃🥧 + 🍎🥧 + 🍁🍂 + 🌽🍞] = Fall Fusion'
