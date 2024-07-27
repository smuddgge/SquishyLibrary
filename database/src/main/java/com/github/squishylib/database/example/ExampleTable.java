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

package com.github.squishylib.database.example;

import com.github.squishylib.database.Table;
import org.jetbrains.annotations.NotNull;

public class ExampleTable extends Table<ExampleRecord> {

    @Override
    public @NotNull String getName() {
        return "example";
    }

    @Override
    public @NotNull String getIdentifierName() {
        return ExampleRecord.IDENTIFIER_KEY;
    }

    @Override
    public @NotNull ExampleRecord createEmpty(@NotNull String identifier) {
        return new ExampleRecord(identifier);
    }
}
