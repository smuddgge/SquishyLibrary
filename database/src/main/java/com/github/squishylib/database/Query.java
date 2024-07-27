/*
 * Java configuration and database library.
 * Copyright (C) 2024  Smuddgge
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.github.squishylib.database;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Query {

    private final @NotNull Map<String, Object> patterns;
    private int limit;
    private String orderByKey;
    private Comparator<?> orderByComparator;

    public Query() {
        this.patterns = new HashMap<>();
        this.limit = -1;
    }

    public @NotNull Map<String, Object> getPatterns() {
        return this.patterns;
    }

    public int getLimit() {
        return this.limit;
    }

    public @Nullable String getOrderByKey() {
        return this.orderByKey;
    }

    public @Nullable Comparator<?> getOrderByComparator() {
        return this.orderByComparator;
    }

    public @NotNull Query match(@NotNull String key, @NotNull Object value) {
        this.patterns.put(key, value);
        return this;
    }

    public @NotNull Query limit(int limit) {
        this.limit = limit;
        return this;
    }

    public @NotNull Query orderBy(@NotNull String key, @NotNull Comparator<?> comparator) {
        this.orderByKey = key;
        this.orderByComparator = comparator;
        return this;
    }
}
