package com.thirft.test;

import java.util.ArrayList;
import java.util.List;

public class EasyParallelOld {

	public byte[] placeHolder = new byte[64 * 1024]; // 占位符

	public static void main(String[] args) throws Exception {

		outOfMemoryByExpansionSize();

	}

	private static void outOfMemoryByExpansionSize() throws Exception {

		List<EasyParallelOld> list = new ArrayList<EasyParallelOld>();

		while (true) {

			EasyParallelOld serial = new EasyParallelOld();

			list.add(serial);

			Thread.sleep(10);// 停顿10毫秒

		}

	}

}




