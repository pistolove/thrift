package com.thirft.client.comment;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;

import com.thirft.client.user.UserClient;
import com.thirft.service.comment.CommentService;
import com.thirft.service.user.User;
import com.thirft.service.user.UserService;

public class CommentClient {
	public static final String SERVER_IP = "localhost";
	public static final int SERVER_PORT = 8090;
	public static final int TIMEOUT = 30000;
	
	
	public void startClient(String userName) {
		TTransport transport = null;
		try {
			transport = new TSocket(SERVER_IP, SERVER_PORT, TIMEOUT);
			TProtocol protocol = new TBinaryProtocol(transport);
			CommentService.Client client = new CommentService.Client(protocol);
			transport.open();
			client.addComment("hahahahahah");
			System.err.println(111);		
		} catch (TTransportException e) {
			e.printStackTrace();
		} catch (TException e) {
			e.printStackTrace();
		} finally {
			if (null != transport) {
				transport.close();
			}
		}
	}
 
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CommentClient client = new CommentClient();
		client.startClient("Michael");
 
	}
	
}
