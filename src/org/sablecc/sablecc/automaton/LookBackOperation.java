/* This file is part of SableCC ( http://sablecc.org ).
 *
 * See the NOTICE file distributed with this work for copyright information.
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

package org.sablecc.sablecc.automaton;

import java.util.*;
import java.util.Map.*;

import org.sablecc.exception.*;
import org.sablecc.sablecc.alphabet.*;

public class LookBackOperation {
	
	private Automaton newAutomaton;
	
	public LookBackOperation(
			Automaton leftAutomaton,
            Automaton rightAutomaton) {
		
		if (leftAutomaton == null) {
            throw new InternalException("leftAutomaton may not be null");
        }

        if (rightAutomaton == null) {
            throw new InternalException("rightAutomaton may not be null");
        }
	}
	
	private Automaton getLookBackAutomation(
			Automaton normalAutomaton){
		return normalAutomaton;
	}
	
	Automaton getNewAutomaton() {

        return this.newAutomaton;
    }
}
