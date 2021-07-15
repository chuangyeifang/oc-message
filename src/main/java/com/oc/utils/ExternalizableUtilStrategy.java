package com.oc.utils;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.Externalizable;
import java.io.IOException;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @author chuangyeifang
 * @createDate 2019年7月31日
 * @version v 1.0
 */
public interface ExternalizableUtilStrategy {

	/**
	 * 写入 string Map
	 * @param out
	 * @param stringMap
	 * @throws IOException
	 */
	void writeStringMap(DataOutput out, Map<String, String> stringMap) throws IOException;

	/**
	 * 读取 string Map
	 * @param in
	 * @return
	 * @throws IOException
	 */
	Map<String, String> readStringMap(DataInput in) throws IOException;

	/**
	 * 写入 long/int Map
	 * @param out
	 * @param integerMap
	 * @throws IOException
	 */
	void writeLongIntMap(DataOutput out, Map<String, Integer> integerMap) throws IOException;

	/**
	 * 读取 long/int Map
	 * @param in
	 * @return
	 * @throws IOException
	 */
	Map<String, Integer> readLongIntMap(DataInput in) throws IOException;

	/**
	 * 写入 string List
	 * @param out
	 * @param stringList
	 * @throws IOException
	 */
	void writeStringList(DataOutput out, List<String> stringList) throws IOException;

	/**
	 * 读取 string List
	 * @param in
	 * @return
	 * @throws IOException
	 */
	List<String> readStringList(DataInput in) throws IOException;

	/**
	 * 写入 long array
	 * @param out
	 * @param array
	 * @throws IOException
	 */
	void writeLongArray(DataOutput out, long []array) throws IOException;

	/**
	 * 读取 long array
	 * @param in
	 * @return
	 * @throws IOException
	 */
	long[] readLongArray(DataInput in) throws IOException;

	/**
	 * 写入 int
	 * @param out
	 * @param value
	 * @throws IOException
	 */
	void writeInt(DataOutput out, int value) throws IOException;

	/**
	 * 读取 int
	 * @param in
	 * @return
	 * @throws IOException
	 */
	int readInt(DataInput in) throws IOException;

	/**
	 * 写入 long
	 * @param out
	 * @param value
	 * @throws IOException
	 */
	void writeLong(DataOutput out, long value) throws IOException;

	/**
	 * 读取 long
	 * @param in
	 * @return
	 * @throws IOException
	 */
	long readLong(DataInput in) throws IOException;

	/**
	 * 写入 boolean
	 * @param out
	 * @param value
	 * @throws IOException
	 */
	void writeBoolean(DataOutput out, boolean value) throws IOException;

	/**
	 * 读取 boolean
	 * @param in
	 * @return
	 * @throws IOException
	 */
	boolean readBoolean(DataInput in) throws IOException;

	/**
	 * 写入 byte[]
	 * @param out
	 * @param value
	 * @throws IOException
	 */
	void writeByteArray(DataOutput out, byte[] value) throws IOException;

	/**
	 * 读取 byte[]
	 * @param in
	 * @return
	 * @throws IOException
	 */
	byte[] readByteArray(DataInput in) throws IOException;

	/**
	 * 写入 支持序列对象
	 * @param out
	 * @param value
	 * @throws IOException
	 */
	void writeSerializable(DataOutput out, Serializable value) throws IOException;

	/**
	 * 读取 支持序列对象
	 * @param in
	 * @return
	 * @throws IOException
	 */
	Serializable readSerializable(DataInput in) throws IOException;

	/**
	 * 写入字符串
	 * @param out
	 * @param value
	 * @throws IOException
	 */
	void writeSafeUTF(DataOutput out, String value) throws IOException;

	/**
	 * 读取字符串
	 * @param in
	 * @return
	 * @throws IOException
	 */
	String readSafeUTF(DataInput in) throws IOException;

	/**
	 * 写入 集合
	 * @param out
	 * @param value
	 * @throws IOException
	 */
	void writeExternalizableCollection(DataOutput out, Collection<? extends Externalizable> value) throws IOException;

	/**
	 * 读取集合
	 * @param in
	 * @param value
	 * @param classLoader
	 * @return
	 * @throws IOException
	 */
	int readExternalizableCollection(DataInput in, Collection<? extends Externalizable> value, ClassLoader classLoader) throws IOException;

	/**
	 * 写入 集合
	 * @param out
	 * @param value
	 * @throws IOException
	 */
	void writeSerialiazbleCollection(DataOutput out, Collection<? extends Serializable> value) throws IOException;

	/**
	 * 读取集合
	 * @param in
	 * @param value
	 * @param classLoader
	 * @return
	 * @throws IOException
	 */
	int readSerializableCollection(DataInput in, Collection<? extends Serializable> value, ClassLoader classLoader) throws IOException;
}
