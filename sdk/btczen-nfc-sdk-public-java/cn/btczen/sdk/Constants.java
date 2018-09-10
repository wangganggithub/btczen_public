package cn.btczen.sdk;

public interface Constants {

    String INTENT_EXTRA_SENTENCE = "INTENT_EXTRA_SENTENCE"; // Used for create operation
    String INTENT_EXTRA_PASSWORD = "INTENT_EXTRA_PASSWORD"; // Used for sign operation
    String INTENT_EXTRA_FROM_PATH = "INTENT_EXTRA_FROM_PATH"; // for Bither & Ether
    String INTENT_EXTRA_RAW_TX_SHA256ED = "INTENT_EXTRA_RAW_TX_SHA256ED"; // for Bitcoin only
    String INTENT_EXTRA_RAW_TX_SIGNED = "INTENT_EXTRA_RAW_TX_SIGNED"; // for return values of both Bitcoin & Ether
    String INTENT_EXTRA_OLD_PWD = "INTENT_EXTRA_OLD_PWD"; // Used only for change PIN operation
    String INTENT_EXTRA_NEW_PWD = "INTENT_EXTRA_NEW_PWD"; // Used only for change PIN operation

    // for Ether only
    String INTENT_EXTRA_AMOUNT = "INTENT_EXTRA_AMOUNT";
    String INTENT_EXTRA_FROM_ADDRESS = "INTENT_EXTRA_FROM_ADDRESS";
    String INTENT_EXTRA_RAW_TX_SHA3ED = "INTENT_EXTRA_RAW_TX_SHA3ED";
    String INTENT_EXTRA_TO_ADDRESS = "INTENT_EXTRA_TO_ADDRESS";
    String INTENT_EXTRA_GAS_PRICE = "INTENT_EXTRA_GAS_PRICE";
    String INTENT_EXTRA_GAS_LIMIT = "INTENT_EXTRA_GAS_LIMIT";
    String INTENT_EXTRA_DATA = "INTENT_EXTRA_GAS_DATA"; // Ethereum Data
    String INTENT_EXTRA_PUBLIC_ADDRESS = "INTENT_EXTRA_PUBLIC_ADDRESS"; // for Ether only
    String INTENT_EXTRA_NONCE = "INTENT_EXTRA_NONCE"; // for Ether only

}
