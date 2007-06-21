/* This file is part of SableCC (http://sablecc.org/).
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

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

import org.sablecc.sablecc.exception.InternalException;

abstract class State<T extends Comparable<? super T>> {

    private String name;

    private SortedSet<Transition<T>> forwardTransitions;

    private SortedSet<Transition<T>> backwardTransitions;

    private boolean isStable;

    State(
            String name) {

        if (name == null) {
            throw new InternalException("name may not be null");
        }

        this.name = name;
        this.forwardTransitions = new TreeSet<Transition<T>>();
        this.backwardTransitions = new TreeSet<Transition<T>>();
        this.isStable = false;
    }

    SortedSet<Transition<T>> getForwardTransitions() {

        if (!this.isStable) {
            throw new InternalException("the state is not stable yet");
        }

        return this.forwardTransitions;
    }

    SortedSet<Transition<T>> getBackwardTransitions() {

        if (!this.isStable) {
            throw new InternalException("the state is not stable yet");
        }

        return this.backwardTransitions;
    }

    boolean isStable() {

        return this.isStable;
    }

    @Override
    public String toString() {

        return this.name;
    }

    void addForwardTransition(
            Transition<T> transition) {

        if (transition == null) {
            throw new InternalException("transition may not be null");
        }

        if (transition.getSource() != this) {
            throw new InternalException(
                    "transition source must be this instance");
        }

        if (this.isStable) {
            throw new InternalException("a stable state may not be modified");
        }

        this.forwardTransitions.add(transition);
    }

    void addBackwardTransition(
            Transition<T> transition) {

        if (transition == null) {
            throw new InternalException("transition may not be null");
        }

        if (transition.getDestination() != this) {
            throw new InternalException(
                    "transition destination must be this instance");
        }

        if (this.isStable) {
            throw new InternalException("a stable state may not be modified");
        }

        this.backwardTransitions.add(transition);
    }

    void stabilize() {

        this.forwardTransitions = Collections
                .unmodifiableSortedSet(this.forwardTransitions);
        this.backwardTransitions = Collections
                .unmodifiableSortedSet(this.backwardTransitions);
        this.isStable = true;
    }

}