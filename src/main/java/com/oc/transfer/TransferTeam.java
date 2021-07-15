package com.oc.transfer;

import com.oc.utils.ExternalizableUtil;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * @Description:
 * @author chuangyeifang
 * @createDate 2019年2月21日
 * @version v 1.0
 */
@SuppressWarnings("DuplicatedCode")
@Getter
@Setter
@ToString
public class TransferTeam implements Externalizable{

	private String ttc;
	private Integer tmc;
	private Integer skc;
	private String skn;
	private String uid;
	private String name;
	private String fromWc;
	private String fromWn;
	private String reason;

	public TransferTeam() {}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		ExternalizableUtil.getInstance().writeSafeUTF(out, ttc);
		ExternalizableUtil.getInstance().writeInt(out, tmc);
		ExternalizableUtil.getInstance().writeInt(out, skc);
		ExternalizableUtil.getInstance().writeSafeUTF(out, skn);
		ExternalizableUtil.getInstance().writeSafeUTF(out, uid);
		ExternalizableUtil.getInstance().writeSafeUTF(out, name);
		ExternalizableUtil.getInstance().writeSafeUTF(out, fromWc);
		ExternalizableUtil.getInstance().writeSafeUTF(out, fromWn);
		ExternalizableUtil.getInstance().writeSafeUTF(out, reason);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		this.ttc = ExternalizableUtil.getInstance().readSafeUTF(in);
		this.tmc = ExternalizableUtil.getInstance().readInt(in);
		this.skc = ExternalizableUtil.getInstance().readInt(in);
		this.skn = ExternalizableUtil.getInstance().readSafeUTF(in);
		this.uid = ExternalizableUtil.getInstance().readSafeUTF(in);
		this.name = ExternalizableUtil.getInstance().readSafeUTF(in);
		this.fromWc = ExternalizableUtil.getInstance().readSafeUTF(in);
		this.fromWn = ExternalizableUtil.getInstance().readSafeUTF(in);
		this.reason = ExternalizableUtil.getInstance().readSafeUTF(in);
	}
}
