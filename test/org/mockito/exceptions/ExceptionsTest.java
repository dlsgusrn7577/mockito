/*
 * Copyright (c) 2007 Mockito contributors 
 * This program is made available under the terms of the MIT License.
 */
package org.mockito.exceptions;

import org.junit.Test;
import org.mockito.RequiresValidState;
import org.mockito.exceptions.verification.TooLittleActualInvocationsError;


public class ExceptionsTest extends RequiresValidState {

    @Test(expected=TooLittleActualInvocationsError.class)
    public void shouldLetPassingNullLastActualStackTrace() throws Exception {
        Exceptions.tooLittleActualInvocations(1, 2, "wanted", null);
    }
}