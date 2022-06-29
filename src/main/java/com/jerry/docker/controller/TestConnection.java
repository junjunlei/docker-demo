package com.jerry.docker.controller;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author zhanbo
 * @Description TODO
 * @Date 2021-08-10 19:16
 * @Version 1.0
 **/
public class TestConnection
{

	public static void main(String[] args) throws IOException
	{
		//		Socket socket = new Socket();
		//		try
		//		{
		//			socket.connect(new InetSocketAddress("59.110.164.184", 7001));
		//			System.out.println("连接成功");
		//		} catch (IOException e)
		//		{
		//			e.printStackTrace();
		//			System.out.println("连接失败");
		//		} finally
		//		{
		//			socket.close();
		//		}

		List<String> list = new ArrayList<>();
		List<String> collect = list.stream().sorted().collect(Collectors.toList());
		System.out.println(collect);
	}
}
