package com.example.mysecondapp;

import java.util.UUID;

public interface Constants {
    public static final String BT_DEVICE = "TML";
    public static final UUID BT_UUID = UUID.fromString(
 //           "0000112F-0000-1000-8000-00805F9B34FB");
            "00001101-0000-1000-8000-00805F9B34FB");
    public static final String BT_MESS = "BT_MESS";
    public static final int MESSAGE_BT = 0;
    public static final int MESSAGE_TEMP = 2;
}
