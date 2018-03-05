/*
 * Copyright 2016 Jin Kwon &lt;onacit_at_gmail.com&gt;.
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
package com.github.jinahya.jvm.classfile.constant;

import javax.xml.bind.annotation.XmlAttribute;

/**
 *
 * @author Jin Kwon &lt;onacit_at_gmail.com&gt;
 */
public class ConstantFloat extends Constant32<ConstantFloat> {

    // -------------------------------------------------------------------------
    public ConstantFloat() {
        super(CpInfoTag.CONSTANT_Float.getTagValue());
    }

    // ------------------------------------------------------------ bytesAsFloat
    @XmlAttribute
    public float getBytesAsFloat() {
        return Float.intBitsToFloat(getBytes());
    }

    public void setBytesAsFloat(final float bytesAsFloat) {
        setBytes(Float.floatToRawIntBits(bytesAsFloat));
    }
}
