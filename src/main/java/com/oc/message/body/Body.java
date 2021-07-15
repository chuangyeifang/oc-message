package com.oc.message.body;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import com.oc.message.type.BodyType;
import com.oc.utils.ExternalizableUtil;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Description:
 * @author chuangyeifang
 * @createDate 2019年10月29日
 * @version v 1.0
 */
@Getter
@Setter
@ToString
public class Body implements Externalizable{

	private static final long serialVersionUID = 1L;
	
	private BodyType type;
	private String content;
	
	public Body() {}
	
	public Body(BodyType type) {
		this(type, null);
	}
	
	public Body(BodyType type, String content) {
		this.type = type;
		this.content = content;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		String serializableType = null;
		if (type != null) {
			serializableType = type.name();
		}
		ExternalizableUtil.getInstance().writeSafeUTF(out, serializableType);
		ExternalizableUtil.getInstance().writeSafeUTF(out, content);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException {
		String serializableType = ExternalizableUtil.getInstance().readSafeUTF(in);
		if (null != serializableType) {
			type = BodyType.valueOf(serializableType);
		} else {
			type = null;
		}
		content = ExternalizableUtil.getInstance().readSafeUTF(in);
	}
}
