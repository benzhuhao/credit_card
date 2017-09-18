package com.credit_card;

import java.util.UUID;
import java.util.logging.Logger;

public class ResponseInfo {

    // Prefix for all message strings. [C]redit [C]ard
    private static final String APPLICATION_CODE = "CC";
    private static final String CLASS_NAME = "CC." + ResponseInfo.class.getSimpleName();
    private static final Logger log = Logger.getLogger(CLASS_NAME);

    public String message;
    public String requestId;
    public String code;
    public Type type;

    public ResponseInfo(Type type, String msg, int code) {
        this.type = type;
        this.message = msg;
        this.requestId = UUID.randomUUID().toString();
        this.code = buildCode(code);
    }

    public String getMessage() {
        return message;
    }

    public String getRequestId() {
        return requestId;
    }

    public Type getType() {
        return type;
    }

    private String buildCode(int code) {
        //String.format will take the code and prepend '0's until it is 3 characters long.
        //Example of output: CC101I.
        return APPLICATION_CODE + String.format("%03d", code) + this.type.toString();
    }

    public ResponseInfo logInfo() {
        log.info(this.toString());
        return this;
    }

    @Override
    public String toString() {
        return "[" + this.code + "] Request " + requestId + " " + message;
    }

    public enum Type {
        INFO("I"), WARNING("W"), ERROR("E");

        private final String name;

        Type(String name) {
            this.name = name;
        }
    }
}
