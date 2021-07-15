package com.oc.message;

import com.oc.message.type.Identity;
import com.oc.utils.ExternalizableUtil;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * @Description: 消息to
 * @author chuangyeifang
 * @createDate 2019年9月19日
 * @version v 1.0
 */
@SuppressWarnings("unused")
@Getter
@Setter
@ToString
public class AddressTo implements Externalizable{
	
	private String uid;
	private String name;
	private Identity idy;
	
	public AddressTo() {}

	public AddressTo(Identity idy) {
		this.idy = idy;
	}
	
	public AddressTo(String uid, Identity idy) {
		this.uid = uid;
		this.idy = idy;
	}
	
	public AddressTo(String uid, String name, Identity idy) {
		this.uid = uid;
		this.idy = idy;
		this.name = name;
	}
	
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		String serializableIdy = null;
		if (null != idy) {
			serializableIdy = idy.name();
		}
		ExternalizableUtil.getInstance().writeSafeUTF(out, serializableIdy);
		ExternalizableUtil.getInstance().writeSafeUTF(out, uid);
		ExternalizableUtil.getInstance().writeSafeUTF(out, name);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException {
		String readIdy = ExternalizableUtil.getInstance().readSafeUTF(in);
		if (null != readIdy) {
			idy = Identity.valueOf(readIdy);
		} else {
			idy = null;
		}
		uid = ExternalizableUtil.getInstance().readSafeUTF(in);
		name = ExternalizableUtil.getInstance().readSafeUTF(in);
	}
}
