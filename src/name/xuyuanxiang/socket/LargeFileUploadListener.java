package name.xuyuanxiang.socket;

import java.net.ServerSocket;
import java.net.Socket;
import javax.servlet.ServletContextEvent;

public class LargeFileUploadListener extends javax.servlet.http.HttpServlet
		implements javax.servlet.ServletContextListener {

	private static final long serialVersionUID = 1L;
	private static Thread thread = null;

	public void contextDestroyed(ServletContextEvent arg0) {
		if (thread != null) {
			thread = null;
		}
	}

	public void contextInitialized(ServletContextEvent arg0) {
		try {
			thread = new Thread() {
				public void run() {
					System.out.println("大文件【上传】侦听开始");
					try {
						ServerSocket serverSocket = new ServerSocket(
								Integer.parseInt("10001"));// 服务器套接字
						Socket clientSocket = null;
						while (true) {
							clientSocket = serverSocket.accept();// 获得客户端的请求的Socket
							System.out.println("上传====》已侦听到了客户端的请求。。。。。");
							new UploadThread(clientSocket);
						}
					} catch (Exception e) {
						System.err.println("10001侦听失败..");
						e.printStackTrace();
						
					}
				}
			};
			thread.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}