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

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Jin Kwon &lt;onacit_at_gmail.com&gt;
 */
@XmlTransient
abstract class ConstantRefInfo<T extends ConstantRefInfo<T>> extends CpInfo {

    // -------------------------------------------------------------------------
    ConstantRefInfo(final int tag) {
        super(tag);
    }

    // -------------------------------------------------------------------------
    @Override
    public void writeInfo(final DataOutput out) throws IOException {
        out.writeShort(classIndex);
        out.writeShort(nameAndTypeIndex);
    }

    @Override
    public void readInfo(final DataInput in) throws IOException {
        classIndex = in.readUnsignedShort();
        nameAndTypeIndex = in.readUnsignedShort();
    }

    // -------------------------------------------------------------- classIndex
    public int getClassIndex() {
        return classIndex;
    }

    public void setClassIndex(final int classIndex) {
        this.classIndex = classIndex;
    }

    // -------------------------------------------------------- nameAndTypeIndex
    public int getNameAndTypeIndex() {
        return nameAndTypeIndex;
    }

    public void setNameAndTypeIndex(final int nameAndTypeIndex) {
        this.nameAndTypeIndex = nameAndTypeIndex;
    }

    // -------------------------------------------------------------------------
    @XmlElement(required = true)
    private int classIndex;

    @XmlElement(required = true)
    private int nameAndTypeIndex;
}
