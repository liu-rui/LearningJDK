/*
 * Copyright (c) 2007, 2011, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

package java.nio.file;

/**
 * Defines the options as to how symbolic links are handled.
 *
 * @since 1.7
 */
// 符号链接选项，用在创建/打开/复制/移动文件的操作中
public enum LinkOption implements OpenOption, CopyOption {
    
    /**
     * Do not follow symbolic links.
     *
     * @see Files#getFileAttributeView(Path, Class, LinkOption[])
     * @see Files#copy
     * @see SecureDirectoryStream#newByteChannel
     */
    // 指示对于符号链接，不会将其链接到目标文件
    NOFOLLOW_LINKS
}
