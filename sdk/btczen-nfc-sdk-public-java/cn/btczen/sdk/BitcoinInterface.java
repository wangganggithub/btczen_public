package cn.btczen.sdk;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * BitcoinInterface NFC helper class, used to perform various operations on BtcZen card.
 * <p>
 * Android app should implements the BitcoinAdapterCallback interface, then new an instance and invoke
 * onCreate(), onResume(), onNewIntent() etc methods to access BtcZen card functionalities.
 */
public class BitcoinInterface {
    private BitcoinAdapter bitcoinAdapter;

    public enum BtczenOperations {
        IMPORT_PUBLIC(1),
        SIGN_BITCOIN(2),
        SIGN_ETHEREUM(3),
        CHANGE_PASSWORD(4),
        CREATE_HDWALLET(5),
        DELETE_HDWALLET(6),
        DELETE_SENTENCES(7);

        private int intValue;
        BtczenOperations(int intValue) {
            this.intValue = intValue;
        }

        public int value() {
            return intValue;
        }
    }

    public BitcoinInterface(Activity activity, BitcoinCallbackInterface callback, BtczenOperations operation) {
        bitcoinAdapter = new BitcoinAdapter(activity, callback, operation.value());
    }

    public void onCreate(Bundle bundle) {
        bitcoinAdapter.onCreate(bundle);
    }

    public void onNewIntent(Intent intent) {
        bitcoinAdapter.onNewIntent(intent);
    }

    public void onPause() {
        bitcoinAdapter.onPause();
    }

    public void onResume() {
        bitcoinAdapter.onResume();
    }

    public void setBundle(Bundle bundle) {
        bitcoinAdapter.setBundle(bundle);
    }
}

