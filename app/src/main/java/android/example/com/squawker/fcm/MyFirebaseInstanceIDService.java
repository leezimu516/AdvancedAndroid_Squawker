package android.example.com.squawker.fcm;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by kaili on 2018-01-20.
 */

public class MyFirebaseInstanceIDService extends FirebaseInstanceIdService {
	private static String LOG_TAG = MyFirebaseInstanceIDService.class.getSimpleName();

	@Override
	public void onTokenRefresh() {
		// Get updated InstanceID token.
		String refreshedToken = FirebaseInstanceId.getInstance().getToken();
		Log.d(LOG_TAG, "Refreshed token: " + refreshedToken);

		// If you want to send messages to this application instance or
		// manage this apps subscriptions on the server side, send the
		// Instance ID token to your app server.
		sendRegistrationToServer(refreshedToken);
	}

	/**
	 * Persist token to third-party servers.
	 *
	 * Modify this method to associate the user's FCM InstanceID token with any server-side account
	 * maintained by your application.
	 *
	 * @param token The new token.
	 */
	private void sendRegistrationToServer(String token) {
		// TODO: Implement this method to send token to your app server.
	}

}
