/**
 * OSHI (https://github.com/oshi/oshi)
 *
 * Copyright (c) 2010 - 2019 The OSHI Project Team:
 * https://github.com/oshi/oshi/graphs/contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package oshi.json.hardware;

import oshi.json.json.OshiJsonObject;

/**
 * The Baseboard represents the system board, also called motherboard, logic
 * board, etc.
 *
 * @author widdis [at] gmail [dot] com
 */
public interface Baseboard extends OshiJsonObject {
    /**
     * Get the baseboard manufacturer.
     *
     * @return The manufacturer.
     */
    String getManufacturer();

    /**
     * Get the baseboard model.
     *
     * @return The model.
     */
    String getModel();

    /**
     * Get the baseboard version.
     *
     * @return The version.
     */
    String getVersion();

    /**
     * Get the baseboard serial number
     *
     * @return The serial number.
     */
    String getSerialNumber();
}