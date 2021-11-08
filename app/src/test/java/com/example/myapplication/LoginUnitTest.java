package com.example.myapplication;

import android.content.Context;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;

@RunWith(MockitoJUnitRunner.class)
public class LoginUnitTest {

    private static final String FAKE_STRING = "Login was successful";
    private static final String valid_email = "true";
    private static final String not_valid_email = "false";

    @Mock
    Context mMockContext;

    @Test
    public void readStringFromContext_LocalizedString() {

        LoginActivity myObjectUnderTest = new LoginActivity(mMockContext);

        // ...when the string is returned from the object under test...
        String result = myObjectUnderTest.validate("admin","admin");

        // ...then the result should be the expected one.
        assertThat(result, is(FAKE_STRING));
    }

    @Test
    public void testIsEmail(){ //testing if is email with valid input
        LoginActivity myObjectUnderTest = new LoginActivity(mMockContext);
        String email = "test@gmail.com";
        Boolean result = myObjectUnderTest.isEmail(email);
        assertThat(true, result);

    }

    @Test
    public void testIsNotEmail(){ //testing is email with invalid input
        LoginActivity myObjectUnderTest = new LoginActivity(mMockContext);
        String email = "test";
        Boolean result = myObjectUnderTest.isEmail(email);
        assertEquals(false, result);
    }
}
