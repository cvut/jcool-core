/*
 * Copyright 2014 deric.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cz.cvut.fit.jcool.core;

import cz.cvut.fit.jcool.core.Point;
import org.junit.After;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author deric
 */
public class PointTest {

    private Point subject;
    private static final double delta = 1e-9;

    public PointTest() {
    }

    @Before
    public void setUp() {
        subject = Point.at(new double[]{1.0, 2.0});
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of at method, of class Point.
     */
    @Test
    public void testAt() {

    }

    /**
     * Test of random method, of class Point.
     */
    @Test
    public void testRandom_int() {
        Point p = Point.random(2);
        assertNotNull(p);
    }

    /**
     * Test of random method, of class Point.
     */
    @Test
    public void testRandom_3args() {
    }

    /**
     * Test of getDefault method, of class Point.
     */
    @Test
    public void testGetDefault() {
    }

    /**
     * Test of toArray method, of class Point.
     */
    @Test
    public void testToArray() {
        double[] ary = subject.toArray();
        assertEquals(1.0, ary[0], delta);
        assertEquals(2.0, ary[1], delta);
    }

    /**
     * Test of toString method, of class Point.
     */
    @Test
    public void testToString() {
        assertEquals("[1.0,2.0]", subject.toString());
    }

    /**
     * Test of equals method, of class Point.
     */
    @Test
    public void testEquals() {
        //should have same hash code
        Point a = Point.at(new double[]{1.0, 2.0});
        Point b = Point.at(new double[]{1.0, 2.0});
        assertEquals(true, a.equals(b));

        //should be different
        a = Point.at(new double[]{1.0, 2.0});
        b = Point.at(new double[]{1.0, 3.0});
        assertEquals(false, a.equals(b));
    }

    /**
     * Test of hashCode method, of class Point.
     */
    @Test
    public void testHashCode() {
        //should have same hash code
        Point a = Point.at(new double[]{1.0, 2.0});
        Point b = Point.at(new double[]{1.0, 2.0});
        assertEquals(a.hashCode(), b.hashCode());

        //should be different
        a = Point.at(new double[]{1.0, 2.0});
        b = Point.at(new double[]{1.0, 3.0});
        assertEquals(false, a.hashCode() == b.hashCode());
    }

    /**
     * Test of dimension method, of class Point.
     */
    @Test
    public void testDimension() {
        assertEquals(2, subject.dimension());
        assertEquals(3, Point.at(new double[]{1, 2, 3}).dimension());
    }

    /**
     * Test of value method, of class Point.
     */
    @Test
    public void testValue() {
        assertEquals(1.0, subject.value(0), delta);
    }

}
