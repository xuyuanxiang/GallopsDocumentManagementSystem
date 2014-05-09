package name.xuyuanxiang.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.net.Socket;

public class PolicyUploadThread extends Thread {

	private Socket socket;

	private final String policy_xml = "<policy-file-request/>";
	private final String cross_xml = "<?xml version=\"1.0\"?>"
			+ "<cross-domain-policy>"
			+ "<site-control permitted-cross-domain-policies=\"all\"/>"
			+ "<allow-access-from domain=\"*\" to-ports=\"10001\"/>"
			+ "<allow-access-from domain=\"*\" to-ports=\"10002\"/>"
			+ "</cross-domain-policy>\0";

	public PolicyUploadThread(Socket socket) {
		this.socket = socket;
		this.start();
	}

	@Override
	public void run() {
		try {
			BufferedReader readerIn = new BufferedReader(new InputStreamReader(
					socket.getInputStream()));
			PrintStream printOut = new PrintStream(socket.getOutputStream());

			char[] by = new char[22];
			readerIn.read(by, 0, 22);
			String s = new String(by);
			if (s.equals(policy_xml)) {
				System.out.println("接收policy-file-request认证");
				printOut.print(cross_xml);
				printOut.flush();
				readerIn.close();
				printOut.close();
				socket.close();
				System.out.println("完成policy-file-request认证");
			}

		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
