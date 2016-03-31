package com.thirft.server.user;

import org.apache.thrift.TProcessor;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;

import com.thirft.service.user.UserService;
import com.thirft.service.user.impl.UserImpl;

public class UserServer {
public static final int SERVER_PORT = 8090; 
	public void startServer() {
		try {
			TServerSocket serverTransport = new TServerSocket(SERVER_PORT);
			TProcessor tprocessor = new UserService.Processor(new UserImpl());
			TServer.Args tArgs = new TServer.Args(serverTransport);
			tArgs.processor(tprocessor);
			tArgs.protocolFactory(new TBinaryProtocol.Factory());
			TServer server = new TSimpleServer(tArgs);
			server.serve();
			System.err.println("server start ");
		} catch (Exception e) {
			System.out.println("Server start error!!!");
			e.printStackTrace();
		}
	}
 
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		UserServer server = new UserServer();
		server.startServer();
	}
}
