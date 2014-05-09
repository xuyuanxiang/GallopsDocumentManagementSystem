package name.xuyuanxiang.socket;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.Socket;

public class DownLoadThread extends Thread {
	private Socket socket;
	private String pathname;

	public DownLoadThread(Socket socket) {
		this.socket = socket;
		this.start();
	}

	@Override
	public void run() {
		DataOutputStream dos = null;
		DataInputStream dis = null;
		DataInputStream dataInputStream = null;
		try {
			dataInputStream = new DataInputStream(socket.getInputStream());
			pathname = dataInputStream.readUTF();
			int position = dataInputStream.readInt();
			dos = new DataOutputStream(socket.getOutputStream());
			File file = new File(pathname);
			if (file.isFile()) {
				dis = new DataInputStream(new BufferedInputStream(
						new FileInputStream(file)));
				byte[] bufArray = new byte[1024];
				int read = 0;
				while ((read = dis.read(bufArray)) != -1) {
					dos.write(bufArray, position, read);
				}
			} else {
				dos.writeUTF("文件不存在！");
			}
			dos.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (dos != null)
					dos.close();
			} catch (IOException e) {
			}
			try {
				if (dis != null)
					dis.close();
			} catch (IOException e) {
			}
			try {
				if (socket != null)
					socket.close();
			} catch (IOException e) {
			}
		}
	}
}
