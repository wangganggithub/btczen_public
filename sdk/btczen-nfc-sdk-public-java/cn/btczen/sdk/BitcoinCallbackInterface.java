package cn.btczen.sdk;

/*
  Activity shall implements this interface, to receive operations notice from BtcZen library,
  and so as to info the current status what operations are executing.

  @author BtcZen.cn
 */


import android.os.Bundle;

public interface BitcoinCallbackInterface {

    /**
     * Invoked when BtcZen library tries to get default NFC adapter but failed.
     *
     * Android app should notice user to confirm if the mobile handset supports NFC functions,
     * or NFC functions already turned on, or NFC permission has been granted to this app.
     *
     * This callback typically will be invoked while app is executing OnCreate(), but not limits to that.
     */
    void onGetDefaultNfcAdapterFailed();

    /**
     * Invoked when BtcZen library tries to get default NFC adapter and succeed.
     *
     * Android app can simply omit this event and does nothing.
     * This callback typically will be invoked while app is executing OnCreate(), but not limits to that.
     */
    void onGetDefaultNfcAdapterSucceed();

    /**
     * Invoked when BtcZen library is stopped because NFC functions of user mobile handset not yet turned on.
     *
     * Android app should notice user to confirm if the mobile handset supports NFC functions,
     * or NFC functions already turned on, or NFC permission has been granted to this app.
     *
     * Note that this callback may be invoked for not only one time, while app executing onResume(), onPause() and so on.
     */
    void onNfcAdapterDisabled();

    /**
     * Invoked when BtcZen library finish all operations on BtcZen cards, and succeed.
     */
    void onTagOperationStarted();

    /**
     * Invoked when BtcZen library finish all operations on BtcZen cards, and succeed.
     */
    void onTagOperationSucceed(Bundle btczen_bundle);

    /**
     * Invoked when BtcZen library can't execute operations due to any NFC communication problem.
     *
     * @param info exception information
     */
    void onPcscException(String info);

    /**
     * Invoked when BtcZen library can't execute operations due to any Android OS problem.
     *
     * @param info exception information
     */
    void onIOException(String info);

    /**
     * Invoked when BtcZen library can't execute operations due to BtcZen card problem, for example,
     * wrong card used, wrong Btczen card PIN entered. App should promote user to confirm if they
     * use the right card, if corrent PIN entered.
     */
    void onPleaseTapAgain();

}
