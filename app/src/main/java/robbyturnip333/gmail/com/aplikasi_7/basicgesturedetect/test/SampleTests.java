package robbyturnip333.gmail.com.aplikasi_7.basicgesturedetect.test;

import android.test.ActivityInstrumentationTestCase2;

import robbyturnip333.gmail.com.aplikasi_7.BasicGestureDetectFragment;
import robbyturnip333.gmail.com.aplikasi_7.MainActivity;

/**
 * Created by robby on 09/05/18.
 */


public class SampleTests extends ActivityInstrumentationTestCase2<MainActivity> {

    private MainActivity mTestActivity;
    private BasicGestureDetectFragment mTestFragment;

    public SampleTests() {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();

        // Starts the activity under test using the default Intent with:
        // action = {@link Intent#ACTION_MAIN}
        // flags = {@link Intent#FLAG_ACTIVITY_NEW_TASK}
        // All other fields are null or empty.
        mTestActivity = getActivity();
        mTestFragment = (BasicGestureDetectFragment)
                mTestActivity.getSupportFragmentManager().getFragments().get(1);
    }

    /**
     * Test if the test fixture has been set up correctly.
     */
    public void testPreconditions() {
        //Try to add a message to add context to your assertions. These messages will be shown if
        //a tests fails and make it easy to understand why a test failed
        assertNotNull("mTestActivity is null", mTestActivity);
        assertNotNull("mTestFragment is null", mTestFragment);
    }

    /**
     * Add more tests below.
     */

}
