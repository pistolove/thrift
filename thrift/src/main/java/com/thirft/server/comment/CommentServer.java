package com.thirft.server.comment;

import org.apache.thrift.TProcessor;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;

import com.thirft.service.comment.CommentService;
import com.thirft.service.comment.impl.CommentImpl;

public class CommentServer{
	public void startServer() {
		try {
			TServerSocket serverTransport = new TServerSocket(8090);
			TProcessor tprocessor = new CommentService.Processor(new CommentImpl());
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
		CommentServer server = new CommentServer();
		server.startServer();
	}
}
