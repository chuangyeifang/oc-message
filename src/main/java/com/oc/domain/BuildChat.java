package com.oc.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author chuangyeifang
 */
@Getter
@Setter
@ToString
public class BuildChat {

    private String ttc;

    private Integer tmc;

    private String tmb;

    private Integer skc;

    private String skn;

    private String gc;

    private boolean login;

    private String device;

    private String reason;

    public BuildChat() {}

    public BuildChat(String ttc, Integer tmc, String tmb, Integer skc, String skn,
                     String gc, boolean login, String device) {
        this.ttc = ttc;
        this.tmc = tmc;
        this.tmb = tmb;
        this.skc = skc;
        this.skn = skn;
        this.gc = gc;
        this.login = login;
        this.device = device;
    }

    public BuildChat(String ttc, Integer tmc, String tmb, Integer skc, String skn,
                     String gc, boolean login, String device, String reason) {
        this(ttc, tmc, tmb, skc, skn, gc, login, device);
        this.reason = reason;
    }
}
