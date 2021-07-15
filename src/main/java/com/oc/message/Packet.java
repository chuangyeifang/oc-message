package com.oc.message;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.oc.message.body.Body;
import com.oc.message.type.PacketType;
import com.oc.message.type.Transport;
import com.oc.utils.DateFormat;
import com.oc.utils.ExternalizableUtil;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Description: 消息
 * @author chuangyeifang
 * @createDate 2019年7月19日
 * @version v 1.0
 */
@SuppressWarnings("unused")
@Getter
@Setter
@ToString
public class Packet implements Externalizable{

	private static final long serialVersionUID = 1L;
	
	private String pid;
	private String cid;
	@JsonIgnore
	private String ttc;
	@JsonIgnore
	private Integer tmc;
	private PacketType type;
	private AddressTo to;
	private AddressFrom from;
	private Body body;
	private Transport ts;
	private long timestamp;
	private String datetime;
	private String ver = "1.0";
	
	public Packet() {
		Date date = new Date();
		this.timestamp = date.getTime();
		this.datetime = DateFormat.getStringDate(date);
	}
	
	public Packet(PacketType type) {
		this();
		this.type = type;
	}
	
	public Packet(PacketType type, Body body) {
		this();
		this.type = type;
		this.body = body;
	}
	
	public Packet(PacketType type, AddressFrom from, Body body) {
		this();
		this.type = type;
		this.from = from;
		this.body = body;
	}
	
	public Packet(PacketType type, AddressTo to, Body body) {
		this();
		this.type = type;
		this.to = to;
		this.body = body;
	}
	
	public Packet(PacketType type, AddressFrom from, AddressTo to, Body body) {
		this();
		this.type = type;
		this.from = from;
		this.to = to;
		this.body = body;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		String serializableType = null;
		if (type != null) {
			serializableType = type.name();
		}
		ExternalizableUtil.getInstance().writeSafeUTF(out, serializableType);
		String serializableTs = null;
		if (null != ts) {
			serializableTs = ts.name();
		}
		ExternalizableUtil.getInstance().writeSafeUTF(out, serializableTs);

		ExternalizableUtil.getInstance().writeSerializable(out, from);
		ExternalizableUtil.getInstance().writeSerializable(out, to);
		ExternalizableUtil.getInstance().writeLong(out, timestamp);
		ExternalizableUtil.getInstance().writeSafeUTF(out, pid);
		ExternalizableUtil.getInstance().writeSafeUTF(out, cid);
		ExternalizableUtil.getInstance().writeSafeUTF(out, datetime);
		ExternalizableUtil.getInstance().writeSafeUTF(out, ver);
		ExternalizableUtil.getInstance().writeSafeUTF(out, ttc);
		ExternalizableUtil.getInstance().writeInt(out, tmc);
		ExternalizableUtil.getInstance().writeSerializable(out, body);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException {
		String serializableType = ExternalizableUtil.getInstance().readSafeUTF(in);
		if (null != serializableType) {
			type = PacketType.valueOf(serializableType);
		} else {
			type = null;
		}
		String serializableTs = ExternalizableUtil.getInstance().readSafeUTF(in);
		if (null != serializableTs) {
			ts = Transport.valueOf(serializableTs);
		} else {
			ts = null;
		}
		from = (AddressFrom)ExternalizableUtil.getInstance().readSerializable(in);
		to = (AddressTo)ExternalizableUtil.getInstance().readSerializable(in);
		timestamp = ExternalizableUtil.getInstance().readLong(in);
		pid = ExternalizableUtil.getInstance().readSafeUTF(in);
		cid = ExternalizableUtil.getInstance().readSafeUTF(in);
		datetime = ExternalizableUtil.getInstance().readSafeUTF(in);
		ver = ExternalizableUtil.getInstance().readSafeUTF(in);
		ttc = ExternalizableUtil.getInstance().readSafeUTF(in);
		tmc = ExternalizableUtil.getInstance().readInt(in);
		body = (Body)ExternalizableUtil.getInstance().readSerializable(in);
	}
}
