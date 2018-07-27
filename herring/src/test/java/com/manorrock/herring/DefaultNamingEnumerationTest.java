/*
 *  Copyright (c) 2002-2018, Manorrock.com. All Rights Reserved.
 *
 *  Redistribution and use in source and binary forms, with or without
 *  modification, are permitted provided that the following conditions are met:
 *
 *      1. Redistributions of source code must retain the above copyright
 *         notice, this list of conditions and the following disclaimer.
 *
 *      2. Redistributions in binary form must reproduce the above copyright
 *         notice, this list of conditions and the following disclaimer in the
 *         documentation and/or other materials provided with the distribution.
 *
 *  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 *  AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 *  IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 *  ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 *  LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 *  CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 *  SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 *  INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 *  CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 *  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 *  POSSIBILITY OF SUCH DAMAGE.
 */
package com.manorrock.herring;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import javax.naming.NameClassPair;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

/**
 * The JUnit tests for the DefaultNamingEnumeration class.
 *
 * @author Manfred Riem (mriem@manorrock.com)
 */
public class DefaultNamingEnumerationTest {

    /**
     * Test hasMore method.
     *
     * @throws Exception when a serious error occurs.
     */
    @Test
    public void testHasMore() throws Exception {
        DefaultNamingEnumeration enumeration = new DefaultNamingEnumeration(new ArrayList<>());
        assertFalse(enumeration.hasMore());
    }

    /**
     * Test hasMoreElements method.
     */
    @Test
    public void testHasMoreElements() {
        DefaultNamingEnumeration enumeration = new DefaultNamingEnumeration(new ArrayList<>());
        assertFalse(enumeration.hasMoreElements());
    }

    /**
     * Test next method.
     * 
     * @throws Exception when a serious error occurs.
     */
    @Test(expected = NoSuchElementException.class)
    public void testNext() throws Exception {
        DefaultNamingEnumeration enumeration = new DefaultNamingEnumeration(new ArrayList<>());
        enumeration.next();
    }

    /**
     * Test next method.
     * 
     * @throws Exception when a serious error occurs.
     */
    @Test
    public void testNext2() throws Exception {
        NameClassPair pair = new NameClassPair("name", "className");
        ArrayList<NameClassPair> list = new ArrayList<>();
        list.add(pair);
        DefaultNamingEnumeration enumeration = new DefaultNamingEnumeration(list);
        assertNotNull(enumeration.next());
    }

    /**
     * Test nextElement method.
     *
     * @throws Exception when a serious error occurs.
     */
    @Test(expected = NoSuchElementException.class)
    public void testNextElement() throws Exception {
        DefaultNamingEnumeration enumeration = new DefaultNamingEnumeration(new ArrayList<>());
        enumeration.nextElement();
    }
}
